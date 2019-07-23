package servlet;

import http.Request;
import http.Response;

import java.io.OutputStream;

public class KingServlet extends HttpServlet {


    @Override
    public void doGet(Request request, Response response) {
        try {
            System.out.println("请求的method类型："+request.getMethod());
            System.out.println("请求的路径url："+request.getUrl());

            String res = Response.responseHeader+ "King's tomcat";//使用HTTP规范的报文头
            OutputStream outputStream = response.outputStream;
            outputStream.write(res.getBytes());
            outputStream.flush();
            outputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    @Override
    public void doPost(Request request, Response response) {

    }
}
