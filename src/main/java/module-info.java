module com.example.escriturarapida_thegame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.escriturarapida_thegame to javafx.fxml;
    exports com.example.escriturarapida_thegame;
}