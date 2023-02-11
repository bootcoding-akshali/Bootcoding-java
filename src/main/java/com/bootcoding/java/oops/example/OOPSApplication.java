package com.bootcoding.java.oops.example;

import com.bootcoding.java.oops.example.abstraction.Horse;
import com.bootcoding.java.oops.example.inhiritance.Shape;

public class OOPSApplication {
    public static void main(String[] args) {
     Pen pen1 = new Pen();
     pen1.color = "blue";

     Pen pen2 = new Pen();
     pen2.color = "black";

     Pen pen3 = new Pen();
     pen3.color = "Yellow";

     pen1.printColor();
     pen2.printColor();
     pen3.printColor();


     Shape shape1 = new Shape();
     shape1.area();

     Horse horse = new Horse();
     horse.walk();
     horse.breath();






    }
}
