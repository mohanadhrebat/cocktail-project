package com.mycompany.bar;
import java.util.ArrayList;
import java.util.List;

public class Cup {
  private int capacity; 
  private int maxVolume;
  private int currentVolume;
  private int calories;
  private List<Ingredient> contents;

    public Cup(int capacity) {
        this.capacity = capacity = 50;
        this.currentVolume = 0;
        this.calories = 0;
        this.contents = new ArrayList<>();
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public boolean addIngredient(Ingredient ingre) {
    if (contents.size() < capacity) {
      contents.add(ingre);
      return true;
    }    
    return false;
    }

    public int getCapacity() {
        return capacity;
    }
    
  public int pourFromBar(int calories, int currentBarVolume) {
    int actualPourAmount = Math.min(capacity, currentBarVolume);  
    this.currentVolume = actualPourAmount;  
    this.calories = calories;  
    int CurVolume= currentBarVolume - actualPourAmount;
    return CurVolume; 
}


    public int getCurrentVolume() {
        return currentVolume;
    }
    
    public int getCalories() {
        return calories;
    }
     public String getInfo() {
        return "Cup: Capacity - " + currentVolume + "\nContents - " + contents.size() + "\nitems" + "\ncalories" + calories;
    }
}