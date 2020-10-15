package com.test.netProgram.ipProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class TestSocket02 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress host=InetAddress.getLocalHost();
        String ip=host.getHostAddress();
        String head=ip.substring(0,ip.lastIndexOf('.')+1);
        List<String> ipList= Collections.synchronizedList(new ArrayList<>());
        final CountDownLatch latch=new CountDownLatch(255);
        for (int i=1;i<=255;i++){
            int j=i;
            new Thread(()->{
                String item=head+j;
                boolean flag=false;
                Process p = null;
                try {
                    p = Runtime.getRuntime().exec("ping " + item);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String line = null;
                try {
                    while ((line = br.readLine()) != null) {
                        if (line.contains("TTL")) {    //包含TTL说明可以ping通
                            flag = true;
                            break;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if(flag){
                    ipList.add(item);
                }
                System.out.println("已经完成ip地址为："+item+" 的测试");
                latch.countDown();
            }).start();
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("以下地址可以连接:");
        for(int i=0;i<ipList.size();i++){
            System.out.println(ipList.get(i));
        }
    }
}
