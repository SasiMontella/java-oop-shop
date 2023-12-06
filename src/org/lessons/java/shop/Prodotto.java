package org.lessons.java.shop;

public class Prodotto {
    //ATTRIBUTI
    private int code;
    private String name;
    private String description;
    private double price;
    private int iva;


    //COSTRUTTORI

    public Prodotto(int code, String name, String description, double price, int iva) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }


    //GETTER E SETTER

    public int getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getIva() {
        return iva;
    }
    public void setIva(int iva) {
        this.iva = iva;
    }
//METODI
    public String getCodeName(){
        return code + "-" + name;
    }
    public double getpriceTaxed(){
        return  price += price / 100 * iva;
    }

    @Override
    public String toString() {
        return "Prodotto:" + getCodeName() + "\nDescrizione: " + getDescription() + "\nPrezzo: " + getPrice() + "\nPrezzo + iva: " + getpriceTaxed() + "€\n";
    }

}
