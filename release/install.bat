@echo off
set INSTALL_DIR=%USERPROFILE%\LarpOfWar

if not exist "%INSTALL_DIR%" mkdir "%INSTALL_DIR%"

copy /Y "%~dp0LarpOfWar.jar" "%INSTALL_DIR%\LarpOfWar.jar" >nul
copy /Y "%~dp0larpofwar.bat" "%INSTALL_DIR%\larpofwar.bat" >nul

echo Installed to %INSTALL_DIR%
echo.
echo Run it with:
echo   "%INSTALL_DIR%\larpofwar.bat" -r
echo.
echo If you want to run it from any folder, add this directory to PATH:
echo   %INSTALL_DIR%