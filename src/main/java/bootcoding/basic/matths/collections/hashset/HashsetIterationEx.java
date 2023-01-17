package bootcoding.basic.matths.collections.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetIterationEx {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //Add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        //Iteration - HashSet does not have an order
        set.add(0);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
        System.out.println();

        //isEmpty
        if(!set.isEmpty()) {
            System.out.println("set is not empty");
        }
    }
}

