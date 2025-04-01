package com.eventpro.management;

import java.util.ArrayList;
/*
 * Biglietti
 * Autore: Porta Solestà
 * Data: 2025-04-01 
 * Descrizione: Questa classe contiene la lista di biglietti per un determinato evento
 * -- id
-- proprietario
-- online (si,no)
-- numero_posto_settore
 */

public class Biglietti {
    // Attributi del biglietto
   ArrayList<Biglietto> biglietti = new ArrayList<>();

    // Costruttore
    public Biglietti() {
        
    }

    // Aggiungi un biglietto alla lista
    public void aggiungiBiglietto(Biglietto biglietto) {
        biglietti.add(biglietto);
    }

    // Rimuovi un biglietto dalla lista
    public void rimuoviBiglietto(Biglietto biglietto) {
        biglietti.remove(biglietto);
    }

    // Ottieni la lista di biglietti
    public ArrayList<Biglietto> getBiglietti() {
        return biglietti;
    }
    
}

