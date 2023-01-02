package bootcoding.basic.matths.collections.hashmap;

import java.util.HashMap;

public class SearchHash {
    public static void main(String[] args) {
        //country(key) , population(value)
        HashMap<String , Integer> map = new HashMap<>();

        //insertion
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);

        System.out.println(map);
        //Search
//        if (map.containsKey("Indonesia")){
//            System.out.println("Key is present in the map");
//        }
//        else {
//            System.out.println("key is no present in the map");
//        }
        System.out.println(map.get("China")); //key exist
        System.out.println(map.get("Indonesia")); //key doesn't exist
    }
}
