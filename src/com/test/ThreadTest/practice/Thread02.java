package com.test.ThreadTest.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * 穷举法识别密码
 */
public class Thread02 implements Runnable{
    String password;
    public static List<String> usedStr=new ArrayList<>();
    public Thread02(String password){
        this.password=password;
    }


    @Override
    public void run() {
        char[] check=new char[3];
        boolean hasFind=false;
        int count=0;
        String findurl=null;
        for(int i=0;i<94;i++){
            check[0]=(char)(33+i);
            for(int j=0;j<94;j++){
                check[1]=(char)(33+j);
                for(int k=0;k<94;k++){
                    check[2]=(char)(33+k);
                    String pas=new String(check);
                    usedStr.add(pas);
                    count++;
                    if(pas.equals(password)){
                        hasFind=true;
                        findurl=pas;
                        break;
                    }
                }
                if(hasFind)
                {
                    break;
                }
            }
            if(hasFind){
                break;
            }
         }
        System.out.println(findurl);
        System.out.println("一共穷举了:"+count+"次");
    }
}
