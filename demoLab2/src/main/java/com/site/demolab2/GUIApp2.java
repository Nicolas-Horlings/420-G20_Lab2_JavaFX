package com.site.demolab2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GUIApp2 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("gui2.fxml"));
        primaryStage.setTitle("GUI2");
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
