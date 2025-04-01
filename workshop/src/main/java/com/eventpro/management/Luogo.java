package com.eventpro.management;
import java.util.ArrayList;
/*
 * Luogo dell'evento organizzato da EventPro
 * Autore: Porta Solestà
 * Data: 2025-04-01 
 * Descrizione: Questa classe rappresenta il luogo di un evento organizzato da EventPro. Contiene informazioni come il nome del luogo, l'indirizzo, le coordinate geografiche e i settori associati al luogo.
 */

public class Luogo {
    // Attributi del luogo
    private String nome;
    private String indirizzo;
    private String coordinate;
    private ArrayList<Settore> settori;

    public Luogo(String nome, String indirizzo, String coordinate, ArrayList settori){
        this.nome = nome;
        this.indirizzo= indirizzo;
        this.coordinate = coordinate;
        this.settori = settori;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public String getIndirizzo() {
        return indirizzo;
    }
    public String getCoordinate() {
        return coordinate;
    }
    public ArrayList getSettori() {
        return settori;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }
    public void setNumeroSettori(ArrayList settori) {
        this.settori = settori;
    }

    public int getNumeroTotale() {
        int count=0;
        for (int i=0; i<settori.size(); i++){
            count+= ((Settore) settori.get(i)).getNumeroPosti();
        }
        return count;
    }

    public Settore getSettoreByName(String nomeSettore) {
        for (int i=0; i<settori.size(); i++){
            if (((Settore) settori.get(i)).getNomeSettore().equals(nomeSettore)){
                return (Settore) settori.get(i);
            }
        }
        return null;
    }
}
