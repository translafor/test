package com.test.Lambda;

import com.test.Collection.ArrayList.test.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestLambda01 {
    public static void main(String[] args) {
        Random random=new Random();
        List<Hero> heros=new ArrayList<>();
        for(int i=0;i<5;i++){
            heros.add(new Hero("hero"+i,random.nextInt(1000),random.nextInt(100)));
        }

        System.out.println("初始化的集合：");
        System.out.println(heros);
//        System.out.println("匿名内部类:");
//        HeroChecker heroChecker=new HeroChecker() {
//            @Override
//            public boolean check(Hero h) {
//                return (h.hp>100 && h.damage<50);
//            }
//        };
//        filter(heros,heroChecker);

        System.out.println("Lamdba表达式:");
        filter(heros,h->h.hp>100 && h.damage<50);

    }


    public static void filter(List<Hero> heros,HeroChecker heroChecker){
        for (Hero hero:
             heros) {
            if(heroChecker.check(hero)){
                System.out.println(hero);
            }

        }
    }
}
