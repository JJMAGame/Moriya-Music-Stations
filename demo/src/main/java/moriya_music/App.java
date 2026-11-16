package moriya_music;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("Moriya Tracker no Navegador!");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 600, 400);
        
        stage.setScene(scene);
        stage.setTitle("Teste JPro");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
