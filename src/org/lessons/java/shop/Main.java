package org.lessons.java.shop;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Categoria category = new Categoria("Scarpe", "Calzature");
        int code = random.nextInt(1, 1000000);
        Prodotto scarpe = new Prodotto(code, "Adidas Gazzelle", "Sneakers", 75.4, 22);
        scarpe.setPrice(45.0);
        System.out.println(scarpe.toString() + category.toString());

    }
}
