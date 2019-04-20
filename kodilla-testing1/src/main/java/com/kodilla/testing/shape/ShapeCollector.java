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

    public void getFigure(int n) {
        listOfShapes.get(n);
    }

    /*public void showFigure() {
        listOfShapes.get(int n);
    }*/
    public int getlistOfShapesQuantity(){
      int result = listOfShapes.size();
        return result;
    }
}