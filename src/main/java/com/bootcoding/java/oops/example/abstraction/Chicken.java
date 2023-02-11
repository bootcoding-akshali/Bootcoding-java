package com.bootcoding.java.oops.example.abstraction;

public class Chicken extends Animal{
    public Chicken(){
        System.out.println("You have created Chicken.");
    }

    @Override
   public void walk() {
        System.out.println("Chicken walk on 2 legs");
    }
}
