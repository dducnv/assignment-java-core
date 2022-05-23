<%--
  Created by IntelliJ IDEA.
  User: ducnv
  Date: 21/05/2022
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div  style="display: flex;justify-content:center;align-items: center;min-height: 100vh">
    <div >
        <div style="border:1px solid #000;padding: 10px">
            <h1 style="text-align: center;font-size:18px">Login</h1>
            <form action="/login" method="post">
                <div style="margin-bottom: 5px">
                    <label for="username">Username</label><br/>
                    <input style="margin-bottom: 3px" id="username" name="username" type="text"/>
                    <br/>
                    <span style="color: red;font-size: 10px">Vui lòng nhập.</span>
                </div>
                <div>
                    <label for="password">Password</label><br/>
                    <input style="margin-bottom: 3px" id="password" name="password" type="password"/>
                    <br/>
                    <span style="color: red;font-size: 10px">Vui lòng nhập.</span>
                </div>
                <br/>
                <div style="display: flex;align-items: center">
                    <button type="submit" style="margin-right: 5px">submit</button>
                    <button type="reset" style="margin-right: 5px">reset</button>
                    <a style="text-align: center" href="/register">Register</a>
                </div>
            </form>
        </div>

    </div>



</div>
</body>
</html>
