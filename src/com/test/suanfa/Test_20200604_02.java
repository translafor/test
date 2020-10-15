package com.test.suanfa;

import java.util.LinkedList;

public class Test_20200604_02 {

    public static void main(String[] args) {
        Integer dd=9;
        char[] ss=dd.toString().toCharArray();
        ListNode s=new ListNode(ss[ss.length-1]-'0');
        if(ss.length-2>=0){
            s.next=getLi(ss,ss.length-1-1);
        }

        Long dd02=9999999991L;
        char[] ss02=dd02.toString().toCharArray();
        ListNode s02=new ListNode(ss02[ss02.length-1]-'0');
        if(ss02.length-2>=0){
            s02.next=getLi(ss02,ss02.length-1-1);
        }

        ListNode sddd=addTwoNumbers02(s,s02);
    }


    public static ListNode addTwoNumbers02(ListNode l1, ListNode l2) {
       ListNode res=new ListNode(0);
       ListNode p=l1, q=l2 ,temp=res;
       int s=0;
       while(p!=null||q!=null){
           int x=(p!=null)?p.val:0;
           int y=(q!=null)?q.val:0;
           int sum=x+y+s;
           temp.next=new ListNode(sum%10);
           temp=temp.next;
           s=sum/10;
           if(p!=null){
               p=p.next;
           }
           if(q!=null){
               q=q.next;
           }
       }

       if(s!=0){
           temp.next=new ListNode(s);
       }

       return res.next;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        char[] s=new char[5];
        Long num1=0L;
        Long num2=0L;
        if(l1.next==null){
            num1= Long.valueOf(l1.val);
        }
        else{
            num1=Long.valueOf(l1.val)+10*compute(l1.next);
        }

        if(l2.next==null){
            num2= Long.valueOf(l2.val);
        }
        else{
            num2=Long.valueOf(l2.val)+10*compute(l2.next);
        }
        Long num3=num1+num2;
        if(num3==0){
            return l1;
        }
        char[] ss=num3.toString().toCharArray();
        ListNode rea=new ListNode(ss[ss.length-1]-'0');
        if(ss.length-2>=0){
            rea.next=getLi(ss,ss.length-1-1);
        }
        return  rea;
    }


    private static ListNode getLi(char[] ss, int i) {
        if(i>0){
            ListNode s=new ListNode(ss[i]-'0');
            s.next=getLi(ss,i-1);
            return s;
        }
        else{
            ListNode ff=new ListNode(ss[i]-'0');
            return ff;
        }
    }

    private static  Long compute(ListNode next) {
        if(next.next==null){
            return Long.valueOf(next.val);
        }
        else{
            return next.val+10*compute(next.next);
        }
    }
}


class ListNode {
    int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
