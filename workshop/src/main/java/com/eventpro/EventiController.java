package com.eventpro;

import java.io.IOException;
import javafx.fxml.FXML;
import java.util.ArrayList;

import com.eventpro.management.Evento;
import com.eventpro.management.Luogo;
import javafx.scene.control.ListView;
import javafx.scene.control.Label;

public class EventiController {


    // inizializzazione interfaccia
    @FXML private ListView eventiListView;
    @FXML private Label noteLabel;

    @FXML
    private void switchToCreaEvento() throws IOException {
        App.setRoot("creaEvento");
    }

    @FXML
    private void switchToBiglietti() throws IOException {
        App.setRoot("biglietti");
    }

    @FXML
    private void handleVisualizzaEventi(){
        eventiListView.getItems().clear();
        for (Evento evento : App.eventi.getEventi()){            
            eventiListView.getItems().add(evento.toString());
        }
    }
    
    @FXML
    private void handleFiltraEventi(){
        
    }

    @FXML
    private void handleDettagliEvento(){
        Evento eventoSelezionato = (Evento)App.eventi.getEvento(eventiListView.getSelectionModel().getSelectedIndex());
        if (eventoSelezionato != null){
            noteLabel.setText(eventoSelezionato.getNote());
        }
        App.currentEvento = eventoSelezionato;
    }
}
