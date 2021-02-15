package com.JayWang.itheima_05;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket s;

    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        BufferedReader br = null;
            try {
                br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            BufferedWriter bw = null;
            try {
                bw = new BufferedWriter(new FileWriter("D:\\Desktop\\Buffered.txt"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            String line;
            while (true) {
                try {
                    if (!((line = br.readLine()) != null)) {
                        break;
                    }
                    System.out.println(line);
                    bw.write(line);
                    bw.newLine();
                    bw.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            BufferedWriter bwServer = null;
            try {
                bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                bwServer.write("文件上传成功");
                bwServer.newLine();
                bwServer.flush();
                s.close();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
