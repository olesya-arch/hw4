package com.company;

public class Rectangle {
    double x;
    double y;


    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle (double z) {
        this.x = z;
        this.y = z;
    }

    double calculateArea () {
        return x * y;
    }
    void printArea () {
        System.out.println(calculateArea());
    }
    void printRectangleKind () {
        if (x == y) {
            System.out.println("Это квадрат");
        } else System.out.println("Это прямоугольник");
    }
    boolean isTheSameRectangle (Rectangle rectangle) {
        return this.x == rectangle.x &&
                this.y == rectangle.y;
    }

}
