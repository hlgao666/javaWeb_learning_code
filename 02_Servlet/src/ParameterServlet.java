import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Allen
 * @date 2020/9/12 16:28
 */
public class ParameterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("-----------doGet------------");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] hobby = req.getParameterValues("hobby");

        System.out.println("username: "+username);
        System.out.println("password: "+password);
        System.out.print("hobbies: ");
        for(String item:hobby){
            if(item.equals(hobby[hobby.length-1])){
                System.out.println(item+"  ");
            }else{
                System.out.print(item+"  ");
            }

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("-----------doPost------------");
        req.setCharacterEncoding("UTF-8");      //解决中文乱码问题

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] hobby = req.getParameterValues("hobby");

        System.out.println("username: "+username);
        System.out.println("password: "+password);
        System.out.print("hobbies: ");
        for(String item:hobby){
            System.out.print(item+"  ");
        }
    }
}
