package com.test.ThreadTest.jike;

public class Test02 {
    public static void main(String[] args){
        MyThread02 my = new MyThread02();
        new Thread(my).start();
        new Thread(my).start();
        new Thread(my).start();
    }
}
class MyThread02 implements Runnable{
    private int ticket = 5;
    public synchronized  void run(){
        for (int i=0;i<10;i++)
        {
            if(ticket > 0){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("ticket = " + ticket--);
            }
        }
    }
}