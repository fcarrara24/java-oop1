
package org.learning.java_bank;


import org.learning.bonus_utility.Bonus;

import java.util.Random;

public class Conto {
    private int numeroConto;
    private String nomeProprietario;
    private double saldo = 0;

    public Conto(String nomeProprietario, double saldo) {
        this.nomeProprietario = nomeProprietario;
        this.saldo = saldo;

    }

    public Conto(int numeroConto, String nomeProprietario, double saldo) {
        this.numeroConto = numeroConto;
        this.nomeProprietario = nomeProprietario;
        this.saldo = saldo>0 ? saldo: 0;
    }

    public void preleva(double somma){
        if(somma > this.saldo){ System.out.println("\n\nOPERAZIONE RESPINTA: il saldo di "+Bonus.decimalValue(saldo)+" non è sufficiente per prelevare "+Bonus.decimalValue(somma)); return;}
        this.saldo = this.saldo - somma;
        System.out.println("\n\nhai prelevato "+Bonus.decimalValue(somma)+"il tuo saldo attuale è di "+Bonus.decimalValue(saldo)+"euro");
        return;
    }
    public void versa (double somma){
        this.saldo += somma;
        System.out.println("\n\ngrazie per il versamento di "+Bonus.decimalValue(somma)+" il tuo saldo attuale è di "+Bonus.decimalValue(saldo));
    }

    public void infoConto(){
        System.out.println("\n\nnumeroConto "+this.numeroConto);
        System.out.println("nome propri "+this.nomeProprietario);
        System.out.println("saldo       "+ Bonus.decimalValue(saldo));
    }

    public double getSaldo(){
        return this.saldo;
    }

    public String getNomeProprietario(){
        return nomeProprietario;
    }

    public int getNumeroConto(){
        return numeroConto;
    }


    public void setNumeroConto(int numeroConto) {
        Random rnd = new Random();
        this.numeroConto =  rnd.nextInt(1000);
    }


}
