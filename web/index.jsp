<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="My.tomcat.test.GuestBook" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tomcat test</title>
</head>
<body>

<p>Гостевая книга</p>

<table>
    <c:forEach var="map" items="${list}">
        <c:forEach var="entry" items="${map}">
            <tr>
                <td>
                    ${entry.key}
                </td>
                <td>
                    ${entry.value}
                </td>
            </tr>
        </c:forEach>
    </c:forEach>
</table>

<p>Напишите своё сообщение</p>

<form method="post" action="/show">
    <input name="name">
    <br>
    <input name="message">
    <br>
    <input type="submit">
</form>
</body>
</html>
