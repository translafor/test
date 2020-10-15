package com.test.netProgram.testSocket;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client04 {

    public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
        // TODO Auto-generated method stub
        Socket sk = new Socket("127.0.0.1", 8886);
        // 输出流
        OutputStream os = sk.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        Scanner input = new Scanner(System.in);
        // 输入流
        InputStream is = sk.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        System.out.println("我是客户端");
        Thread t1 = new Thread() {
            public void run() {
                String receive = null;
                while(true) {
                    try {
                        //收到
                        if ((receive = dis.readUTF()) != null) {
                            if(receive.equals("退出")) {
                                System.out.println("对方已关闭窗口，请回复“退出”");
                                break;
                            }
                            System.err.println("客户端收到消息：" + receive);
                        }
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                String send = null;
                while(true) {
                    // 发出
                    send = input.next();
                    try {
                        dos.writeUTF(send);
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    if (send.equals("退出")) {
                        break;
                    }
                }
            }
        };
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        dis.close();
        is.close();
        dos.close();
        os.close();
        sk.close();
    }

}
