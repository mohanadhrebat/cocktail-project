package com.mycompany.bar;
public abstract class Ingredient {
    private String name;
    private int calories;
    private int price;
    private int volume;

    public Ingredient(String name, int calories, int price,int volume) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.volume= volume;
    }

    public int getPrice() {
        return price;
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }
   public abstract Color getColor();
    public abstract String getInfo();
}
