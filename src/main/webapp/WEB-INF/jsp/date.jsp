<%@ page import="com.jakarta_course.beans.DateBean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Date</title>
</head>
<body>
    <a href="home">Go back!</a>

    <jsp:useBean id="dateBean" scope="request" class="com.jakarta_course.beans.DateBean" />

    <h2 style="text-align: center">Date information</h2>

    <p>Current date and time:
        <jsp:getProperty name="dateBean" property="currentDate"/>
    </p>

    <form method="post" action="date">
        <label for="enteredDate">Setting a new date and time:</label> <br> <br>
        <input type="date" id="enteredDate" name="enteredDate" size="30 /">
        <input type="time" id="enteredTime" name="enteredTime" size="30 /">

        <p>New date and time: </p>
        <jsp:getProperty name="dateBean" property="enteredDateAndTime"/> <br> <br>
        <input type="submit" value="Submit">
    </form>

</body>
</html>
