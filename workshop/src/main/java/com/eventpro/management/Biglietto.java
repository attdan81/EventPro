package com.eventpro.management;

/*
 * Biglietto
 * Autore: Porta Solestà
 * Data: 2025-04-01 
 * Descrizione: Questa classe rappresenta un biglietto venduto per un determinato evento
 * -- id
-- proprietario
-- online (si,no)
-- numero_posto_settore
 */

public class Biglietto {
    // Attributi del biglietto
    private String id;
    private String proprietario;
    private boolean online;
    private int numero_posto_settore;
    private Settore settore; // Associazione con la classe Settore

    // Costruttore
    public Biglietto(String id, String proprietario, boolean online, int numero_posto_settore, Settore settore) {
        this.id = id;
        this.proprietario = proprietario;
        this.online = online; 
        this.numero_posto_settore = numero_posto_settore;
        this.settore = settore; // Inizializza l'associazione con la classe Settore
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public int getNumero_posto_settore() {
        return numero_posto_settore;
    }

    public void setNumero_posto_settore(int numero_posto_settore) {
        this.numero_posto_settore = numero_posto_settore;
    }

    public Settore getSettore() {
        return settore;
    }

    public void setSettore(Settore settore) {
        this.settore = settore;
    }

    // Metodo per visualizzare le informazioni del biglietto
    @Override
    public String toString() {
        return "ID: " + id + "\n" +
               "Proprietario: " + proprietario + "\n" +
               "Online: " + (online ? "Sì" : "No") + "\n" +
               "Settore: " + settore.getNomeSettore() + "\n"  +
               "Numero posto settore: " + numero_posto_settore;
    }
}

