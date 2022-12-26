package bootcoding.basic.matths.program;

public class MultiRecursion {
    public static void main(String[] args) {

          printMultipleNo(3,1);
    }
    public static void printMultipleNo(int number, int i){

        System.out.println(i*number);
        if (i == 10){
            return;
        }
        printMultipleNo(number,i+1);
    }
}
