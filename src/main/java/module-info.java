module com.example.test_gui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.test_gui to javafx.fxml;
    exports com.example.test_gui;
}