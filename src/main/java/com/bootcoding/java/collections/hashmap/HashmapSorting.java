package com.bootcoding.java.collections.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashmapSorting {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("a",4);
        map.put("b",3);
        map.put("c",2);
        map.put("d",1);

//       LinkedHashMap<String,Integer> sortedmap = map.entrySet().stream().sorted((e1,e2) -> {
//           return e1.getValue() - e2.getValue();
//       }).collect(Collectors.toMap(Map.Entry::getKey , Map.Entry::getKey, (e1,e2)-> e1, LinkedHashMap::new));
   }

}
