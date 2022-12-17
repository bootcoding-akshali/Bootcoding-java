package oops.inheritance;

public class EngineeringStudent extends Student {
    void getStudentData(){
        roll = 1;
        name = "Ankit";
        marks = 89;
        System.out.println(roll + " "+ name+ " "+ marks);
    }

    public static void main(String[] args) {
        EngineeringStudent Ankit = new EngineeringStudent();
        Ankit.getStudentData();
        Ankit.calculateMarksRollNo();
    }
}
