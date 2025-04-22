module PharmacyManagementSystem {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires java.sql;

    opens pharmacymanagementsystem;
    exports org.example.pharmacymanagementsystem;
}