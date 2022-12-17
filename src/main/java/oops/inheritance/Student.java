package oops.inheritance;

import oops.encapuslation.EmployeeId;

public class Student {
    int roll;
    int marks;
    String name;
    void calculateMarksRollNo(){
        EmployeeId employeeId = new EmployeeId();
        System.out.println("Your Roll no is :"+roll);
        System.out.println("Your Marks is"+marks);
        System.out.println("Your Name is :"+name);
    }
}
