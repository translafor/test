package com.test.ThreadTest.practice;

import java.util.Collections;

public class Thread03 implements Runnable {
    @Override
    public void run() {
        if(Thread02.usedStr.size()==0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else {
            for(int i=0;i<Thread02.usedStr.size();i++)
            System.out.println("坑是"+Thread02.usedStr.remove(0));
        }
    }
}
