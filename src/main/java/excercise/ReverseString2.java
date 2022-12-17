package excercise;

public class ReverseString2 {
    public static void main(String[] args) {
        int[] a ={3,5,6,7,1};
       reverseString(a,0);
       for (int i=0; i<a.length;i++){
           System.out.println(a[i]);
       }

    }
    private static void reverseString(int[]a,int n) {
        int x = a.length;
      if (n>x/2){
          return;
      }
      int temp = a[n];
      a[n] = a[x-1-1];
      a[x-1-1]=temp;

      reverseString(a,n+1);
    }
}
