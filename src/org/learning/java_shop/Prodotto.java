package org.learning.java_shop;


import java.util.Random;

public class Prodotto {


    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private int iva;

    public Prodotto(int codice, java.lang.String nome, java.lang.String descrizione, double prezzo, int iva) {
        this.codice = codice;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = Integer.parseInt(String.format("%02d", prezzo));
        this.iva = iva;
        setCodice();
    }


    private void setCodice() {
        Random rnd = new Random();
        this.codice = rnd.nextInt(99999999);

    }

    public double getPrezzo(){
        return this.prezzo;
    }

    public double getIvaPrezzo(){
        return this.prezzo * (1 + 0.01*this.iva);
    }

    public String getExtendedName(){
        String extended = String.format("%80d", this.codice);
        extended += this.nome;
        return extended;
    }

}
