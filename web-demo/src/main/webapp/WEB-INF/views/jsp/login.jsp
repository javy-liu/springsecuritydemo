<%--
  Created by IntelliJ IDEA.
  User: faith
  Date: 13-6-24
  Time: 下午2:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="<%=path %>/j_spring_security_check" method="post">
    USERNAME:<input type="text" name="j_username" value="${sessionScope['SPRING_SECURITY_LAST_USERNAME']}" /><br/>
    PASSWORD:<input type="password" name="j_password" value="" /><br/>
    <input type="checkbox" name="_spring_security_remember_me" />两周之内不必登陆<br/>
    <input type="submit">
</form>
</body>
</html>