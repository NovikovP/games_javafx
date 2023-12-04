module puzzle {
    requires javafx.fxml;
    requires javafx.controls;
    opens com.successdca.packman to javafx.fxml;
    exports com.successdca.packman;
}