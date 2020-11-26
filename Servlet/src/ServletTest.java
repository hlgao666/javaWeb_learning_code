import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author Allen
 * @date 2020/9/11 21:10
 */
public class ServletTest implements Servlet {

    public ServletTest() {
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest httpServletRequest = (HttpServletRequest)servletRequest;
        if("GET".equals(httpServletRequest.getMethod())){
            doGet();
        }else{
            doPost();
        }

    }

    public static void doGet(){
        System.out.println("hello get!!!");
    }

    public static void doPost(){
        System.out.println("hello post!!!");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
