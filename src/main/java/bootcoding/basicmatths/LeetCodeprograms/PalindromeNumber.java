package bootcoding.basicmatths.LeetCodeprograms;

public class PalindromeNumber {
    public static void main(String[] args) {
        boolean palindrome = isPalindrome(121 );
        System.out.println(palindrome);

    }
    public static boolean isPalindrome(int x) {

        int temp = x;
        int rev = 0;
        int dig = 0;
        while (x > 0){
            dig = x % 10;
            rev = (rev * 10) + dig;
            x = (int)(x / 10);
        }
        if(rev == temp){
            return true;
        }else{
            return false;
        }
    }
}
