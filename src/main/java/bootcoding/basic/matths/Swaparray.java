package bootcoding.basic.matths;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Swaparray {
    public static void main(String[] args) {
        int arr[] = {10 ,15, 20, 25,35,75,80,95};
        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1]=temp;

        System.out.println(Arrays.toString(arr));

    }
}


