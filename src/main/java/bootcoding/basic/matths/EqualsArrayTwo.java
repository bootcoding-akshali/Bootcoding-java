package bootcoding.basic.matths;


public class EqualsArrayTwo {
    public static void main(String[] args) {
        int[] array1 = {3, 4, 7, 8, 1};
        int[] array2 = {3, 4, 7, 8, 1};
        boolean b = returnTwoArray(array1,array2);
        System.out.println(b);

    }

    public static boolean returnTwoArray(int[] array1, int[] array2) {

        int length1 = array2.length;
        int length2 = array1.length;

        if (length1!=length2){
            return false;
        }
        for (int i =0; i<array1.length; i++){
            if (array1[i] != array2[i]){
                return false;
            }
        }
        return true;
    }

}