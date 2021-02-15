package com.JayWang.itheima_05;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket(InetAddress.getLocalHost(),12345);
        BufferedReader br = new BufferedReader(new FileReader("D:\\Desktop\\javaDemo.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.shutdownOutput();
        System.out.println(1111);
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str;
        while((str = brClient.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
        s.close();
    }
}
