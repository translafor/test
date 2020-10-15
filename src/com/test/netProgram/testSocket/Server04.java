package com.test.netProgram.testSocket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server04 {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket ss = new ServerSocket(8886);
        Socket sk = ss.accept();
        // 输入流
        InputStream is = sk.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        // 输出流
        OutputStream os = sk.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        Scanner input = new Scanner(System.in);
        System.out.println("我是服务端");

        Thread thread01=new Thread(()->{
            String receive=null;
            while(true){
                try {
                    if((receive=dis.readUTF())!=null){
                        if(receive.equals("退出")){
                            System.out.println("对方已退出，请回复退出来“退出”");
                            break;
                        }
                        System.out.println("服务端收到消息："+receive);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread02=new Thread(()->{
            String send=null;
            while(true){
                send=input.next();
                try {
                    dos.writeUTF(send);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if(send.equals("退出")){
                    break;
                }
            }
        });

        thread01.start();
        thread02.start();
        thread01.join();
        thread02.join();
        dos.close();
        os.close();
        dis.close();
        is.close();
        sk.close();
        ss.close();

    }
}
