package bootcoding.basicmatths.Assignments;

public class MultiplicationTable {
    public static void main(String[] args) {
     printTable(8);
    }
    public static void printTable(int number){
        for (int i=0; i<10; i++){
            System.out.println(i*number);
        }
    }
}
