package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.getIcons().add(new Image("/image/icon.jpg"));
        primaryStage.setResizable(false);
        primaryStage.setTitle("Создание простейшей программы");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
