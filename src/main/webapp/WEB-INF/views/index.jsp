<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to Our User Registeration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        .container {
            max-width: 1200px;
            margin: 0 auto;
            padding: 20px;
        }
        header {
            background-color: #007BFF;
            color: white;
            padding: 20px;
            text-align: center;
        }
        .links {
            margin-top: 20px;
            text-align: center;
        }
        .links a {
            text-decoration: none;
            padding: 10px 20px;
            color: white;
            background-color: #28a745;
            margin: 0 10px;
            border-radius: 5px;
        }
        .links a:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>
    <header>
        <h1>Welcome to Our User Registeration Website</h1>
    </header>

    <div class="container">
        <div class="links">
            <p style="color: lime;;font-size: medium;">Please choose an action:</p><br><br>
            <a href="${pageContext.request.contextPath}/register">Go to Register Page</a> <br><br><br><br><br>
            <a href="${pageContext.request.contextPath}/login">Go to Login Page</a>
        </div>
    </div>
</body>
</html>
