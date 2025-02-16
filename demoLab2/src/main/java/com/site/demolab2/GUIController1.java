package com.site.demolab2;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class GUIController1 {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button handleSingIn() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Login Information");
        alert.setHeaderText(null);
        alert.setContentText("Username: " + username + "\nPassword: " + password);
        alert.showAndWait();
        return null;
    }
}
