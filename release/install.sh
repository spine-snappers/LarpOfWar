#!/usr/bin/env sh
set -e

SCRIPT_DIR="$(CDPATH= cd -- "$(dirname -- "$0")" && pwd)"
INSTALL_DIR="$HOME/.local/bin"

mkdir -p "$INSTALL_DIR"

cp "$SCRIPT_DIR/LarpOfWar.jar" "$INSTALL_DIR/LarpOfWar.jar"
cp "$SCRIPT_DIR/larpofwar" "$INSTALL_DIR/larpofwar"
chmod +x "$INSTALL_DIR/larpofwar"

echo "Installed to $INSTALL_DIR"
echo
echo "Run it with:"
echo "  larpofwar -r"
echo
echo "If that command is not found, add this directory to PATH:"
echo "  $INSTALL_DIR"