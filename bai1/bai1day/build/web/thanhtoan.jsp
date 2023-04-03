<%-- 
    Document   : thanhtoan
    Created on : Mar 13, 2023, 2:26:23 PM
    Author     : LeeJaeLee
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!--<h1>Hello World!</h1>-->
        <ul>
            <c:forEach items="${listCart}" var="o">
                
            </c:forEach>
        </ul>
    </body>
</html>
