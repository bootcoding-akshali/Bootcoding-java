package bootcoding.basic.matths;

import java.util.ArrayList;
import java.util.List;

//input array is [-43,0, 34, 0, 55], shift all 0s to the end of array
//For Ex 1:
//Input : [-43,0, 34, 0, 55]
//Output: [-43, 34,55,0,0]
public class MoveAllZeroToend {
    public static void main(String[] args) {
    shiftingZeroToEnd();
    }
    public  static void shiftingZeroToEnd(){
        int[] arr = {1,0,0,3,1,12};
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0)
                list2.add(arr[i]);
            else
                list1.add(arr[i]);
        }
        list1.addAll(list2);
        System.out.println(list1);

    }
}
