module com.example.rpginterface {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.rpginterface to javafx.fxml;
    exports com.example.rpginterface;
}