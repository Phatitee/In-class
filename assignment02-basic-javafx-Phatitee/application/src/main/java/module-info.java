module ku.cs.application {
    requires javafx.controls;
    requires javafx.fxml;


    opens ku.cs.application to javafx.fxml;
    exports ku.cs.application;
    exports ku.cs.controllers;
    opens ku.cs.controllers to javafx.fxml;
}