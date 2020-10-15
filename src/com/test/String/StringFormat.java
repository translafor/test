package com.test.String;

/**
 * 字符串格式化方法
 */
public class StringFormat {
    public static void main(String[] args) {

        new StringFormat().randomString();
        String name ="盖伦";
        int kill = 8;
        String title="超神";

        //使用格式化输出
        //%s表示字符串，%d表示数字,%n表示换行
        String sentenceFormat ="%s 在进行了连续 %d 次击杀后，获得了 %s 的称号%n";
        String s=String.format(sentenceFormat,name,kill,title);
        System.out.println(s);
        System.out.printf(sentenceFormat,name,kill,title);

        System.out.format(sentenceFormat,name,kill,title);



    }

    private void randomString(){
        char[] cs = new char[5];
        String pool="";
        for ( short i= '0';i<='9';i++){
            pool=pool+(char)i;
        }
        for(short i='A';i<='Z';i++){
            pool=pool+(char)i;
        }
        for(short i='a';i<='z';i++){
            pool=pool+(char)i;
        }
        System.out.println(pool);

        for(int h=0;h<cs.length;h++){
            int index=(int)(Math.random()*pool.length());
            cs[h]=pool.charAt(index);
        }
        String str = new String(cs);
        System.out.println(str);
    }

}
