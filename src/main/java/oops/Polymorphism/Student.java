package oops.Polymorphism;

public class Student {
    public void read(){
        System.out.println("Which book you want to read ");
    }
    public void read(String bookName){
        System.out.println("Book"+bookName);
    }
}
