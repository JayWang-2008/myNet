package com.JayWang.itheima_01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress i = InetAddress.getLocalHost();
        String name = i.getHostName();
        String ip = i.getHostAddress();
        System.out.println("主机名："+name);
        System.out.println("IP地址："+ip);
    }
}
