package com.kodilla.testing.shape;

public class Square implements Shape {
    double gon;

    public Square(double gon) {
        this.gon = gon;
    }

    public String getShapeName(){
        return "square";
    }
}
