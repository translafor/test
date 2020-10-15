package com.test.Collection.LinkedList;

import com.test.Collection.ArrayList.test.Hero;

import java.util.LinkedList;


public class StackTest implements Stack{

    LinkedList<Hero> linkedList=new LinkedList<>();

    @Override
    public void push(Hero h) {
        // 加入至最后
        linkedList.offerLast(h);
    }

    @Override
    public Hero pull() {
        // 取出最后一个
        return linkedList.pollLast();
    }

    @Override
    public Hero peek() {
        // 查看最后一个
        return linkedList.getLast();
    }

    public static void main(String[] args) {

    }
}
