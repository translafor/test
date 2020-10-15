package com.test.ThreadTest.practice;

public class Thread01 implements  Runnable{

    public static int count=3;
    @Override
    public void run() {

        while(true){
            if(count>0){
                Hero01.a_du_gen((4 - count));
                count--;
            }else{
                System.out.println("开始为时五秒的充能");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                count=3;
            }
        }


    }
}
