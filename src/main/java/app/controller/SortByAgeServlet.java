package app.controller;
import app.servises.Messages;
import app.model.CreateLibrary;
import app.servises.SortByAge;
import app.servises.Text;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class SortByAgeServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CreateLibrary createLibrary = CreateLibrary.getInstance();
        SortByAge sort = new SortByAge();
        Text textPrinter= new Text();
        sort.sortByAge(createLibrary.getPublication());


        req.setAttribute("typeOfSort",Text.showMessages("en", Messages.SORTED_BY_AGE));

        req.setAttribute("list",textPrinter.printer(createLibrary.getPublication()));


        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/list.jsp");
        requestDispatcher.forward(req, resp);
    }
}
