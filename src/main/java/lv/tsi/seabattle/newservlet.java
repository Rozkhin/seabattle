package lv.tsi.seabattle;

import lv.tsi.seabattle.model.player;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "newservlet",urlPatterns = "/register")
public class newservlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("player-name");
        player player = new player();
        player.setName(name);

        response.sendRedirect("waiteEnemyRegister");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String name = request.getParameter("player-name");
    System.out.println("player:"+name);

        request.getRequestDispatcher("/WEB-INF/register.jsp")
            .include(request,response);
    }
}
