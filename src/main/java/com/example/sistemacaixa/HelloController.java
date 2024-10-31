package com.example.sistemacaixa;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class HelloController {

    @FXML
    protected void onCaixaButtonClick() throws IOException {
            new JanelaCaixa();
    }
    @FXML
    protected void onVerificadorPrecoButtonClick() throws IOException {
            new JanelaVerificaPreco();
    }
    @FXML
    protected void onSobreSistemaButtonClick(){

    }
    @FXML
    protected void onSairButtonClick(){
        System.exit(0);
    }
}