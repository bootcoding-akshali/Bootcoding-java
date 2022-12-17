package test.question;
//Create a function that takes two strings as arguments and return either true or false
//        depending on whether the total number of characters in the first string is equal to the total number of characters in the second string.
public class TotalNumberString {
    public static void main(String[] args) {
       String str1 = "Hello";
       String str2 = "Hello";
        boolean totalNo = findTotalNo(str1, str2);
        System.out.println(totalNo);

    }
    public static boolean  findTotalNo(String str1 , String str2){
         if (str1.equals(str2)) {
             return true;
         }
         return false;
    }
}
