package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testaddFigure(){
        //Given
        Circle circle = new Circle(3);
        //When
        ShapeCollector shc = new ShapeCollector();
        shc.addFigure(circle);
        //Then
        Assert.assertEquals(1, shc.getlistOfShapesQuantity());
    }
    @Test
    public void testremoveFigure(){
        //Given
        Circle circle = new Circle(3);
        ShapeCollector shco = new ShapeCollector();
        shco.addFigure(circle);
        //When
        shco.removeFigure(circle);
        //Then
        Assert.assertEquals(0,shco.getlistOfShapesQuantity());
    }
    @Test
    public void getFigure(){
        //Given
        Circle circle = new Circle(3);
        ShapeCollector shcol = new ShapeCollector();
        shcol.addFigure(circle);
        //When
        Shape shape2 = shcol.getFigure(0);
        //Then
        Assert.assertEquals(circle,shcol.getFigure(0) );
    }
    @Test
    public void showFigures(){
        //Given
        Circle circle = new Circle(3);
        Square square = new Square(3);
        Triangle triangle = new Triangle(3, 3);
        ShapeCollector shcol = new ShapeCollector();
        shcol.addFigure(circle);
        shcol.addFigure(square);
        shcol.addFigure(triangle);
        //When
        String string = shcol.showFigures();
                //circle.getShapeName() + square.getShapeName() + triangle.getShapeName();
        //Then
        Assert.assertEquals("circlesquaretriangle", string);
    }
}
