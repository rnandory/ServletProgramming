import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/hi")
public class SecondServlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        System.out.println("hello Second Servlet");
        PrintWriter out = response.getWriter();
        out.println("Hello Second Servlet!");
    }
}