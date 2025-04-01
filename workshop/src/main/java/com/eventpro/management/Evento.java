package com.eventpro.management;

/*
 * Evento organizzato da EventPro
 * Autore: Porta Solestà
 * Data: 2025-04-01 
 * Descrizione: Questa classe rappresenta un evento organizzato da EventPro. Contiene informazioni come il nome dell'evento, la data, il luogo e i settori disponibili.
 */
public class Evento {
    // Attributi dell'evento
    private String nome;
    private Luogo luogo;
    private String data;
    private String note;

    public Evento(String nome, Luogo luogo, String data, String note) {
        this.nome = nome;
        this.luogo = luogo;
        this.data = data;
        this.note = note;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Luogo getLuogo() {
        return luogo;
    }

    public void setLuogo(Luogo luogo) {
        this.luogo = luogo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", luogo=" + luogo +
                ", data='" + data + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
