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

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,3);
        Rectangle r2 = new Rectangle(6);
        Rectangle r3 = new Rectangle(5,4);
        r1.printArea();
        r2.printArea();
        r3.printArea();
        r1.printRectangleKind();
        r2.printRectangleKind();
        r3.printRectangleKind();
        System.out.println(r1.isTheSameRectangle(r1));
        System.out.println(r2.isTheSameRectangle(r2));
        System.out.println(r3.isTheSameRectangle(r3));
    }
}
