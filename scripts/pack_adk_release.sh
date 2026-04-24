#!/usr/bin/env bash
# 将当前 AutoDriveKit 源码树打成发布 tar.gz，输出到仓库根目录下的 release/。
# 用法：在仓库根执行  ./scripts/pack_adk_release.sh

set -euo pipefail
ROOT="$(cd "$(dirname "$0")/.." && pwd)"
REL="$ROOT/release"
VERSION="$(grep -m1 '^version' "$ROOT/pyproject.toml" | sed 's/.*= *"\(.*\)".*/\1/')"
NAME="autodrivekit-${VERSION}.tar.gz"
OUT="$REL/$NAME"

mkdir -p "$REL"
# 清理旧版本产物
rm -f "$REL"/autodrivekit-*.tar.gz "$REL"/autodrivekit-*.tar.gz.sha256 "$REL"/manifest-*.json
echo "  版本: $VERSION"
echo "  输出: $OUT"

cd "$ROOT"
tar -czf "$OUT" \
  --exclude='./.git' \
  --exclude='./__pycache__' \
  --exclude='*/__pycache__' \
  --exclude='./autodrivekit.egg-info' \
  --exclude='./.venv' \
  --exclude='./venv' \
  --exclude='./.pytest_cache' \
  --exclude='./.cursor' \
  --exclude='./.mypy_cache' \
  --exclude='./dist' \
  --exclude='./build' \
  --exclude='./release' \
  .

# 对源码文件树计算 sha256（排除 xlsx 等会被飞书改写的二进制文件）
PYTHONPATH="$ROOT" python3 -c "
import sys
from autodrivekit.archive_hash import sha256_tar_tree
from pathlib import Path
sha = sha256_tar_tree(Path(sys.argv[1]))
print(sha + '  ' + sys.argv[2])
" "$OUT" "$NAME" > "$REL/${NAME}.sha256"
echo "  sha256（源码文件树）已写入: $REL/${NAME}.sha256"

TMP="$(mktemp -d)"
tar -xzf "$OUT" -C "$TMP"
test -f "$TMP/pyproject.toml"
rm -rf "$TMP"
echo "  解压校验: OK"
echo "  下一步（可选）: FEISHU_APP_ID/FEISHU_APP_SECRET 已配置时执行"
echo "    python3 scripts/publish_release_feishu.py"
