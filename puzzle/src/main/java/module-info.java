module puzzle {
    requires javafx.fxml;
    requires javafx.controls;
    opens com.successdca.puzzle to javafx.fxml;
    exports com.successdca.puzzle;
}