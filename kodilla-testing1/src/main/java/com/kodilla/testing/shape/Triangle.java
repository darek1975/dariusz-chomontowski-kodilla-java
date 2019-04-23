package com.kodilla.testing.shape;

public class Triangle implements Shape {
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
            }


    public String getShapeName(){
        return "triangle";
    }
    public double getField(){
        return 32.32;
    }
}
