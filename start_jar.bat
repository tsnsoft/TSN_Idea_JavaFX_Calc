@echo off

cd /d "%~dp0out\artifacts\JavaFxApplication_jar"
set PATH="C:\Program Files\Java\javafx-sdk-21\bin";%PATH%
java --module-path . ^
     --add-modules javafx.controls,javafx.fxml,javafx.graphics,javafx.base ^
     --add-opens javafx.graphics/javafx.scene=ALL-UNNAMED ^
     -jar JavaFxApplication.jar
