package com.mycompany.bar;
import com.mycompany.bar.BlenderOverflowException;
import com.mycompany.bar.BlenderEmptyException;

import java.util.ArrayList;
import java.util.List;

public class Blender {
    private int capacity;
    private int currentVolume;
    private List<Ingredient> fruits;
    private List<Ingredient> additions; 

    public Blender(int capacity) {
        this.currentVolume = currentVolume;
        this.capacity = capacity = 200;
        this.fruits = new ArrayList<>();
        this.additions = new ArrayList<>();
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    

    public boolean addFruit(fruit fruit) throws BlenderOverflowException {
        if (getTotalVolume() + fruit.getVolume() <= capacity) {
            fruits.add(fruit);
            return true;
        } else {
            throw new BlenderOverflowException();
        }
    }
    public boolean addAdditions(Additions addition) throws BlenderOverflowException {
        if (getTotalVolume() + addition.getVolume() <= capacity) {
            additions.add(addition);
            return true;
        } else {
            throw new BlenderOverflowException();
        }
    }
    
    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
    

    public int getTotalVolume() {
        int totalVolu = 0;
        for (Ingredient ingredient : fruits) {
            totalVolu += ingredient.getVolume();
        }
        for (Ingredient ingredient : additions) {
            totalVolu += ingredient.getVolume();
        }
        return totalVolu;
    }

    public Color getCurrentColor() {
        if (fruits.isEmpty()) {
            return new Color(255, 255, 255);
        }

        int totalRed = 0;
        int totalGreen = 0;
        int totalBlue = 0;

        for (Ingredient ingredient : fruits) {
            Color fruitColor = ingredient.getColor();
            totalRed += fruitColor.getRed();
            totalGreen += fruitColor.getGreen();
            totalBlue += fruitColor.getBlue();
        }

        int avgRed = totalRed / fruits.size();
        int avgGreen = totalGreen / fruits.size();
        int avgBlue = totalBlue / fruits.size();

        return new Color(avgRed, avgGreen, avgBlue);
    }

    public int getTotalCalories() {
        int totalCals = 0;
        for (Ingredient ingredient : fruits) {
            totalCals += ingredient.getCalories();
        }
        for (Ingredient ingredient : additions) {
            totalCals += ingredient.getCalories();
        }
        return totalCals;
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (Ingredient ingredient : fruits) {
            totalPrice += ingredient.getPrice();
        }
        for (Ingredient ingredient : additions) {
            totalPrice += ingredient.getPrice();
        }
        return totalPrice;
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Blender: Capacity - ").append(capacity).append("\n");

        sb.append("Fruits:\n");
        if (fruits.isEmpty()) {
            sb.append("None\n");
        } else {
            for (Ingredient fruit : fruits) {
                sb.append("- ").append(fruit.getName()).append("\n");
            }
        }

        sb.append("Additions:\n");
        if (additions.isEmpty()) {
            sb.append("None\n");
        } else {
            for (Ingredient addition : additions) {
                sb.append("- ").append(addition.getName()).append("\n");
            }
        }

        return sb.toString();
    }
}
