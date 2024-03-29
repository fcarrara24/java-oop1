package org.learning.java_bank;

import java.util.Random;
import java.util.Scanner;

public class Bank {

    /**
     * cycle to make operations on a certain bank account
     * @param conto
     */
    private static void operazioni(Conto conto){
        Scanner scan = new Scanner(System.in);
        int operazione = 0;
        double somma;
        System.out.println("gentile "+conto.getNomeProprietario()+
                ", possessore del conto "+conto.getNumeroConto() +
                ", il suo saldo è di "+conto.getSaldo()+" euro");


        while(operazione != 3){
            System.out.println("\n\n\n******************************\n" +
                    "scegliere una tra le seguenti opzioni: \n" +
                    "1: versare una somma \n" +
                    "2: prelevare una somma \n" +
                    "3: uscire");

            operazione = Integer.parseInt(scan.nextLine());

            switch (operazione){
                case 3:
                    break;
                case 1:
                    System.out.println("quanto desidera versare?");
                    conto.versa(Double.parseDouble(scan.nextLine()));
                    break;
                case 2:
                    System.out.println("quanto desidera prelevare?");
                    conto.preleva(Double.parseDouble(scan.nextLine()));
                    break;
            }
        }
        System.out.println("grazie per aver usato il nostro servizio");
        scan.close();
    }
    public static void main(String[] args) {
        String nome;
        Scanner sc = new Scanner(System.in);

        double sommadaMuovere = 0;

        //numero conto


        //inserimento nome
        System.out.print("inserire il nome ");
        nome = sc.nextLine();


        // creazione conto (saldo iniziale 1000 euro)
        Conto conto1 = new Conto( nome, 1000);


        //esecuzione operazioni
        operazioni(conto1);


        sc.close();
    }
}
