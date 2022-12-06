package TestQuestion;
//Find the first missing number from sorted array with O(n) complexity using method with return missing number
public class MissingNumber {
    public static void main(String[] args) {
   int[] a = {1,2,3,5};
    getMissingNo(a);
    }
    public static void getMissingNo(int[] a){
        int n = a.length+1;
        int sum =0;
        int total = n*(n+1)/2;
        System.out.println(total);
        for (int i =0; i<a.length; i++){
            sum = sum+a[i];
        }
        System.out.println(total-sum);

    }
}
