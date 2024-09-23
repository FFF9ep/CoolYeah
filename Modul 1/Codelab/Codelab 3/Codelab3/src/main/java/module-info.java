module main.codelab3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens main.codelab3 to javafx.fxml;
    exports main.codelab3;
}