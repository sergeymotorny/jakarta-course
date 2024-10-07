package com.jakarta_course.servlets;

import com.jakarta_course.beans.DateBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet(name = "date", value = "/date")
public class DateServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/jsp/date.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String enteredDate = req.getParameter("enteredDate");
        String enteredTime = req.getParameter("enteredTime");

        LocalDateTime localDateTime = null;
        if (enteredDate != null && !enteredDate.isEmpty() && enteredTime != null && !enteredTime.isEmpty()) {
            localDateTime = LocalDateTime.parse(enteredDate + "T" + enteredTime);
        }

        DateBean dateBean = new DateBean();

        dateBean.setEnteredDateAndTime(localDateTime);

        req.setAttribute("dateBean", dateBean);
        req.getRequestDispatcher("/WEB-INF/jsp/date.jsp")
                .forward(req, resp);
    }
}
