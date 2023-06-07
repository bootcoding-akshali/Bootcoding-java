package java8features.countingdemo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingNumbers {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,83,5,2,6,4,6,1,1,0,8,9));

        Map<Integer , Long> mapOfNum = numberList.stream().collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting())
        );

        mapOfNum.forEach((listNumber, count) ->System.out.println("occurance of " + listNumber + "in the given list = " + count
        ));

    }
}
