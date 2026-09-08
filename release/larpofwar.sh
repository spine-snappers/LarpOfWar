#!/usr/bin/env sh
SCRIPT_DIR="$(CDPATH= cd -- "$(dirname -- "$0")" && pwd)"
java -jar "$SCRIPT_DIR/LarpOfWar.jar" "$@"