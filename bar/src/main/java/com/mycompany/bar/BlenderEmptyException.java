package com.mycompany.bar;

public class BlenderEmptyException extends Exception{

    public BlenderEmptyException(String blender_is_empty_Please_add_ingredients_b) {
    }

    @Override
    public String getMessage() {
       return "ERROR: Blender Is Empty!!!!";
    } 
}