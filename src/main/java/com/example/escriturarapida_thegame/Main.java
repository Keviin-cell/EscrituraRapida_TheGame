package com.example.escriturarapida_thegame;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.text.Font;

import java.io.IOException;

import com.example.escriturarapida_thegame.view.ViewLoader;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Font font = Font.loadFont(getClass().getResourceAsStream("/com/example/escriturarapida_thegame/fonts/RussoOne-Regular.ttf"), 14);

        ViewLoader.show("menu-view.fxml",stage);
    }

    public static void main(String[] args) {
        launch();
    }
}