package com.moriya;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("Moriya Music - JPro Funcionando!");
        label.setStyle("-fx-font-size: 24px; -fx-text-fill: white;");
        
        StackPane root = new StackPane(label);
        root.setStyle("-fx-background-color: #1a1a2e;");
        
        Scene scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Teste Moriya");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
