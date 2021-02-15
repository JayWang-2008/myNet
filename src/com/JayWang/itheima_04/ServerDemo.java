package com.JayWang.itheima_04;

import com.JayWang.itheima_03.Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        while (true) {
            ServerSocket ss = new ServerSocket(28513);
            Socket s = ss.accept();
            InputStream is = s.getInputStream();
            byte[] buffer = new byte[1024];
            StringBuilder sb = new StringBuilder();
            int len;
            len = is.read(buffer);
            sb.append(new String(buffer));
            System.out.println("客户端：" + sb.toString());
            OutputStream os = s.getOutputStream();
            os.write("服务器：数据已经收到".getBytes("UTF-8"));
            ss.close();
        }
    }
}
