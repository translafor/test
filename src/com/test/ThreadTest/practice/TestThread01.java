package com.test.ThreadTest.practice;

public class TestThread01 {

    public static void main(String[] args) {
        Thread01 thread01=new Thread01();
        new Thread(thread01).start();
    }
}
