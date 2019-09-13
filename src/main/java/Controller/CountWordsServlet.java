package Controller;

import Factory.CounterServiceFactory;
import Service.CounterService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/counter")
public class CountWordsServlet extends HttpServlet {

    CounterService counterService = CounterServiceFactory.getInstance();

    @Override
    protected synchronized void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    @Override
    protected synchronized void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String words = req.getParameter("words");
        Map<String, Integer> wordsCountMap = counterService.getCounterMap(words);
        req.setAttribute("wordsCountMap", wordsCountMap);
        req.getRequestDispatcher("Counter.jsp").forward(req,resp);
    }
}
