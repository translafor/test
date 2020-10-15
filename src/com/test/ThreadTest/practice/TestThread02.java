package com.test.ThreadTest.practice;

import java.util.Random;

public class TestThread02 {
    public static void main(String[] args) {
        char[] password=new char[3];
        Random r = new Random();
        for(int i = 0;i < 3;i++)
            password[i] = (char)(r.nextInt(94)+33);
        String pas=new String(password);
        System.out.println(pas);
        Thread02 thread02=new Thread02(pas);
        new Thread(thread02).start();

        Thread03 thread03=new Thread03();
        Thread thread=new Thread(thread03);
        thread.setDaemon(true);
        thread.start();
    }
}
