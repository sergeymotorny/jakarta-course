package com.jak.jakarta_course;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "calc", value = "/calc")
public class CalcServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/jsp/calc.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");
        String operation = req.getParameter("operation");

        double result = 0;
        String errorMessage = "";

        try {
            double number1 = Double.parseDouble(num1);
            double number2 = Double.parseDouble(num2);

            switch (operation) {
                case "add" -> result = number1 + number2;
                case "multiply" -> result = number1 * number2;
                default -> errorMessage = "Invalid operation!";
            }
        } catch (NumberFormatException e) {
            errorMessage = "Invalid input! Please enter valid numbers";
        }

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.println("<html><body>");

        writer.println("<h3>Result: " + result + "</h3>");
        writer.println("<h3>Error: " + errorMessage + "</h3>");
        writer.println("<a href=\"calc\">Go back!</a>");

        writer.println("</body></html>");
    }


}
