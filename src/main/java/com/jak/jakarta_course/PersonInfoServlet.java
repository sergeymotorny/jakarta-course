package com.jak.jakarta_course;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "data", value = "/data")
public class PersonInfoServlet extends HttpServlet {
    private String name;
    private int age;

    public void init() {
        name = "Sergey";
        age = 15;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h3>Information:</h3>");
        out.println("<p>" + "Name: " + name + "</p>");
        out.println("<p>" + "Age: " + age + "</p>");
        out.println("</body></html>");

        request.setAttribute("userName", name);
    }

    public void destroy() {
    }
}