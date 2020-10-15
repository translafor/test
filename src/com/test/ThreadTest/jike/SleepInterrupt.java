package com.test.ThreadTest.jike;

public class SleepInterrupt implements Runnable{
    @Override
    public void run() {
        try {

            System.out.println("in eunnable:现在开始，让这个线程睡眠20秒");
            Thread.sleep(20000);
            System.out.println("in Runnable:睡眠完成");
        } catch (InterruptedException e) {
            System.out.println("in Runnable:被打断睡眠");
            //处理完中断异常后，返回到run（）方法人口，
            //如果没有return，线程不会实际被中断，它会继续打印下面的信息 ---可以去掉return试试
            return;
        }

        System.out.println("in Runnable:结束了");
    }

    public static void main(String[] args) {
        SleepInterrupt sleepInterrupt=new SleepInterrupt();
        Thread thread=new Thread(sleepInterrupt);
        thread.start();
        try {
            System.out.println("in main:让主线程休息两秒，来有空执行其他线程");
            Thread.sleep(2000);
            System.out.println("in main:休息完成");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("in main:中断子线程");
        thread.interrupt();
        System.out.println("in main:离开主线程");
    }
}
