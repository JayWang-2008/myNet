package com.JayWang.itheima_04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        while (true) {
            Socket socket = new Socket(InetAddress.getLocalHost(), 28513);
            OutputStream os = socket.getOutputStream();
            os.write("Hello TCP".getBytes("UTF-8"));
            InputStream is = socket.getInputStream();
            int len;
            byte[] buffer = new byte[1024];
            StringBuilder sb = new StringBuilder();
            len = is.read(buffer);
            sb.append(new String(buffer));
            System.out.println(sb.toString());
            socket.close();
        }
    }
}
