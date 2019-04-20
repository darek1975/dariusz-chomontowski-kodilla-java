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
        ShapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(1, ShapeCollector.getlistOfShapesQuantity());
    }
    @Test
    public void testremoveFigure(){
        //Given
        Circle circle = new Circle(3);
        //When
        ShapeCollector.removeFigure(circle);
        //Then
        Assert.assertEquals(0,ShapeCollector.getlistOfShapesQuantity());
    }
}
