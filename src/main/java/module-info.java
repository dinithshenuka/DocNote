module dinith.docapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens dinith.docapp to javafx.fxml;
    exports dinith.docapp;
    exports dinith.docapp.Controllers;
    opens dinith.docapp.Controllers to javafx.fxml;
}