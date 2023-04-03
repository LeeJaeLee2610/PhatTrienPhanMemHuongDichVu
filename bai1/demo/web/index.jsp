<%-- 
    Document   : index
    Created on : Mar 13, 2023, 8:08:36 AM
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
        <h1>Hello World!</h1>
        <form action="UserServlet">
            <div>
                <lable>Id: </lable>
                <input type="text" name="id" />
            </div>
            <div>
                <lable>Price: </lable>
                <input type="text" name="price" />
            </div>
            <input type="submit" value="Submit"/>
        </form>
    </body>
</html>
