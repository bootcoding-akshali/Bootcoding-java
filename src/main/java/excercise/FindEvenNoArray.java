package excercise;

public class FindEvenNoArray {
        public static void main(String[] args) {
            int[] num = {1,53, 7, 3, 17};
            System.out.println("Array Elements");
            for (int i = 0; i < num.length; i++) {
                System.out.println(num[i]);
            }
            findPrimeElements(num);

        }
        private static void findPrimeElements(int[] num) {
//            int[] a = num;
            for (int i =0;i<num.length;i++){
                if (num[i]==2 || num[i] == 3){
                    System.out.println(num[i]+" is Prime Number");
                }else if (num[i]%2==0){

                }else if (num[i]%3==0){

                }else {
                    System.out.println(num[i]+" is Prime Number");
                }
            }
        }
}
