package app.servlets;

import app.entities.ScientificPublication;
import app.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/add.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String lastName = req.getParameter("lastName");
        String title = req.getParameter("title");
        String age = req.getParameter("age");
        ScientificPublication scientificPublication = new ScientificPublication(name, lastName, title, age);
        Model model = Model.getInstance();
        model.add(scientificPublication);

        req.setAttribute("userName", name);
        doGet(req, resp);
    }
}
