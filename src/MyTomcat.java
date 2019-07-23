import servlet.HttpServlet;
import sun.net.idn.Punycode;

import java.security.PublicKey;
import java.util.HashMap;

/**
 * 手写tomcat（整体流程）
 */
public class MyTomcat {
    //使用一个HashMap进行存储，初始化servlet信息
    public static final HashMap<String, HttpServlet> servletMapping = new HashMap<>();
    public static void main(String[] args) {
        //第一个步骤初始化servlet
        //资源路径
        String basePath;

    }
}
