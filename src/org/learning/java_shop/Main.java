package org.learning.java_shop;

public class Main {
    public static void main(String[] args) {
        Prodotto pr1 = new Prodotto("carbonara", "è davvero buona", 1.34, 22);
        System.out.println("***********"+pr1.getNome()+"***********");
        pr1.printAll();

        Prodotto pr2 = new Prodotto("pizza", "è meglio della carbonara", 4.20, 24);
        System.out.println("\n\n***********"+pr2.getNome()+"***********");
        pr2.printAll();
    }
}
