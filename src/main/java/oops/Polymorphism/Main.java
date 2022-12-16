package oops.Polymorphism;

public class Main {
    public static void main(String[] args) {

        //Method Overloading
    Student student = new Student();
    student.read();
    student.read("Java");

    //Method Overriding
    Person person = new Shyam();
    Ram ram = new Ram();
    person.showDetails();

    }
}
