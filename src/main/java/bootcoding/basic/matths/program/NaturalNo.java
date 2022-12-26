package bootcoding.basic.matths.program;

public class NaturalNo {

    public static void main(String[] args) {
        printNaturalNumber();
    }
    public  static void printNaturalNumber(){
        int num = 10;
        int sum=0;
        for (int i=1; i<=num;i++){
            sum = sum +i;
            System.out.println(sum);
        }
    }
}
