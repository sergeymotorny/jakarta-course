<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
    <a href="home">Go back!</a>

    <div style="margin-top: 20px; margin-left: 20px;">
        <h2>Calc:</h2>

        <form method="post" action="calc" >
            <label for="num1">Number 1:</label>
            <input type="number" id="num1" name="num1" required> <br> <br>

            <label for="num2">Number2:</label>
            <input type="number" id="num2" name="num2" required> <br> <br>

            <label for="operation">Operation</label>
            <select name="operation" id="operation">
                <option value="add">+</option>
                <option value="multiply">*</option>
            </select> <br> <br>

            <button type="submit">Submit</button>
            <button type="reset">Reset</button>
        </form>
    </div>
</body>
</html>
