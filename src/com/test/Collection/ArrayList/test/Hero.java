package com.test.Collection.ArrayList.test;

public class  Hero implements Comparable<Hero>{
    public String name;
    public float hp;

    public int damage;

    public Hero() {

    }

    // 增加一个初始化name的构造方法
    public Hero(String name) {

        this.name = name;
    }

    // 增加一个初始化name的构造方法
    public Hero(String name,int damage) {

        this.name = name;
        this.damage=damage;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Hero(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public String toString() {
        return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
    }

    /**
     * 1 代表交换
     * 0 -1代表不交换（维持升序)
     * @param o
     * @return
     */
    @Override
    public int compareTo(Hero o) {
        if(damage<o.damage){
            return 1;
        }
        else{
            return -1;
        }
    }

    public void attackHero(Hero h) {
//        try {
//            //为了表示攻击需要时间，每次攻击暂停1000毫秒
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        h.hp-=damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);

        if(h.isDead())
            System.out.println(h.name +"死了！");
    }

    public boolean isDead() {
        return 0>=hp?true:false;
    }

}
