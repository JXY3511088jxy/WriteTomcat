package prepare.v03;

import http.Request;
import http.Response;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 手写版本3.0版本，加入多线程处理模式BIO
 */
public class TomcatServer03 {

    public static void main(String[] args) throws Exception{

        ServerSocket serverSocket = new ServerSocket(8088);//暴露服务的端口

        System.out.println("Tomcat(v0.3)服务器已经启动");

        while (true){//无限-----等待请求

            Socket socket = serverSocket.accept();//使用socket建立连接，如果客户端连接上了
            Thread thread = new ThreadProcess(socket);
            thread.start();
        }

    }
}
