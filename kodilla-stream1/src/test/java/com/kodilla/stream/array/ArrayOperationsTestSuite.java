package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testgetAverage() {
        //Given
        int numbers[] = new int[5];

        //When

        numbers[0] = 2;
        numbers[1] = 3;
        numbers[2] = 4;
        numbers[3] = 3;
        numbers[4] = 3;

            //Then
        double average3 = ArrayOperations.getAverage(numbers);
        Assert.assertEquals(3, average3,0.001);
    }
}
