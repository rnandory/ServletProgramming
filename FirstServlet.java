import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/hi")
public class FirstServlet extends HttpServlet {
    public void service(HttpServletRequest HttpServletRequest, HttpServletResponse response)
            throws IOException, ServletException {
        System.out.println("hello Servlet 1 2 3 4");
        PrintWriter out = response.getWriter();
        out.println("Hello Servlet!");
    }
}