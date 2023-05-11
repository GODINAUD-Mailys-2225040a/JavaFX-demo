module com.example.td1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.td1 to javafx.fxml;
    exports com.example.td1;

    exports com.example.partie1;
    exports com.example.partie2;
}

