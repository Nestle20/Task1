module com.example.task1ing {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task1ing to javafx.fxml;
    exports com.example.task1ing;
}