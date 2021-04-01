package com.company;

import java.awt.*;

public class Main {

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
        System.out.println("");
    }
}
