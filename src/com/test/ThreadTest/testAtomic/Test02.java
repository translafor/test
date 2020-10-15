package com.test.ThreadTest.testAtomic;


import java.util.concurrent.atomic.AtomicInteger;

/**
 * https://how2j.cn/k/thread/thread-atomic-access/683.html#nowhere
 * i++ 这个行为，事实上是有3个原子性操作组成的。
 * 步骤 1. 取 i 的值
 * 步骤 2. i + 1
 * 步骤 3. 把新的值赋予i
 * 这三个步骤，每一步都是一个原子操作，但是合在一起，就不是原子操作。就不是线程安全的。
 *
 * JDK6 以后，新增加了一个包java.util.concurrent.atomic，里面有各种原子类，比如AtomicInteger。
 * 而AtomicInteger提供了各种自增，自减等方法，这些方法都是原子性的。 换句话说，自增方法 incrementAndGet 是线程安全的，同一个时间，只有一个线程可以调用这个方法。
 */
public class Test02 {

    private static int value = 0;
    private static AtomicInteger atomicValue =new AtomicInteger();
    public static void main(String[] args) {
        int number = 100000;
        Thread[] ts1 = new Thread[number];
        for (int i = 0; i < number; i++) {
            Thread t =new Thread(){
                public void run(){
                    value++;
                }
            };
            t.start();
            ts1[i] = t;
        }

        //等待这些线程全部结束
        for (Thread t : ts1) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        System.out.printf("%d个线程进行value++后，value的值变成:%d%n", number,value);
        Thread[] ts2 = new Thread[number];
        for (int i = 0; i < number; i++) {
            Thread t =new Thread(){
                public void run(){
                    atomicValue.incrementAndGet();
                }
            };
            t.start();
            ts2[i] = t;
        }

        //等待这些线程全部结束
        for (Thread t : ts2) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.printf("%d个线程进行atomicValue.incrementAndGet();后，atomicValue的值变成:%d%n", number,atomicValue.intValue());
    }
}
