package test.question;

import java.util.Collections;
import java.util.List;

public class OddNo {
    public static void main(String[] args) {
        System.out.println(onlyOddNumbers(Collections.singletonList(7)));
    }
    public static boolean onlyOddNumbers(List<Integer> list) {
        for (int i : list) {
            if (i % 2 == 0)
                return false;
        }

        return true;
    }
}
