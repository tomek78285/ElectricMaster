package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("sample.fxml"));
        StackPane stackPane = loader.load();
        Scene scene = new Scene(stackPane, 1250, 1000);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Electric Master");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
