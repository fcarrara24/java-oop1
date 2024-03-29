package org.learning.java_shop;


import org.learning.bonus_utility.Bonus;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {

    private static int ultimoConto = 0;
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private int iva;

    /**
     * constructor
     *
     * @param nome
     * @param descrizione
     * @param prezzo
     * @param iva
     */
    public Prodotto( java.lang.String nome, java.lang.String descrizione, double prezzo, int iva) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
        setCodice();
    }


    /**
     * creazione di un conto progressivo
     */
    private void setCodice() {
        //incremento l'indice dell'ultimo conto
        ultimoConto++;
        this.codice = ultimoConto;
    }

    public BigDecimal getPrezzo(){
        return Bonus.decimalValue(this.prezzo);
    }

    public BigDecimal getIvaPrezzo(){
        return Bonus.decimalValue(this.prezzo * (1 + 0.01*this.iva));
    }

    public String getExtendedName(){
        String extended = String.format("%08d", this.codice);
        extended += this.nome;
        return extended;
    }

    public String getNome() {
        return nome;
    }

    public void printAll(){
        System.out.println("nome:        "+nome);
        System.out.println("descrizione: "+descrizione);
        System.out.println("iva:         "+iva);
        System.out.println("codice:      "+codice);
        System.out.println();
        System.out.println("prezzo: "+getPrezzo());
        System.out.println("ivaprz: "+getIvaPrezzo());
        System.out.println("nomest: "+getExtendedName());
    }

}
