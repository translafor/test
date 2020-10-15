package com.test.generic;

import com.test.Collection.ArrayList.test.Hero;

import java.util.ArrayList;

public class TestGeneric02 {

    private static void iterate(ArrayList<? extends Hero> list){
        for (Hero hero : list) {
            System.out.println(hero.name);
        }
    }


    public static void main(String[] args) {
        ArrayList<Hero> hs = new ArrayList<>();
        ArrayList<ApHero> aphs = new ArrayList<>();
        ArrayList<ADHero> adhs = new ArrayList<>();

        iterate(hs);
        iterate(aphs);
        iterate(adhs);
    }
}
