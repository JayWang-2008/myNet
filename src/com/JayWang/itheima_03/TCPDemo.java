package com.JayWang.itheima_03;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),28513);
        OutputStream os = socket.getOutputStream();
        System.out.println("请输入信息");
        os.write(new Scanner(System.in).nextLine().getBytes("UTF-8"));
        socket.close();
    }
}
