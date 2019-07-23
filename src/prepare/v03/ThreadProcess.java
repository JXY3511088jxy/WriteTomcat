package prepare.v03;

import http.Request;
import http.Response;

import java.io.OutputStream;
import java.net.Socket;

/**
 * 自定义的一个线程---专门用于执行tomcat
 */
public class ThreadProcess extends Thread{

    protected Socket socket;//连接

    public ThreadProcess(Socket socket) {
        this.socket = socket;
    }

    public void run(){//重写线程的run方法

        try {
            System.out.println("执行线程信息："+Thread.currentThread());
            Request request = new Request(socket.getInputStream());//使用请求封装类来处理请求
            System.out.println("请求的method类型："+request.getMethod());
            System.out.println("请求的路径url："+request.getUrl());


            String res = Response.responseHeader+ "java";//使用HTTP规范的报文头
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(res.getBytes());
            outputStream.flush();
            outputStream.close();
            socket.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {

            if (socket!=null){
                try{
                    socket.close();
                }catch (Exception e1){
                    e1.printStackTrace();
                }
            }


        }


    }
}
