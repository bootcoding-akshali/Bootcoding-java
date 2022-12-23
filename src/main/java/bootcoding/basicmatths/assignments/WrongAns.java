package bootcoding.basicmatths.assignments;

public class WrongAns {
    public static void main(String[] args) {
           getAns(35,15,46,2);
    }
    public static void getAns(int p, int q, int r, int s){
        if((r>0) && (s>0) && (p%2==0) && (q>r) && (s>p) && ((r+s)>(p+q))){
            System.out.println("Correct ans");
        }else {
            System.out.println("Wrong ans");
        }
    }
}
