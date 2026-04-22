"""AutoDriveKit 入口：先检查 Typer，再加载实际 CLI（_cli_impl）。"""

from __future__ import annotations

import sys

from autodrivekit import bootstrap


def main() -> None:
    if not bootstrap.ensure_typer_available():
        bootstrap.print_missing_typer_message()
        if bootstrap.prompt_install_editable():
            rc = bootstrap.run_pip_install_editable()
            if rc == 0:
                bootstrap.reexec_autodrivekit_cli()
            sys.stderr.write(f"\n  安装失败（退出码 {rc}）。请根据上文日志排查后重试。\n\n")
            raise SystemExit(rc)
        raise SystemExit(1)

    # 让父进程与工具子进程读到同一份用户配置/数据目录；
    # 未设置时 _load_project_keys 等父进程逻辑会回退到 bundle，导致用户配置里的项目不显示。
    import os
    from autodrivekit.user_layout import user_config_dir, user_data_dir

    os.environ["AUTODRIVEKIT_USER_CONFIG_DIR"] = str(user_config_dir())
    os.environ["AUTODRIVEKIT_USER_DATA_DIR"] = str(user_data_dir())

    try:
        from autodrivekit.config_migrate import run_startup_migrations

        run_startup_migrations()
    except Exception as exc:
        sys.stderr.write(
            f"\n  [adk] 配置检查/迁移未完全成功（可继续运行）: {exc}\n\n"
        )

    from autodrivekit._cli_impl import run

    run()


if __name__ == "__main__":
    main()
