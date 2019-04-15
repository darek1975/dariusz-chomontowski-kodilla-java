package com.kodilla.testing.forum.com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.Assert;
import org.junit.Test;

public class CollectionTestSuite {
    @Test

    public void testCaseCollection(){
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
        number.add(50);
        number.add(52);
        number.add(54);
        number.add(56);

        //When
        ArrayList<Integer> evensnumbers = exterminator.exterminate(number);
        //Then
        Assert.assertEquals(ArrayList<Integer> evens, ArrayList<Integer> evensnumbers);
    }

}
