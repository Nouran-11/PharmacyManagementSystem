module PharmacyManagementSystem {
    requires javafx.controls;
    requires javafx.fxml;

    // Add other required dependencies
    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    // Export and open the package
    exports org.example.pharmacymanagementsystem;
    opens org.example.pharmacymanagementsystem to javafx.fxml;
}