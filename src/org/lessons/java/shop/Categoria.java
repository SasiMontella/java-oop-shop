package org.lessons.java.shop;

public class Categoria {
   private String name;
    private String description;

    public Categoria(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String toString(){
        return name + " " + description;
    }
}
