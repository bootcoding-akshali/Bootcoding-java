package com.bootcoding.java.oops.example.abstraction;

public abstract class Animal {
    abstract void walk();
   public void breath(){
        System.out.println("This animal breathes air");
    }
    Animal(){
        System.out.println("Your are about to create an animal");
    }

}
