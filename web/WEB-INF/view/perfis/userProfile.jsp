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


</head>
<body>
    <div class="container">
        <div class="panel panel-default col-md-3">
            <div class="panel-body" >
                Basic panel example
            </div>
        </div>
        <div class="panel panel-default col-md-7 col-md-offset-1">
            <div class="panel-body" >
                Bebidas
            </div>
        </div>
        <div class="panel panel-default col-md-3">
            <div class="panel-body" >
                Basic panel example
            </div>
        </div>
        <div class="panel panel-default col-md-3 col-md-offset-1">
            <div class="panel-body" >
                Sobre
            </div>
        </div>
        <div class="panel panel-default col-md-3 col-md-offset-1">
            <div class="panel-body" >
                Amigos
            </div>
        </div>
        <div class="panel panel-default col-md-3">
            <div class="panel-body" >
                Contactos
            </div>
        </div>
        <div class="panel panel-default col-md-7 col-md-offset-1">
            <div class="panel-body" >
                Avaliações
            </div>
        </div>
    </div>
</body>
<script src="<c:url value="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>
</html>