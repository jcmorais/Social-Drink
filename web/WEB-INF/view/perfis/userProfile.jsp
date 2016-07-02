<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jpp
  Date: 28/06/16
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Social Drink</title>

    <link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/css/panels.css"/>" rel="stylesheet">



</head>
<body>
<jsp:include page="../topbar.jsp"/>
<div class="container" style="padding-top: 100px">
    <div class="col-md-12">
        <div class="panel panel-default col-md-3">
            <div class="panel-body" >
                <img class="img-responsive center-block drink-main-image" src="<c:url value="${user.getPhoto().getFilePath()}"/>"/>
                <c:out value="${user.firstname} ${user.lastname}"></c:out>
            </div>
        </div>
        <div class="col-md-7 col-md-offset-1">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Bebidas</h3>
                </div>
                <div class="panel-body" >
                </div>
            </div>
        </div>
    </div>
    <div class="col-md-12">
        <div class="panel panel-default col-md-3">
            <div class="panel-body" >
                <c:out value="${user.description}"></c:out>
            </div>
        </div>
        <div class="col-md-4 col-md-offset-1">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Sobre</h3>
                </div>
                <div class="panel-body">
                    <div class="col-md-7"><b>Data de nascimento:</b></div>
                    <div class="col-md-5"><c:out value="${user.birthday}"></c:out></div>
                    <div class="col-md-7"><b>Profissão:</b></div>
                    <div class="col-md-5"><c:out value="${user.profession}"></c:out></div>
                    <div class="col-md-7"><b>Género:</b></div>
                    <div class="col-md-5"><c:out value="${user.sex}"></c:out></div>
                    <div class="col-md-7"><b>Localidade:</b></div>
                    <div class="col-md-5"><c:out value="${user.city.name}"></c:out></div>
                </div>
            </div>
        </div>
        <div class="col-md-3">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Amigos</h3>
                </div>
                <div class="panel-body">
                </div>
        </div>
        </div>
        </div>
    <div class="col-md-12">
        <div class="col-md-3">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Contactos</h3>
                </div>
                <div class="panel-body" >
                    <div class="col-md-6"><b>Email:</b></div>
                    <div class="col-md-6"><c:out value="${user.email}"></c:out></div>
                    <div class="col-md-6"><b>Telefone:</b></div>
                    <div class="col-md-6"><c:out value="${user.contact}"></c:out></div>
                </div>
            </div>
        </div>
        <div class="col-md-7 col-md-offset-1">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Avaliações</h3>
                </div>
                <div class="panel-body">
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script src="<c:url value="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>
</html>