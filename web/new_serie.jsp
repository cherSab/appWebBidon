<%-- 
    Document   : new_serie
    Created on : 21 juin 2016, 11:57:57
    Author     : cherg
--%>

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
            <h1>Ajout serie</h1>
            <div>
                <form method="post">
                    Titre: <input name="titre"/>
                    <br>
                    Genre:
                    <select name="genre_id">
                        <c:forEach items="${genres}" var="genre">
                            <option value="${genre.id}">${genre.nom}</option>
                        </c:forEach>
                    </select>
                    <br>
                    <input type="submit"/>
                </form>
            </div>
        </div>
        <div class="pied">
            <c:import url="_PIED.jsp"/>
        </div>
    </body>
</html>
