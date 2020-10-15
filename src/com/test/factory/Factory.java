package com.test.factory;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * String path = Thread.currentThread().getContextClassLoader().getResource(".").getPath();
 *        System.out.println(path);
 *
 *        String string = Sample1.class.getClassLoader().getResource(".").getPath();
 *        System.out.println(string);
 *
 *        String string2 = Sample1.class.getResource(".").getPath();
 *        System.out.println(string2);
 * 测试结果：
 *
 * /D:/workspaces/workspace7/demo1/target/classes/
 * /D:/workspaces/workspace7/demo1/target/classes/
 * /D:/workspaces/workspace7/demo1/target/classes/com/alibaba/
 * 说明：
 *
 * Classloader读取文件(即方式1和方法2)都是从classpath开始查找文件；方式3从当前类所在的目录下开始查找文件
 */
public class Factory {
    private static Factory fy=new Factory();
    private static Properties po=null;

//    static {
//        try {
//            po=new Properties();
//            po.load(new FileReader(Factory.class.getClassLoader().getResource("config.properties").getPath()));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    static {
        try {
            po=new Properties();
            po.load(new InputStreamReader(Factory.class.getClassLoader().getResourceAsStream("config.properties"),"UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Factory getFactory(){
        return fy;
    }

    public <T> T newInstance(String sunName){
        String all_Name=po.getProperty(sunName);
        try {
            return (T)Class.forName(all_Name).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) {
        Product product = Factory.getFactory().newInstance("ConcreteProduct1");
        System.out.println(product.soutName());
    }
}
