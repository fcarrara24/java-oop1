package org.learning.java_bank;

public class Conto {
    private int numeroConto;
    private String nomeProprietario;
    private double saldo = 0;

    public Conto(int numeroConto, String nomeProprietario, double saldo) {
        this.numeroConto = numeroConto;
        this.nomeProprietario = nomeProprietario;
        this.saldo = saldo>0 ? saldo: 0;
    }

    public void preleva(double somma){
        if(somma > this.saldo){ System.out.println("\n\nOPERAZIONE RESPINTA: il saldo di "+parseDecimal(saldo)+" non è sufficiente per prelevare "+somma); return;}
        this.saldo = this.saldo - somma;
        System.out.println("\n\nhai prelevato "+somma+"il tuo saldo attuale è di "+parseDecimal(saldo)+"euro");
        return;
    }
    public void versa (double somma){
        this.saldo += somma;
        System.out.println("\n\ngrazie per il versamento di "+somma+" il tuo saldo attuale è di "+parseDecimal(saldo));
    }

    public void infoConto(){
        System.out.println("\n\nnumeroConto "+this.numeroConto);
        System.out.println("nome propri "+this.nomeProprietario);
        System.out.println("saldo       "+parseDecimal(saldo));
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

    private String parseDecimal(double sum){
        return String.format("%.2f", sum);
    }


}
