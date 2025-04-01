package com.eventpro;

import java.io.IOException;
import javafx.fxml.FXML;
import java.util.ArrayList;

import com.eventpro.management.Evento;
import com.eventpro.management.Luogo;
import com.eventpro.management.Biglietto;
import javafx.scene.control.ListView;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

/**
 * * BigliettiController
 * * Autore: Porta Solestà
 * * Data: 2025-04-01
 * * Descrizione: Questa classe gestisce la schermata dei biglietti.
 * * Permette di visualizzare i biglietti, filtrare i biglietti online e passare
 * alla schermata di creazione di un nuovo biglietto.
 */
public class BigliettiController {

    @FXML
    ListView partecipantiListView;

    @FXML
    private void handleVisualizzaPartecipanti() {
        partecipantiListView.getItems().clear();
        for (Biglietto biglietto : App.currentEvento.biglietti.getBiglietti()) {
            HBox itemBox = new HBox();
            Label itemLabel = new Label(biglietto.toString());
            itemLabel.setStyle("-fx-background-color:" + biglietto.getSettore().getColoreSettore() + "; -fx-padding: 5px;");
            itemBox.getChildren().add(itemLabel);
            partecipantiListView.getItems().add(itemBox);
            //partecipantiListView.getItems().add(biglietto.toString());
        }
    }

    @FXML
    private void switchToCreaPartecipante() throws IOException {
        App.setRoot("creaBiglietto");
    }

    @FXML
    private void handleFiltraPartecipanti() {
        partecipantiListView.getItems().clear();
        ArrayList<Biglietto> bigliettiOnline = new ArrayList<Biglietto>();
        for (Biglietto biglietto : App.currentEvento.biglietti.getBiglietti()) {
            if (biglietto.isOnline()) {
                bigliettiOnline.add(biglietto);
                partecipantiListView.getItems().add(biglietto.toString());
            }
        }
    }

    @FXML
    private void switchToEventi() throws IOException {
        App.setRoot("eventi");
    }
}