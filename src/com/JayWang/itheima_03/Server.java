package com.JayWang.itheima_03;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(28513);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        byte[] buffer = new byte[5];
        int r;
        while((r = is.read(buffer)) != -1){
            System.out.print(new String(buffer));
        }
    }
}
