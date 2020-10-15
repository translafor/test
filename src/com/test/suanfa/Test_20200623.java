package com.test.suanfa;

import java.util.ArrayList;
import java.util.List;

public class Test_20200623 {
    public static String convert(String s, int numRows) {
        List<StringBuilder> rows=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            rows.add(new StringBuilder());
        }

        char []charAyyar=s.toCharArray();
        int curRow=0;
        boolean goingDown=false;
        for(int i=0;i<charAyyar.length;i++){
            rows.get(curRow).append(charAyyar[i]);
            if(curRow==0||curRow==numRows-1){
                goingDown=!goingDown;
            }

            if(goingDown){
                curRow++;
            }else{
                curRow--;
            }
        }

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<rows.size();i++){
            sb.append(rows.get(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("LEETCODEISHIRING",4));
    }
}
