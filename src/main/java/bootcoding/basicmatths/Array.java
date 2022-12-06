package bootcoding.basicmatths;

public class Array {
    public static void main(String[] args) {
        returnIndexOfArray( 45);
    }
    public static int returnIndexOfArray( int n){
        int [] arr = { -23, 45, 5, -4, 34, 45};
        int index = 0;
         for (int i = 0; i<arr.length;i++){
             if (arr[i] == n){
                index = i;

             }

         }
        System.out.println(index);
         return  -1;
    }

}
