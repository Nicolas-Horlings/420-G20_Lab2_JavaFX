package com.site.demolab2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class GUIController2 {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label outputLabel;

    @FXML
    private void handleSingIn() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        outputLabel.setText("Username: " + username + "\nPassword: " + password);
    }

    @FXML
    private void handleClear() {
        usernameField.clear();
        passwordField.clear();
        outputLabel.setText("");
    }

    @FXML
    private void handleExit() {
        Stage stage = (Stage) usernameField.getScene().getWindow();
        stage.close();
    }
}