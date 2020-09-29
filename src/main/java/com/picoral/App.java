package com.picoral;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage window) throws Exception {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("views/main.fxml"));
            window.setTitle("Hello World!");
            window.setScene(new Scene(root));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        window.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
