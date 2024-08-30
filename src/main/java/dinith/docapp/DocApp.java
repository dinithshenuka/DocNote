package dinith.docapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DocApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(DocApp.class.getResource("/FXML/FirstStage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add("Style.css");
        stage.setTitle("DocApp");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}