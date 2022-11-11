package bootcoding.basicmatths;

public class NewSubjects {

//    public  static void  newSubjects(){
//        System.out.println();
//    }
//    public  static void printThreeSubject(){
//       newSubjects();
//       newSubjects();
//       newSubjects();
//    }

    public static void printSubjects(String[] subjects){
        for (int i=0; i<subjects.length;i++){
            System.out.println(subjects[i]);
        }
    }
    public static void main(String[] args) {

//        System.out.println("Biology ");
//        printThreeSubject();
//        System.out.println("Mathematics");
        String[] subjects = {"English,Physics,Chemistry,Biology,Mathematics"};
        printSubjects(subjects);

    }




}


