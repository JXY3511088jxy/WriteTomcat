package http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Http请求封装
 */
public class Request {
    //请求类型
    private String method;//get，post等方法
    //请求资源的路径  url
    private String url;

    public Request(InputStream inputStream) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
        String[] input = reader.readLine().split(" ");//读取第一行，成为一个数组
        this.method = input[0];//数组的第一个
        this.url = input[1];//数组的第二个


    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
