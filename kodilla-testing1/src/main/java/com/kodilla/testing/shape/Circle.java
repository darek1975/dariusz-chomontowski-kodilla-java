package com.kodilla.testing.shape;

public class Circle implements Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public String getShapeName(){
        return "circle";
    }

    /*public double getArea(double radius){
        double result = 3.14*radius*radius;
        return result;
    }*/
}
