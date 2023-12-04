module chess {
    requires javafx.fxml;
    requires javafx.controls;
    opens com.successdca.chess to javafx.fxml;
    exports com.successdca.chess;
}