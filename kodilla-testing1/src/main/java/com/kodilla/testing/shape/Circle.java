package com.kodilla.testing.shape;

public class Circle implements Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public String getShapeName(){
        return "circle";
    }

    /*public double getField(double radius){
        double result = 3.14*radius*radius;
        return result;
    }*/
}
