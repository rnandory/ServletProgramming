import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class FirstServlet extends HttpServlet {
    public void service(HttpServletRequest HttpServletRequest, HttpServletResponse response)
            throws IOException, ServletException {
        System.out.println("hello Servlet");
    }
}