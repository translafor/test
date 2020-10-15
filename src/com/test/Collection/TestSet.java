package com.test.Collection;

import java.util.*;

public class TestSet {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","壹");
        map.put("2","贰");
        map.put("3","叁");
        map.put("a","A");
        map.put("b","B");
        map.put("c","C");
        Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry<String,String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            if(key.equals("b")){
                map.put(key,"ssssssss");
            }

        }

        System.out.println(map);
    }
}
