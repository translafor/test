package com.test.Lambda;

import com.test.Collection.ArrayList.test.Hero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 使用聚合操作方式，遍历数据
 */
public class TestLambda03 {
    public static void main(String[] args) {

        Random random=new Random();
        List<Hero> heroList=new ArrayList<>();
        for(int i=0;i<6;i++){
            heroList.add(new Hero("hero"+i,random.nextInt(10)));
        }

        heroList.stream().sorted().forEach(hero -> System.out.println(hero.damage));
//        heroList.stream()
//                .filter(hero -> hero.damage>5)
//                .forEach(hero -> System.out.println(hero.name));
//
//        //管道源是数组
//        Hero hs[] = heroList.toArray(new Hero[heroList.size()]);
//        Arrays.stream(hs)
//                .forEach(h->System.out.println(h.name));


    }


    /**
     * lambda 工具方法
     */
    private static  void util(){
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        //制造一个重复数据
        heros.add(heros.get(0));
        System.out.println("初始化集合后的数据 (最后一个数据重复)：");
        System.out.println(heros);
        System.out.println("满足条件hp>100&&damage<50的数据");

        heros
                .stream()
                .filter(h->h.hp>100&&h.damage<50)
                .forEach(h->System.out.print(h));

        System.out.println("去除重复的数据，去除标准是看equals");
        heros
                .stream()
                .distinct()
                .forEach(h->System.out.print(h));
        System.out.println("按照血量排序");
        heros
                .stream()
                .sorted((h1,h2)->h1.hp>=h2.hp?1:-1)
                .forEach(h->System.out.print(h));

        System.out.println("保留3个");
        heros
                .stream()
                .limit(3)
                .forEach(h->System.out.print(h));

        System.out.println("忽略前3个");
        heros
                .stream()
                .skip(3)
                .forEach(h->System.out.print(h));

        System.out.println("转换为double的Stream");
        heros
                .stream()
                .mapToDouble(Hero::getHp)
                .forEach(h->System.out.println(h));

        System.out.println("转换任意类型的Stream");
        heros
                .stream()
                .map((h)-> h.name + " - " + h.hp + " - " + h.damage)
                .forEach(h->System.out.println(h));
    }


    /**
     * 通过lambda遍历数组
     */
    public static void test01(){
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }

        System.out.println("初始化后的集合：");
        System.out.println(heros);
        System.out.println("查询条件：hp>100 && damage<50");
        System.out.println("通过传统操作方式找出满足条件的数据：");

        for (Hero h : heros) {
            if (h.hp > 100 && h.damage < 50)
                System.out.println(h.name);
        }

        System.out.println("通过聚合操作方式找出满足条件的数据：");
        heros.stream()
                .filter(hero -> hero.hp>100 && hero.damage<50)
                .forEach(hero -> System.out.println(hero.name));
    }



}
