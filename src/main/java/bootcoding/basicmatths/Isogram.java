package bootcoding.basicmatths;

public class Isogram {

    public static void main(String[] args) {
        PrintIsogram();
    }

    public  static void PrintIsogram(){

            String s1 = "akshali";
           char[] arr=s1.toCharArray();
           boolean result =false;
           for(int i=0;i<arr.length-1;i++) {

               for (int j = i; j < arr.length - 1; j++) {
                  if (arr[i] == arr[j + 1]) {
                       //System.out.print(arr[i]);
//                       System.out.println(s1 +" not a isogram");
                          result = true;

                   }
               }
           }
           if (result){
               System.out.println("Isogram");
           }
           else {
               System.out.println("Not a Isogram");
           }
    }

}
