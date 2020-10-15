package com.test.netProgram.ipProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 借助 Runtime.getRuntime().exec() 可以运行一个windows的exe程序
 */
public class TestSocket {
    public static void main(String[] args) throws IOException {

        Process p = Runtime.getRuntime().exec("ping " + "172.20.201.92");

        /**
         * InputStreamReader出现了乱码问题
         * 应该保证编码与本机操作系统一致
         * 通过chcp 命令查看本机   我的活动代码页为：936，它对于的编码格式为GBK。
         * https://blog.csdn.net/zp357252539/article/details/79084480
         * https://blog.csdn.net/flyingshadower/article/details/82782346
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream(),"GBK"));
        String line = null;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            if (line.length() != 0)
                sb.append(line + "\r\n");
        }
        System.out.println("本次指令返回的消息是：");
        System.out.println(sb.toString());
    }
}
