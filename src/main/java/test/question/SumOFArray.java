package test.question;
//Calculate the sum of only positive numbers within an array using method with return sum
public class SumOFArray {
    public static void main(String[] args) {
      int [] array= {1,5,-3,2,11};
      calculateSumOfArray(array,0);
    }
    public static int calculateSumOfArray(int[] array , int sum){
        for (int i =0; i<array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
                System.out.println(sum);
            }
        }
        return sum;

    }
}
