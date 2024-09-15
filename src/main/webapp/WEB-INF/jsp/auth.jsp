<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Auth</title>
</head>
<body>
    <div>
        <form style="margin-top: 20px; margin-left: 20px" method="post" action="auth">
            <label for="login">Login:</label>
            <input style="margin-bottom: 20px" type="text" id="login" name="login" required> <br> <br>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required> <br> <br>

            <button type="submit">Submit</button>
        </form>
    </div>
</body>
</html>
