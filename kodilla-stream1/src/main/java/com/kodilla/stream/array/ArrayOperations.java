package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

        public static double getAverage(int[] numbers) {
                IntStream.range(0, numbers.length).map(n->numbers[n])
                        .forEach(System.out::println);
                OptionalDouble average1 = IntStream.range(0,numbers.length).map(n->numbers[n]).average();
                double average2;
                average2=average1.getAsDouble();
                return average2;
        }
}
