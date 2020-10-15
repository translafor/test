package com.test.ThreadTest.ThreadPoolTest;

import java.io.File;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestSearchFileByThread {

    ThreadPoolExecutor threadPool= new ThreadPoolExecutor(10, 15, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
    private static int num=0;
    public static void main(String[] args) {

        //查找文件内容测试
        File folder = new File("F:"+File.separator+"KuGou"+File.separator+"Demo");
        new TestSearchFileByThread().search(folder, "会");

    }

    public void search(File file, String search){

        if (file.isFile()) {
            //获取文件名转为小写,明确以".txt"结尾的文件
            if (file.getName().toLowerCase().endsWith(".java")) {

                threadPool.execute(new Runnable(){

                    @Override
                    public void run() {
                        // TODO Auto-generated method stub
                        new SearchFile().search(file,search,num++);
                    }

                });

            }
        }
        //是目录就遍历,然后递归,获取子目录中包括指定字符串的文件
        if (file.isDirectory()) {
            File[] fs = file.listFiles();
            for (File f : fs) {
                search(f, search);//递归
            }
        }
    }
}
