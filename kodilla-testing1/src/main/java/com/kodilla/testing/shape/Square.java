package com.kodilla.testing.shape;

public class Square implements Shape {
    double gon;

    public Square(double gon) {
        this.gon = gon;
    }

    @Override
    public String getShapeName(){
        return "square";
    }
    /*public double getArea(double gon){
        double result = gon*gon;
        return result;
    }*/
}
