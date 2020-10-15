package com.test.Collection.Tree;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private Node leftNode;
    private Node rightNode;
    private Object value;

    public void addNode(Object v){
        if(null==value){  //如果当前节点为空，则将该值放在该节点即可
            value=v;
        }else {
            if((Integer)v<=(Integer)value){   //如果新增值比当前值小，则放到左子树去递归
                if(null==leftNode)
                    leftNode=new Node();
                leftNode.addNode(v);
            }
            else{
                if(null==rightNode)           //如果新增值比当前值大，则放到右子树去递归
                    rightNode=new Node();
                rightNode.addNode(v);
            }
        }
    }

    public static void main(String[] args) {
        int randoms[] = new int[] { 67, 7, 30, 73, 10, 0, 78, 81, 10, 74 };

        Node roots = new Node();
        for (int number : randoms) {
            roots.addNode(number);
        }
        System.out.println(roots.values());
    }

    /**
     * 中序遍历   左->中->右
     * @return
     */
    public List<Object> values(){
        List<Object> values=new ArrayList<>();

        //遍历左子树
        if(null!=leftNode)
            values.addAll(leftNode.values());

        //遍历当前
        values.add(value);

        //遍历右子树
        if(null!=rightNode)
            values.addAll(rightNode.values());

        return values;
    }


}
