module main.codelab2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens main.codelab2 to javafx.fxml;
    exports main.codelab2;
}