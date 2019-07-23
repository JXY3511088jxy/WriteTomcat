package servlet;

import http.Request;
import http.Response;

import java.io.IOException;

/**
 * http请求的servlet
 */

public abstract class HttpServlet implements IServlet{


    @Override
    public void init() {

    }

    @Override
    public void service(Request request, Response response) throws IOException {
        if("get".equals(request.getMethod())){
            this.doGet(request,response);
        }else {
            this.doPost(request,response);
        }

    }

    public abstract void doGet(Request request, Response response);//待继承的类去实现

    public abstract void doPost(Request request, Response response);

    @Override
    public void destroy() {

    }
}
