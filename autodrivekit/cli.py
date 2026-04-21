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
