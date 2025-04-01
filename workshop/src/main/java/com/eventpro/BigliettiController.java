package com.eventpro;

import java.io.IOException;
import javafx.fxml.FXML;
import java.util.ArrayList;

import com.eventpro.management.Evento;
import com.eventpro.management.Luogo;
import com.eventpro.management.Biglietto;
import javafx.scene.control.ListView;

public class BigliettiController {

    @FXML ListView partecipantiListView;

    @FXML
    private void handleVisualizzaPartecipanti(){
        partecipantiListView.getItems().clear();
        for (Biglietto biglietto : App.currentEvento.biglietti.getBiglietti()){            
            partecipantiListView.getItems().add(biglietto.toString());
        }
    }

    @FXML
    private void switchToCreaPartecipante() throws IOException {
        App.setRoot("creaBiglietto");
    }

    @FXML
    private void handleFiltraPartecipanti(){
        partecipantiListView.getItems().clear();
        ArrayList<Biglietto> bigliettiOnline = new ArrayList<Biglietto>();
        for (Biglietto biglietto : App.currentEvento.biglietti.getBiglietti()){
            if (biglietto.isOnline()){
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