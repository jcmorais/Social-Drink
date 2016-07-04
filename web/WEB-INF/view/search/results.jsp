<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jpp
  Date: 04/07/16
  Time: 02:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><c:out value="Search"></c:out></title>

    <link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/css/style-index-template.css"/>" rel="stylesheet">

</head>
<body>
<c:if test="${sessionid != -1}">
    <jsp:include page="../topbar.jsp"/>
</c:if>
<c:if test="${sessionid == -1}">
    <jsp:include page="../topbaranon.jsp"/>
</c:if>
<div class="container" style="padding-top: 100px">
    <div class="col-md-12">
        <c:if test="${empty consumersRes}">
            <c:if test="${empty barsRes}">
                <c:if test="${empty drinksRes}">
                    <h2>Não foram encontrados resultados para a pesquisa.</h2>
                </c:if>
            </c:if>
        </c:if>
        <c:if test="${not empty consumersRes}">
            <h2>Utilizadores</h2>
            <c:forEach var="consumerRes" items="${consumersRes}">
                <a href="/SocialDrink/user/${consumerRes.getID()}" style="color: inherit">
                    <div class="col-md-12">
                        <div class="col-md-2">
                            <img height="150" width="150" class="img-responsive center-block" src="<c:url value="${consumerRes.getPhoto().getFilePath()}"/>"/>
                        </div>
                        <div class="col-md-9">
                            <h3><c:out value="${consumerRes.firstname} ${consumerRes.lastname}"></c:out></h3>
                            <h5><c:out value="${consumerRes.profession}"></c:out></h5>
                            <h5><c:out value="Nasceu a ${consumerRes.birthday}"></c:out></h5>
                            <h5><c:out value="De ${consumerRes.city.name}"></c:out></h5>
                        </div>
                    </div>
                </a>
            </c:forEach>
        </c:if>
    </div>
    <div class="col-md-12">
        <c:if test="${not empty barsRes}">
            <h2>Bares</h2>
            <c:forEach var="barRes" items="${barsRes}">
                <a href="/SocialDrink/user/${barRes.getID()}" style="color: inherit">
                    <div class="col-md-12">
                        <div class="col-md-2">
                            <img height="150" width="150" class="img-responsive center-block" src="<c:url value="${barRes.getPhoto().getFilePath()}"/>"/>
                        </div>
                        <div class="col-md-9">
                            <h3><c:out value="${barRes.name}"></c:out></h3>
                            <h5><c:out value="Localizado em ${barRes.address.city.name}"></c:out></h5>
                        </div>
                    </div>
                </a>
            </c:forEach>
        </c:if>
    </div>
    <div class="col-md-12">
        <c:if test="${not empty drinksRes}">
            <h2>Bebidas</h2>
            <c:forEach var="drinkRes" items="${drinksRes}">
                <a href="/SocialDrink/drink/${drinkRes.getID()}" style="color: inherit">
                    <div class="col-md-12">
                        <div class="col-md-2">
                            <img height="150" width="150" class="img-responsive center-block" src="<c:url value="${drinkRes.getPhoto().getFilePath()}"/>"/>
                        </div>
                        <div class="col-md-9">
                            <h3><c:out value="${drinkRes.name}"></c:out></h3>
                        </div>
                    </div>
                </a>
            </c:forEach>
        </c:if>
    </div>
</div>
</body>

<script src="<c:url value="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/retina-1.1.0.js" />"></script>

</html>