package com.JayWang.itheima_05;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(12345);
        Socket s = ss.accept();
        Thread t = new Thread(new ServerThread(s));
        t.start();
    }
}
