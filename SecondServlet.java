import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
// import jakarta.servlet.annotation.WebServlet;

// @WebServlet("/hi")
public class SecondServlet extends HttpServlet {
    public void service(HttpServletRequest HttpServletRequest, HttpServletResponse response)
            throws IOException, ServletException {
        System.out.println("hello Second Servlet 1 2 3 4");
        PrintWriter out = response.getWriter();
        out.println("Hello Second Servlet!");
    }
}