import java.util.ArrayList;
import java.util.List;

public class StudentsExcercise {

    public static void main(String[] args) {

        // Class cha object // Create instance of a class
        // then invoke a method of that instance
        StudentsExcercise se = new StudentsExcercise();
        double percentage = 55.00;
        double result = se.getSquareOfStudentPercentage(percentage);
        System.out.println("Square of " + percentage + "% is " + result);

        List<Student> students = new ArrayList<>();
        Student st1 = new Student();
        st1.setCity("Nagpur");
        st1.setPercentage(35.00);
        Student st2 = new Student();
        st2.setCity("Pune");
        st2.setPercentage(65.00);
        Student st3 = new Student();
        st3.setCity("Nagpur");
        st3.setPercentage(75.00);

        students.add(st1);
        students.add(st2);
        students.add(st3);

        List<Student> studentByPercentage = se.findStudentByPercentage(students, 70);
        System.out.println();


    }

    public double getSquareOfStudentPercentage(double percentage){
       return percentage * percentage;
    }

    public List<Student> findStudentByPercentage(List<Student> students, double minPercentage){

        List<Student> filteredStudents = new ArrayList<>();
        for(int i = 0 ; i < students.size(); i++){
            Student student = students.get(i);
            if(student.getPercentage() >= minPercentage){
                filteredStudents.add(student);
            }
        }
        return  filteredStudents;

    }

    public String getStudentsAddress(){

        return  null;
    }


}
