package excercise;

public class OddNo {
    public static void main(String[] args) {
        int arr[] = {3, 7, 9, 5, 2, 1};
        System.out.println("Odd No is :");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }

        }
        System.out.println("Even Numbers is:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
