package bootcoding.basic.matths;

public class StoreValues {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 35, 75, 80, 95};

       for(int i = 0; i< arr.length; i++){

           if(arr[i]>30 && arr[i]<100){
               System.out.println("Numbers Between 30 and 100 are = "+arr[i]);
           }
       }
    }
}
