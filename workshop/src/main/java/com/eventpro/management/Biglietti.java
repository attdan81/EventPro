package com.eventpro.management;

import java.util.ArrayList;
/*
 * Biglietti
 * Autore: Porta Solestà
 * Data: 2025-04-01 
 * Descrizione: Questa classe contiene la lista di biglietti per un determinato evento
 */

public class Biglietti {
    // Attributi del biglietto
   ArrayList<Biglietto> biglietti = new ArrayList<>();

    // Costruttore
    public Biglietti() {
        
    }

    /**
     * Aggiungi un biglietto alla lista
     */
    public void aggiungiBiglietto(Biglietto biglietto) {
        biglietti.add(biglietto);
    }

    /**
     * Rimuovi un biglietto dalla lista
     * @param biglietto
     */
    public void rimuoviBiglietto(Biglietto biglietto) {
        biglietti.remove(biglietto);
    }

    /**
     * Restituisce la lista di biglietti
     * @return
     */
    public ArrayList<Biglietto> getBiglietti() {
        return biglietti;
    }
    
}

