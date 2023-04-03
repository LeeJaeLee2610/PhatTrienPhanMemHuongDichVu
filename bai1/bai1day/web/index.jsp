<%-- 
    Document   : index
    Created on : Mar 13, 2023, 10:32:06 AM
    Author     : LeeJaeLee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
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
