package com.eventpro;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import com.eventpro.management.Evento;
import com.eventpro.management.Luogo;
import com.eventpro.management.Settore;
import com.eventpro.management.Biglietto;
import java.util.ArrayList; 

public class CreaBigliettoController {

    /**
     * <Label text="Id biglietto" />
      <TextField fx:id="idBiglietto"  />
      <Label text="Nome proprietario"  />
      <TextField  fx:id="nomeProprietario"/>      
      <CheckBox fx:id="bigliettoOnline" text="Biglietto online" />
      <Label text="Settore" />
      <ChoiceBox fx:id="settoreEvento" prefWidth="150.0" />
      <Label text="Posto" />
      <TextField fx:id="postoEvento"  />
      <Button fx:id="creaBigliettoButton" onAction="#creaBiglietto" text="Aggiungi biglietto" />
     */
    @FXML
    private TextField idBiglietto;
    @FXML
    private TextField nomeProprietario;
    @FXML
    private ChoiceBox settoreEvento;
    @FXML
    private TextField postoEvento;
    @FXML
    private CheckBox bigliettoOnline;

    //inizializza schermata iniziale
    @FXML    
    public void initialize() {
        // inizializza i settori
        Luogo luogo=App.currentEvento.getLuogo();
        ArrayList<Settore> settori=luogo.getSettori();
        // aggiungere i settori alla choicebox
        for (Settore settore : settori) {
            settoreEvento.getItems().add(settore.getNomeSettore());
        }        
    }

    @FXML
    private void creaBiglietto() throws IOException {
        // creare l'evento con i parametri
        Settore settore=App.currentEvento.getLuogo().getSettoreByName(settoreEvento.getValue().toString());
        Biglietto biglietto=new Biglietto(
                idBiglietto.getText(), 
                nomeProprietario.getText(), 
                bigliettoOnline.isSelected(),                
                Integer.parseInt(postoEvento.getText()),
                settore   
        );
        App.currentEvento.biglietti.aggiungiBiglietto(biglietto);

        // tornare alla schermata principale
        App.setRoot("biglietti");
    }
}