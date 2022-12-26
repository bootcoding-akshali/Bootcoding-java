package bootcoding.basic.matths;

public class FoundExistnumber {
    public static void main(String[] args) {

        int[] arr = {10, 15, 20, 25, 35, 75, 80, 95};
//        int f = arr[0];
        int x=80;
        for (int i=0; i<arr.length;i++){
        if (x==arr[i]){
            System.out.println("found "+x);
        }
        }
     }

}