package http;

import java.io.OutputStream;

/**
 * Http的响应封装类
 */
public class Response {

    public OutputStream outputStream;

    //状态行
    //Http版本、状态码、状态信息
    //响应报文头部
    //用于说明服务器要使用的附件资源
    //空行
    //请求头和主体数据间必须有换行
    public static String responseHeader = "HTTP/1.1 200 \r\n"
            +"Content-Type:text/html\r\n"
            +"\r\n";

    public Response(OutputStream outputStream) {
        this.outputStream = outputStream;
    }
}
