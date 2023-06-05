module com.example.rental {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.rental to javafx.fxml;
    exports com.example.rental;
}