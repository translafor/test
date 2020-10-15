package com.test.Collection.LinkedList;

import com.test.Collection.ArrayList.test.Hero;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {


    public static void main(String[] args) {
        Queue<Hero> heroQueue=new LinkedList<>();
        Hero gero=new Hero("S");
        heroQueue.offer(new Hero("TEST01"));
        heroQueue.offer(new Hero("TEST02"));
        System.out.println(heroQueue.peek());
    }
}
