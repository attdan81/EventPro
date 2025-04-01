package com.eventpro.management;

import java.util.ArrayList;
/*
 * Lista degli eventi
 * Autore: Porta Solestà
 * Data: 2025-04-01 
 * Descrizione: Questa classe contiene la lista degli eventi organizzati da EventPro. 
 */
public class Eventi {
    // Attributi dell'evento
    private ArrayList<Evento> eventi = new ArrayList<>();
    
    public Eventi() {
        
    }

    public void aggiungiEvento(Evento evento) {
        eventi.add(evento);
    }

    public void rimuoviEvento(Evento evento) {
        eventi.remove(evento);
    }

    public ArrayList<Evento> getEventi() {
        return eventi;
    }

    public Evento getEvento(int index) {
        return eventi.get(index);
    }

    @Override
    public String toString() {
        final StringBuilder output = new StringBuilder();
        this.eventi.stream().forEach(e -> output.append(e.toString()).append("\n"));
        return output.toString();
    }
}
