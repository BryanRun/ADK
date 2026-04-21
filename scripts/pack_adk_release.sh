#!/usr/bin/env bash
# 将当前 AutoDriveKit 源码树打成发布 tar.gz，输出到开发路径上一层的 adk-releases/。
# 用法：在仓库根执行  ./scripts/pack_adk_release.sh

set -euo pipefail
ROOT="$(cd "$(dirname "$0")/.." && pwd)"
REL="$(cd "$ROOT/.." && pwd)/adk-releases"
VERSION="$(grep -m1 '^version' "$ROOT/pyproject.toml" | sed 's/.*= *"\(.*\)".*/\1/')"
NAME="autodrivekit-${VERSION}.tar.gz"
OUT="$REL/$NAME"

mkdir -p "$REL"
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
  .

sha256sum "$OUT" | awk '{print $1 "  '"$NAME"'"}' > "$REL/${NAME}.sha256"
echo "  sha256 已写入: $REL/${NAME}.sha256"

TMP="$(mktemp -d)"
tar -xzf "$OUT" -C "$TMP"
test -f "$TMP/pyproject.toml"
rm -rf "$TMP"
echo "  解压校验: OK"
echo "  下一步（可选）: FEISHU_APP_ID/FEISHU_APP_SECRET 已配置时执行"
echo "    python3 scripts/publish_release_feishu.py"
