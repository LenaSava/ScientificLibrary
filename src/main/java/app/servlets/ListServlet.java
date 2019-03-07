package app.servlets;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import java.io.IOException;
import java.util.List;

import app.entities.PublicationFactory;
import app.entities.ScientificPublication;
import app.model.Model;
import app.model.PublicationType;



public class ListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Model model = Model.getInstance();
        List<String> names = model.listName();
//        List<ScientificPublication> sorted = model.slist();
        req.setAttribute("userNames", names);
//        req.setAttribute("cortedPubl", sorted);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/list.jsp");
        requestDispatcher.forward(req, resp);
    }
}
