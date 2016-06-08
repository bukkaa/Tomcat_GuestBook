package My.tomcat.test;

import java.io.IOException;


@javax.servlet.annotation.WebServlet("/show")
public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        if ( (!request.getParameter("name").isEmpty()) && (!request.getParameter("message").isEmpty()) ) {

            new GuestBook().putGuest(request.getParameter("name"), request.getParameter("message"));

            request.setAttribute("list", GuestBook.book);
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
