package com.mycompany.bar;

public class Additions extends Ingredient {


    public Additions(String name, int volume, int calories, int price) {
        super(name, calories, price,volume);
    }

   
    @Override
    public String getInfo() {
        return String.format("Addition:" + getName() + "\ncalories:" + getCalories() + "\nVolume: " + getVolume() + "\nPrice: " + getPrice());
    }

    @Override
    public Color getColor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}
