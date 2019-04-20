package com.kodilla.testing.shape;

public class Triangle implements Shape {
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
            }

    @Override
    public String getShapeName(){
        return "triangle";
    }
    /*public double getArea(double base, double height){
        double result = (base*height)/2;
        return result;
    }*/
}
