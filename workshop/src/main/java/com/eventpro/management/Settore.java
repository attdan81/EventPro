package com.eventpro.management;

/**
 * Settore
 * * Autore: Porta Solestà
 * * Data: 2025-04-01
 * * Descrizione: Questa classe rappresenta un settore all'interno di un evento. Contiene informazioni come il nome del settore, il colore e il numero di posti disponibili.
 * * -- nome_settore
 * * -- colore_settore
 * * * -- numero_posto_settore
 * * * -- numero_posti
 * * * -- numero_posti_disponibili
 *  */
public class Settore {
    // Attributi del settore
    private String nomeSettore;
    private String coloreSettore;
    private int numeroPosti;

    public Settore(String nomeSettore, String coloreSettore, int numeroPosti) {
        this.nomeSettore = nomeSettore;
        this.coloreSettore = coloreSettore;
        this.numeroPosti = numeroPosti;
    }
    
    // Getters e Setters
    
    public String getNomeSettore() {
        return nomeSettore;
    }

    public void setNomeSettore(String nomeSettore) {
        this.nomeSettore = nomeSettore;
    }

    public String getColoreSettore() {
        return coloreSettore;
    }

    public void setColoreSettore(String coloreSettore) {
        this.coloreSettore = coloreSettore;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    public void setNumeroPosti(int numeroPosti) {
        this.numeroPosti = numeroPosti;
    }    
}
