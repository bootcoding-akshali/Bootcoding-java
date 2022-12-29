package bootcoding.basic.matths.pattern;

public class HalfPyramidNumber {
    public static void main(String[] args) {
  printPyramidNo(5);
    }
    public static void printPyramidNo(int n){
        //outer loop
        for (int i=1;i<=n;i++){
            //inner lopp
            for (int j=1;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println( );
        }
    }
}
