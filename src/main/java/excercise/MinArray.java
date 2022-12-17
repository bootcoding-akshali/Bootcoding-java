package excercise;

public class MinArray {
    public static void main(String[] args) {
        int [] arr = new int[] {30,46,10,60,77,25};
        int min=arr[0];
        for (int i=0; i<arr.length;i++){
            if (arr[i]<min)
                min=arr[i];
        }
        System.out.println("Min Value ="+min);
    }
}
