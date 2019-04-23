package com.kodilla.testing.shape;

import java.util.ArrayList;


public class ShapeCollector {
    ArrayList<Shape> listOfShapes = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        listOfShapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        listOfShapes.remove(shape);
    }

    public Shape getFigure(int n) {
        Shape result = listOfShapes.get(n);
        return result;
    }

    public String showFigures() {
        String string1 = "";
        for(int i=0; i<listOfShapes.size(); i++ ){
            Shape shape = listOfShapes.get(i);
           string1 = string1 + shape.getShapeName();
        }
        return string1;
        }
    public int getlistOfShapesQuantity(){
      int result = listOfShapes.size();
        return result;
    }

}