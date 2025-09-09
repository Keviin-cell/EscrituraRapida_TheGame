package com.example.escriturarapida_thegame.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

public class ViewLoader {

    public static void show(String fxmlFile, Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(ViewLoader.class.getResource(
                    "/com/example/escriturarapida_thegame/fxml/" + fxmlFile));
            Parent root = loader.load();
            stage.setTitle("Escritura rapida");
            stage.setScene(new Scene(root));
            stage.getIcons().add(new Image(Objects.requireNonNull(
                    ViewLoader.class.getResourceAsStream("/com/example/escriturarapida_thegame/images/icon-game.png")
            )));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
