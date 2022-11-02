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
        System.out.println("");

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

        List<Student> studentByPercentage = se.findStudentByPercentage(students, 40);
        System.out.println();

        for(Student s: studentByPercentage){
            System.out.println("Percentage of Studetn is "+s.getPercentage());
        }

        int n = 10;
        int[] ns = {19, 2023, 48, 489};
        System.out.println(n);
        System.out.println(ns);

        for(int pos = 0; pos < ns.length; pos++){
            System.out.println(ns[pos]);
//            System.out.println(pos);
        }




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

    public List<Student> getStudentAddress(List<Student> students, String city){
        List<Student> filteredStudents = new ArrayList<>();

        for(Student s : students){
            if(s.getCity().equals(city)){
                filteredStudents.add(s);
            }
        }
       return filteredStudents;
    }


}

