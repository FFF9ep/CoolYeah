module main.codelab1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens main.codelab1 to javafx.fxml;
    exports main.codelab1;
}