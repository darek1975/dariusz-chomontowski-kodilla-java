package com.kodilla.testing.shape;

public class Circle implements Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getShapeName(){
        return "circle";
    }

    public double getField(){

        return 23.23;
    }
}
