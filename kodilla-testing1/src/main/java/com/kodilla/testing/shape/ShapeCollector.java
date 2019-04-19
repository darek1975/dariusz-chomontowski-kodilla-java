package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {


    public static void main (String[] args) {
        Circle circle1 = new Circle(3);
        ArrayList<Shape> listOfShapes = new ArrayList<Shape>();

        listOfShapes.add(circle1);
        System.out.println(listOfShapes.size());


        Circle circle2 = new Circle(4);



        public void addFigure(Shape shape) {
            listOfShapes.add(shape);
        }
        ShapeCollector.addFigure(circle1);
    }
}


