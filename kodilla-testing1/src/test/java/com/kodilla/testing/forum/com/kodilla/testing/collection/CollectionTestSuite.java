package com.kodilla.testing.forum.com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;


public class CollectionTestSuite {
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
        public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> number;
        number = null;
        ArrayList<Integer> evens;
        evens = null;
        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> evensnumbers = exterminator.exterminate(number);
        //Then
        Assert.assertEquals(evens, evensnumbers);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> number = new ArrayList<Integer>();

        number.add(50);
        number.add(51);
        number.add(52);
        number.add(53);
        number.add(54);
        number.add(55);
        number.add(56);
        number.add(57);
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> evens = new ArrayList<Integer>();
        evens.add(50);
        evens.add(52);
        evens.add(54);
        evens.add(56);

        //When
        ArrayList<Integer> evensnumbers = exterminator.exterminate(number);
        //Then
        Assert.assertEquals(evens, evensnumbers);
    }

}
