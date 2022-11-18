package bootcoding.basicmatths;

public class MultiplicationTable {
    public static void main(String[] args) {
       printMultiTable();
    }
    public static void printMultiTable(){
        int no = 6;
        System.out.println("Multiplication of :"+no);
        for(int i=1;i<=10;i++) {
            int result=no*i;
            System.out.println(result);

        }

    }
}
