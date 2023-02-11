package com.bootcoding.java.oops.example.abstraction;

public class Horse extends Animal{
    public Horse(){
        System.out.println("wow, yov have created hourse!");
    }

    @Override
   public void walk() {
        System.out.println("Horse walk on 4 legs");
    }
}
