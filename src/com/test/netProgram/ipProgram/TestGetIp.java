package com.test.netProgram.ipProgram;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestGetIp {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress host=InetAddress.getLocalHost();
        String ip=host.getHostAddress();
        System.out.println("本地ip地址: "+InetAddress.getLocalHost().getHostAddress());
    }
}
