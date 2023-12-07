package org.lessons.java.shop;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int code = random.nextInt(1, 1000000);

        try{
            System.out.print("Nome articolo: ");
            String name = scan.nextLine();
            System.out.print("Descrizione del prodotto: ");
            String description = scan.nextLine();
            System.out.print("Prezzo dell'articolo: ");
            double price = scan.nextDouble();
            System.out.print("IVA: ");
            int iva = scan.nextInt();

            Prodotto product = new Prodotto(code, name, description, price, iva);
            System.out.println(product);
        } catch (IllegalArgumentException e){
            System.out.println("Dati non validi: " + e.getMessage());
        }
        scan.close();


    }
}
