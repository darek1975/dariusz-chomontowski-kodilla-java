package com.kodilla.testing.collection;
import java.util.*;
import java.lang.*;
import java.io.*;
public class OddNumbersExterminator {
        public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
            if (numbers==null){
                return null;
            }
            else{
                ArrayList<Integer> evens = new ArrayList<>();
                for (Integer number : numbers) {
                    if (number % 2 == 0) {
                        evens.add(number);
                    }
                }
                return evens;
            }
    }
}
