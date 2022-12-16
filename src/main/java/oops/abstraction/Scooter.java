package oops.abstraction;

public class Scooter extends Vehicle {
    void start(){
        System.out.println("Scooter start with kick");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        Scooter scooter = new Scooter();
        scooter.start();
    }
}
