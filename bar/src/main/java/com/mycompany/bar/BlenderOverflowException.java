package com.mycompany.bar;

public class BlenderOverflowException extends Exception {

    @Override
    public String getMessage() {
        return "ERROR: Blender Is OverFlowed!!!";
    } 
}