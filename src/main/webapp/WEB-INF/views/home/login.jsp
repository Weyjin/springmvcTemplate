<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/9
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form role="form" action="/home/loginForm" method="post">
    <div class="form-group">
        <label for="name">用户名</label>
        <input type="text" class="form-control" id="name" name="username" placeholder="请输入用户名">
    </div>
    <div class="form-group">
        <label for="name">密码</label>
        <input type="password" class="form-control" id="password" name="password" placeholder="请输入密码">
    </div>
    <button type="submit" class="btn btn-default">提交</button>
</form>
</body>
</html>
