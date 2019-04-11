package com.kodilla;

public class Kalkulator {
    public int addAToB(int a, int b) {
        return a + b;
    }

    public int subtractAFromB(int a, int b) {
        return a - b;
    }
}

class Application
{
    public static void main(String[] args) {


        Kalkulator kalkulator = new Kalkulator();

        int result = kalkulator.addAToB(5, 5);
        System.out.print(result);
    }
}
