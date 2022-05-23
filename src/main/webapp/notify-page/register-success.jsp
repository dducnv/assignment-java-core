<%@ page import="com.example.t2009m1helloworld.entity.Account" %><%
    Account account = (Account) request.getAttribute("account");
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<div class="row">
    <div class="col-4 m-auto mt-10">
        <div class="alert alert-success" role="alert">
            Register Success
        </div>
        <ul>
            <li><%= account.getFullName()%></li>
            <li><%= account.getUsername()%></li>
            <li><%= account.getEmail()%></li>
            <li><%= account.getPhone()%></li>
            <li><%= account.getBirthday()%></li>
            <li><%= account.getPassword()%></li>
        </ul>
    </div>
</div>
</body>
</html>
