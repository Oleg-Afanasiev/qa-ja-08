package com.academy.lesson05.figure;

public class Square {
    private double side;
    private String color;

    public Square(double side) {
        this.side = side;
        this.color = "black";
    }

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println(String.format("Square with side=%d, color=%s",
                side, color));
    }

    public double area() {
        return side * side;
    }
}
