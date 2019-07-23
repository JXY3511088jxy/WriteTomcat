package servlet;

import http.Request;
import http.Response;

import java.io.IOException;

public interface IServlet {
    void init();

    void service(Request request, Response response) throws IOException;

    void destroy();
}
