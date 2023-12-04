module tictactoe {
    requires javafx.fxml;
    requires javafx.controls;
    opens com.successdca.tictactoe to javafx.fxml;
    exports com.successdca.tictactoe;
}