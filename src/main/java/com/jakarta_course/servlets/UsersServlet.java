package com.jakarta_course.servlets;

import com.jakarta_course.models.User;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "users", value = "/users")
public class UsersServlet extends HttpServlet {

    private final List<User> users = new ArrayList<>();

    @Override
    public void init(ServletConfig config) {
        users.add(new User("Viktor", "Run", 25));
        users.add(new User("Andrey", "Lucky", 19));
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();
        writer.println("<html><body>");

        writer.println("<a href=\"home\">Go back!</a> <br> <br>");

        writer.println("<h3>Users:</h3>");
        int counter = 0;
        for (User user : users) {
            writer.println(
                    "<p>" + counter++ + " "
                            + user.getFirstName() + " "
                            + user.getLastName() + ", "
                            + user.getAge() + "</p>"
            );
        }

        writer.println("</body></html>");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String userId = req.getParameter("id");

        if (userId == null || userId.isEmpty()) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            resp.getWriter().write("User ID is missing");
        } else {
            resp.setStatus(HttpServletResponse.SC_OK);
            users.remove(Integer.parseInt(userId));
        }
    }
}