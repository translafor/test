package com.test.netProgram.testSocket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client03 {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("127.0.0.1",8886);
            OutputStream os=socket.getOutputStream();

            //把输出流封装在DataOutputStream中
            DataOutputStream dos = new DataOutputStream(os);
            //使用writeUTF发送字符串
            dos.writeUTF("Legendary!");
            dos.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
