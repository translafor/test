package com.test.ThreadTest.testAtomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger atomicI =new AtomicInteger();
        int i = atomicI.decrementAndGet();
        int j = atomicI.incrementAndGet();
        int k = atomicI.addAndGet(3);

    }
}
