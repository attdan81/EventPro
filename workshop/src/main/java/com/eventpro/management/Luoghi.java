package com.eventpro.management;
import java.util.ArrayList;

/*
 * Descrizione: Questa classe rappresenta una lista di luoghi
 */

public class Luoghi {

    public static ArrayList<Luogo> luoghi = new ArrayList<Luogo>();

    public Luoghi() {
        // Inizializzazione dei settori e dei luoghi
        Settore s1=new Settore("Parterre", "Rosso", 100);
        Settore s2=new Settore("Anello1", "Verde", 50);
        Settore s3=new Settore("Anello2", "Blu", 50);
        Settore s4=new Settore("Parterre2", "Rosso", 50);
        Settore s5=new Settore("Anello3", "Verde", 30);
        Settore s6=new Settore("Anello4", "Blu", 20);

        ArrayList<Settore> settori1 = new ArrayList<Settore>();
        {
            settori1.add(s1);
            settori1.add(s2);
            settori1.add(s3);
        }
        Luogo luogo1 = new Luogo("Luogo 1", "Indirizzo 1", "Coordinate 1", settori1);
        luoghi.add(luogo1);

        ArrayList<Settore> settori2 = new ArrayList<Settore>();
        {
            settori2.add(s4);
            settori2.add(s5);
            settori2.add(s6);
        }
        Luogo luogo2 = new Luogo("Luogo ", "Indirizzo 2", "Coordinate 2", settori2);
        luoghi.add(luogo2);

        ArrayList<Settore> settori3 = new ArrayList<Settore>();
        {
            settori3.add(s1);
            settori3.add(s2);
            settori3.add(s5);
        }

        Luogo luogo3 = new Luogo("Luogo 3", "Indirizzo 3", "Coordinate 3", settori3);
        luoghi.add(luogo3);

        ArrayList<Settore> settori4 = new ArrayList<Settore>();
        {
            settori4.add(s1);
            settori4.add(s5);
            settori4.add(s6);
        }

        Luogo luogo4 = new Luogo ("Luogo 4", "Indirizzo 4", "Coordinate 4", settori4);
        luoghi.add(luogo4);
    
    }
    
    public static void aggiungiLuogo(Luogo luogo) {
        luoghi.add(luogo);
    }
    public static void rimuoviLuogo(Luogo luogo) {
        luoghi.remove(luogo);
    }
    public static ArrayList<Luogo> getLuoghi() {
        return luoghi;
    }
    public static Luogo getLuogo(int index) {
        return luoghi.get(index);
    }

   @Override
    public String toString() {
        final StringBuilder output = new StringBuilder();
        this.luoghi.stream().forEach(e -> output.append(e.toString()).append("\n"));
        return output.toString();
    }

    public Luogo getLuogoByname(String nome) {
        for (Luogo luogo : luoghi) {
            if (luogo.getNome().equals(nome)) {
                return luogo;
            }
        }
        return null; // Se non trovato, restituisce null
    }

}