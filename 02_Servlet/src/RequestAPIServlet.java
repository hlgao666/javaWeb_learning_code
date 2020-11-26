import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Allen
 * @date 2020/9/12 15:39
 */
public class RequestAPIServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("URI--> "+req.getRequestURI());
        System.out.println("URL--> "+req.getRequestURL());
        System.out.println("real ip --> "+req.getRemoteHost());
        System.out.println(req.getRemoteUser());
    }
}
