module com.forlearn {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.forlearn to javafx.fxml;
    exports com.forlearn;
}
