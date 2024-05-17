package com.mycompany.bar;
public class fruit extends Ingredient {
       //volume is the ml
private Color color;

    public fruit(String name, int volume, int calories, int price ,Color color) {
        super(name, calories, price,volume);
        this.color = color;
    }

@Override
    public Color getColor() {
        return color;
    }
       
  
@Override
     public String getInfo() {
        return  "Fruit: " + getName() + "\nCalories: " + getCalories() + "\nVolume: " + getVolume() + "\nColor: " + color.getInfo() + "\nPrice: " + getPrice();
    }
}
