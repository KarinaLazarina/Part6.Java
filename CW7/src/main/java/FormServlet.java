import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("form.html").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String FName = req.getParameter("first_name");
        System.out.println(FName);

//        resp.setContentType("application/json");
//        resp.getOutputStream().println(FName);


        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.println(FName);
    }
}
