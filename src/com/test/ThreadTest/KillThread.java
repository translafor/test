package com.test.ThreadTest;

import com.test.Collection.ArrayList.test.Hero;

/**
 * 击杀多线程类
 */
public class KillThread extends  Thread{
    private Hero hero01;
    private Hero hero02;

    public KillThread(Hero hero01,Hero hero02){
        this.hero01=hero01;
        this.hero02=hero02;
    }

    public void run(){
        while (!hero02.isDead()){
            hero01.attackHero(hero02);
        }
    }
}
