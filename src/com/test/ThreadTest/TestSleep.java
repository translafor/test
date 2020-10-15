package com.test.ThreadTest;

public class TestSleep {

    public static void main(String[] args) {
        Thread thread=new Thread(){
            @Override
            public  void run(){
                int seconds=0;
                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.printf("已经玩了LOL %d 秒%n",seconds++);
                }
            }
        };

        thread.start();
    }
}
