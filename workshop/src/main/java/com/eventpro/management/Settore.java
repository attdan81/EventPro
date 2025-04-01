package com.eventpro.management;

    /*
 * nome del settore
 * colore del settore
 * numero di posti
 */

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
