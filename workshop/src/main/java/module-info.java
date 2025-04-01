module com.eventpro {
    requires javafx.controls;
    requires javafx.fxml;

    requires transitive javafx.graphics;

    opens com.eventpro to javafx.fxml;
    exports com.eventpro;
}
