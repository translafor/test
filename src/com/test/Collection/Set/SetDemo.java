package com.test.Collection.Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
public class SetDemo {
    public static void main(String[] args) {

        demo02();
        //创建集合对象
        TreeSet<Student> tree = new TreeSet<Student>();
        //创建元素
        Student s1 = new Student("霍建华",15);
        Student s2 = new Student("王亚妮",35);
        Student s3 = new Student("张三疯",25);


        //将元素添加到tree中  注：给TreeSet添加对象时，对象必须是可比的（即实现了Comparable接口），要是不是可比的就不知道讲当前对象放在什么位置
        tree.add(s1);
        tree.add(s2);
        tree.add(s3);
        //遍历tree
        Iterator<Student> it = tree.iterator();
        while(it.hasNext()) {
            Student pre = it.next();
            System.out.println(pre.getName()+"--"+pre.getAge());
        }
    }

    private static void demo02(){
        //创建集合对象
        TreeSet<Student> tree = new TreeSet<Student>(
                new Comparator<Student>() { //匿名内部类定义匿名对象
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o2.getAge()-o1.getAge();  //按年龄排序
                    }
                });


        Student s1 = new Student("霍建华",151);
        Student s2 = new Student("王亚妮",351);
        Student s3 = new Student("张三疯",251);

        tree.add(s1);
        tree.add(s2);
        tree.add(s3);

        //遍历tree
        Iterator<Student> it = tree.iterator();
        while(it.hasNext()) {
            Student pre = it.next();
            System.out.println(pre.getName()+"--"+pre.getAge());
        }
    }

}
