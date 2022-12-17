package bootcoding.basicmatths.leetCodeprograms;

public class PalindromeNumber {
    public static void main(String[] args) {
        boolean palindrome = isPalindrome(121 );
        System.out.println(palindrome);

    }
    public static boolean isPalindrome(int x) {

        int temp = x;
        int rev = 0;
        int s;
        while (x > 0){
            s = x % 10;
            rev = rev * 10 + s;
            x = (x / 10);
        }
        if(rev == temp){
            return true;
        }else{
            return false;
        }
    }
}
