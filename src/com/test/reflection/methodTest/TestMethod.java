//package com.test.reflection.methodTest;
//
//import java.io.*;
//import java.lang.reflect.Field;
//import java.util.ArrayList;
//import java.util.List;
//
//public class TestMethod {
//
//    public void test(){
//        List<String> values=readFile("C:\\Users\\Administrator\\Desktop\\hero.config");
//        try {
//            Class pclass=Class.forName(values.get(0));
//            APHero instance = (APHero)pclass.newInstance();
//            Field
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//
//
//    public static List<String> readFile(String fileName){
//        File file=new File(fileName);
//        List<String> fileValue=new ArrayList<>();
//        FileReader fileReader= null;
//        try {
//            fileReader = new FileReader(file);
//            BufferedReader bufferedReader=new BufferedReader(fileReader);
//            String line=null;
//            while((line=bufferedReader.readLine())!=null){
//                fileValue.add(line);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return fileValue;
//    }
//}
