package excercise;

public class ArrayElements {
    public static void main(String[] args) {
         int[] arr=  {3,5,6,8,2,9};
         printArray(arr, 0);
         reversePrintArray(arr,0);

    }
    public static void printArray( int arr[],int n){
        if (n == arr.length)
            return;

        System.out.println(arr[n]);
        printArray(arr,n+1);
    }
    public static void reversePrintArray( int arr[],int n){
        if (n == arr.length)
            return;


        reversePrintArray(arr,n+1);
        System.out.println(arr[n]);
    }

}
