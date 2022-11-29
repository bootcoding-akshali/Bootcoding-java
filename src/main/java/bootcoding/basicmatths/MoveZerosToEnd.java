package bootcoding.basicmatths;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int nums[] ={0,1,0,3,12};
       moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i] !=0)
                nums [index++] = nums[i];
        }

        // move all non-zeroes to left
        // identify current element isZero = false

        for (int i = index; i < n; i++) {
            nums[i] = 0;
        }

        // 1. move all non-zeros to left // index = 3
        // 2. push 0 to the index to end of array // 4,5
        // index = 3, 1,3,12,0,0
    }
}
