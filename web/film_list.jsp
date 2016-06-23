<%-- 
    Document   : _TEMPLATE
    Created on : 17 juin 2016, 10:50:04
    Author     : tom
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <c:import url="_STYLESHEET.jsp"/>
    </head>
    <body>
        <div class="titre">
            <c:import url="_TITRE.jsp"/>
        </div>
        <div class="menu">
            <c:import url="_MENU.jsp"/>
        </div>
        <div class="contenu">
            <h1>Liste des films</h1>
            <c:forEach items="${films}" var="film">
                <a href="film_detail?id=${film.id}">${film.titre}</a>
                <br>
            </c:forEach>
            <c:forEach items="${series}" var="serie">
            <a href="serie_detail?id=${serie.id}">${serie.titre}</a>
            <br>
            </c:forEach>
        
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp"/>
        </div>
    </body>
</html>