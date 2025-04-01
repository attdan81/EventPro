package com.eventpro;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class CreaEventoController {

    @FXML
    private TextField nomeEvento;
    @FXML
    private ComboBox luogoEvento;

    @FXML
    private void switchToEventi() throws IOException {
        // creare l'evento con i parametri

        App.setRoot("eventi");
    }
}