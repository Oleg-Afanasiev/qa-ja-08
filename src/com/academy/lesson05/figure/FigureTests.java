package com.academy.lesson05.figure;

public class FigureTests {
    public static void main(String[] args) {
        Square square = new Square(5);
        double areaActual = square.area();
        double areaExpected = 25;
        if (areaActual == areaExpected)
            System.out.println("Test passed");
        else
            System.out.println("Test error");
    }
}
