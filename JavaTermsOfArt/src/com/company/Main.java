package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Circle c;
        c = new Circle();
        c.draw();

        // Runtime polymorphism
        // Drawing different shapes to the
        // reference variable at runtime

        Shape s;
        //shape = new Circle(); //Polymorphism



        s = new Rectangle();
        s.draw();

        s = new Polygon();
        s.draw();






    }
}
