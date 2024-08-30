package dinith.docapp.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FirstStageController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    //First Stage ---> New Patient
    public void switchToNew(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/NewPatient.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //First Stage ---> Existing Patient
    public void switchToExisting(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/ExistingPatient.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}