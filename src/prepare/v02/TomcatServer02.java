package prepare.v02;

import http.Request;
import http.Response;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TomcatServer02 {

    public static void main(String[] args) throws Exception{

        ServerSocket serverSocket = new ServerSocket(8888);//暴露服务的端口

        System.out.println("Tomcat(v0.2)服务器已经启动");

        while (true){//无限-----等待请求

            System.out.println("执行线程信息："+Thread.currentThread());
            Socket socket = serverSocket.accept();//使用socket建立连接，如果客户端连接上了
            Request request = new Request(socket.getInputStream());//使用请求封装类来处理请求
            System.out.println("请求的method类型："+request.getMethod());
            System.out.println("请求的路径url："+request.getUrl());


            String res = Response.responseHeader+ "java是最好的语言";//使用HTTP规范的报文头
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(res.getBytes());
            outputStream.flush();
            outputStream.close();
            socket.close();
        }

    }
}
