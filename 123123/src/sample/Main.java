package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Med Laboratory №20");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        primaryStage.getIcons().add(new Image("file:logo.png"));
    }


    public static void main(String[] args) {
        launch(args);
    }
}
