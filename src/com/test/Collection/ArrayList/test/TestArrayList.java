package com.test.Collection.ArrayList.test;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String args[]){
        List<Hero> heros = new ArrayList<>();
        //放进容器内
        for(int i = 0 ; i < 5; i++){

            heros.add(new Hero("hero"+i));
            System.out.println(heros);

        }
    }

}
