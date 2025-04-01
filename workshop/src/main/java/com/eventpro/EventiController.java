package com.eventpro;

import java.io.IOException;
import javafx.fxml.FXML;
import java.util.ArrayList;

import com.eventpro.management.Evento;
import com.eventpro.management.Luogo;
import javafx.scene.control.ListView;
import javafx.scene.control.Label;

/**
 * * EventiController
 * * * Autore: Porta Solestà
 * * * Data: 2025-04-01
 * * * Descrizione: Questa classe gestisce la schermata degli eventi.
 * * * Permette di visualizzare gli eventi, filtrare gli eventi e passare alla schermata di creazione di un nuovo evento.
 * * * Permette di visualizzare i dettagli di un evento selezionato.
 */
public class EventiController {


    // inizializzazione interfaccia    
    @FXML private ListView eventiListView;
    @FXML private Label noteLabel;

    // inizializza schermata iniziale
    @FXML
    public void initialize() {
        handleVisualizzaEventi();
    }

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
        eventiListView.getItems().clear();
        ArrayList<Evento> eventiDisponibili = new ArrayList<Evento>();
        for (Evento evento : App.eventi.getEventi()){     
            if(evento.bigliettiDisponibili() > 0){  
                eventiDisponibili.add(evento);     
                eventiListView.getItems().add(evento.toString());
            }
        }
    }

    @FXML
    private void handleDettagliEvento(){
        Evento eventoSelezionato = (Evento)App.eventi.getEvento(eventiListView.getSelectionModel().getSelectedIndex());
        if (eventoSelezionato != null){
            noteLabel.setText(eventoSelezionato.getNote() + " Indirizzo: " + eventoSelezionato.getLuogo().getIndirizzo());
        }
        App.currentEvento = eventoSelezionato;
    }
}
