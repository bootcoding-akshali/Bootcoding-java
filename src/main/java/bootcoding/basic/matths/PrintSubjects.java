package bootcoding.basic.matths;

public class PrintSubjects {

    public  static void printSubjects(String[] sub){
      for (int i=0; i<sub.length;i++){
          System.out.println(sub[i]);
      }

    }

    public static void main(String[] args) {
        String[] subjects = {"Physics, Mathematics, chemistry, Biology, English"};
        printSubjects(subjects);
    }
}
