package FileHandling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Person {
    private String name;
    private int age;
    private long phone;


    public Person(String name , int age , long phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public static void main(String[] args) {
        try {
            Person person = new Person("Nikhil",23,356451396);
            FileOutputStream fout = new FileOutputStream("info.txt");

            ObjectOutputStream objout = new ObjectOutputStream(fout);
            objout.writeObject(person);
            objout.close();
            fout.close();
            System.out.println("Information wrote Successfully");
        }
        catch(Exception e){
            System.out.println(e);

        }
    }
}
