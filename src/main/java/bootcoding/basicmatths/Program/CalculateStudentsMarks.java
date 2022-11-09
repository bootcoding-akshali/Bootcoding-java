package bootcoding.basicmatths.Program;

public class CalculateStudentsMarks {

    public static void main(String[] args) {
      CalculateStudentsMarks calculateStudentsMarks = new CalculateStudentsMarks();
      Student student = calculateStudentsMarks.convert("raj,72,58,80,60");
        System.out.println("Student average Marks :"+student.getAveragemarks());
        System.out.println("Student percentage marks : "+student.getPercentage() +"%");
    }

    public Student convert (String text){
    String[] tokens = text.split(",");
    Student student = new Student();
        student.setName(tokens[0]);
        student.setPhysics(Integer.parseInt(tokens[1]));
        student.setChemistry(Integer.parseInt(tokens[2]));
        student.setMaths(Integer.parseInt(tokens[3]));
        student.setBiology(Integer.parseInt(tokens[4]));

        int obtainmarks = student.getBiology() + student.getChemistry() + student.getMaths() + student.getPhysics();
        double average =obtainmarks  / (tokens.length - 1);
        student.setAveragemarks(average);

        double percentage = (obtainmarks  / 400.00 ) * 100;
        student.setPercentage(percentage);

         return  student;

    }
}
