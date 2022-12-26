package bootcoding.basic.matths;

public class OddEvenNo {

    public static void main(String[] args) {
        int arr[]= {6,2,7,3,5};
        System.out.println(" Even Number:");
        for(int i=0;i<arr.length;i++) {
            if (arr[i]%2==0) {
                System.out.println(arr[i] + " ");

            }
        }
    }

}

