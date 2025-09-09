package com.example.escriturarapida_thegame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Font;

import java.io.IOException;
import java.net.URL;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        /*
        URL fontUrl = getClass().getResource("/com/example/escriturarapida_thegame/fonts/RussoOne-Regular.ttf");
        Font loaded = Font.loadFont(fontUrl.toExternalForm(), 14);
        */

        Font font = Font.loadFont(getClass().getResourceAsStream("/com/example/escriturarapida_thegame/fonts/RussoOne-Regular.ttf"), 14);


        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/com/example/escriturarapida_thegame/fxml/menu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}