package app.controller;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import java.io.IOException;
import java.util.List;

import app.model.CreateLibrary;


public class ListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CreateLibrary createLibrary = CreateLibrary.getInstance();
        List<String> names = createLibrary.listName();
//        List<ScientificPublication> sorted = createLibrary.slist();
        req.setAttribute("userNames", names);
//        req.setAttribute("sortedPubl", sorted);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/list.jsp");
        requestDispatcher.forward(req, resp);
    }
}
