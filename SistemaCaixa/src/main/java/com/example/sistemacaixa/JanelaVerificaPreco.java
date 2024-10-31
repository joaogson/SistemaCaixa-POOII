package com.example.sistemacaixa;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class JanelaVerificaPreco extends Stage {
    public JanelaVerificaPreco() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("verificaPreco-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        this.setScene(scene);
        this.show();
    }
}
