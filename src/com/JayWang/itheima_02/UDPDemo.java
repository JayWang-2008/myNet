package com.JayWang.itheima_02;

import java.io.IOException;
import java.net.*;

public class UDPDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        byte[] buffer = "我爱你".getBytes();
        DatagramPacket dp = new DatagramPacket(buffer,
                buffer.length,
                InetAddress.getByName("192.168.31.250"),
                10086);
        ds.send(dp);
        ds.close();
        DatagramSocket read = new DatagramSocket(10086);
        byte[] b = new byte[1024];
        DatagramPacket r = new DatagramPacket(b,dp.getLength());
        read.receive(r);
        byte[] datas = r.getData();
        String str = new String(datas);
        System.out.println("数据是："+str);
    }
}
