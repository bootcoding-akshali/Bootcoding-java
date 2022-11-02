package Excercise;

public class MaxArray {
    public static void main(String[] args) {
        int [] arr = new int[] {45,22,40,60,50,35};

        int max = arr[0];
        for (int i=0; i<arr.length;i++){
            if (arr[i]>max)
                max=arr[i];
        }
        System.out.println("Max value ="+max);
    }
}
