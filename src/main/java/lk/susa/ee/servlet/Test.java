package lk.susa.ee.servlet;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lk.susa.ee.ejb.UserSessionBean;

import java.io.IOException;


@WebServlet("/test")
public class Test extends HttpServlet {

    @EJB
    private UserSessionBean userSessionBean;

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        userSessionBean.doAction("Amal",20);
    }
}
