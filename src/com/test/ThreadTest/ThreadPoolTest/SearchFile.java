package com.test.ThreadTest.ThreadPoolTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchFile {
    public void search(File file,String search,int num){
        System.out.println("第"+num+"个线程");
        String fileContent = readFileContent(file,num);
        if (fileContent.contains(search)) {
            //%S是输出字符串  %n代表换行第二个参数 就是我传入的对象(String类型的字符串) 第三个参数 拿到了File对象的路径和文件名
            //\n是在lunix系统下的换行符 \r\n是在windows系统下的换行符----为了平台通用%n作为两种的整合
            System.out.println("进一次循环:");
            System.out.printf("找到子目标字符串: %s , 在文件: %s%n",search,file);
        }
    }

    //读取文件内容方法
    public static String readFileContent(File file,int num) {
        //try(){}小括号内的资源会在try语句结束后自动释放，(对象释放,流资源还在,还是要关的)前提是这些可关闭的资源必须实现 java.lang.AutoCloseable 接口。
        //InputStream 和OutputStream 父类中一定实现了AutoCloseable接口
        //传入的必须是文件才行,否则异常,使用转换流,指定编码集,解决乱码问题
        InputStreamReader fr = null;
        System.out.println("第"+num+"个线程读取文件内容方法");
        try{
            fr = new InputStreamReader( new FileInputStream(file),"UTF-8");
            char[] all = new char[(int) file.length()];//一次读取file对象目录及子目录中的的所有文件(自定义缓冲区)
            fr.read(all);
            return new String(all);

        } catch (IOException e) {
            //不正确直接进入catch(捕捉)异常,并输出
            System.out.println(e.toString()+"转换字符流对象创建失败");
            return null;

        }finally{
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException();//运行时异常(读取文件内容时发生的异常)
                }
            }
        }
    }

}
