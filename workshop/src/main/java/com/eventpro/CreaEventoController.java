package com.eventpro;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import com.eventpro.management.Evento;
import com.eventpro.management.Luogo;

/**
 * * CreaEventoController
 * * * Autore: Porta Solestà
 * * * Data: 2025-04-01
 * * * Descrizione: Questa classe gestisce la schermata di creazione di un nuovo evento.
 * * * * Permette di inserire i dati dell'evento e di salvarlo.
 * * * * Permette di selezionare il luogo dell'evento da una lista di luoghi disponibili.
 */
public class CreaEventoController {

    @FXML
    private TextField nomeEvento;
    @FXML
    private ChoiceBox luogoEvento;
    @FXML
    private TextField dataEvento;
    @FXML
    private TextArea noteEvento;

    //inizializza schermata iniziale
    @FXML    
    public void initialize() {
        // inizializza i luoghi
        for (Luogo luogo : App.luoghi.getLuoghi()) {
            luogoEvento.getItems().add(luogo.getNome());
        }
    }

    @FXML
    private void switchToEventi() throws IOException {
        // creare l'evento con i parametri
        Evento e=new Evento
                (nomeEvento.getText(), 
                App.luoghi.getLuogoByname(luogoEvento.getValue().toString()), 
                dataEvento.getText(), 
                noteEvento.getText());
        // aggiungere l'evento alla lista degli eventi
        App.eventi.aggiungiEvento(e);
        // tornare alla schermata principale
        App.setRoot("eventi");
    }
}