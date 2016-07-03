<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><%--
  Created by IntelliJ IDEA.
  User: jpp
  Date: 08/06/16
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%><html>
<head>
    <title>Novo Bar</title>

    <link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/css/wizard.css"/>" rel="stylesheet">

    <!-- Include Bootstrap Clockpicker -->
    <link href="<c:url value="/resources/bootstrap/css/bootstrap-clockpicker.min.css"/>" rel="stylesheet">

    <!-- Include Bootstrap Validator -->
    <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.4.5/css/bootstrapvalidator.min.css" />

</head>
<body>
<jsp:include page="../topbaranon.jsp"/>
<div class="container">
    <div class="stepwizard">
        <div class="stepwizard-row setup-panel">
            <div class="stepwizard-step">
                <a href="#step-1" type="button" class="btn btn-primary btn-circle">1</a>
                <p>Informações de Conta</p>
            </div>
            <div class="stepwizard-step">
                <a href="#step-2" type="button" class="btn btn-default btn-circle" disabled="disabled">2</a>
                <p>Informações do Bar</p>
            </div>
            <div class="stepwizard-step">
                <a href="#step-3" type="button" class="btn btn-default btn-circle" disabled="disabled">3</a>
                <p>Horário de funcionamento</p>
            </div>
        </div>
    </div>
    <form method="post" id="formBar" role="form" action="/SocialDrink/register/newBar" enctype="multipart/form-data">
        <div class="row setup-content" id="step-1">
            <jsp:include page="bothStep1.jsp"/>
        </div>
        <div class="row setup-content" id="step-2">
            <jsp:include page="barStep2.jsp"/>
        </div>
        <div class="row setup-content" id="step-3">
            <jsp:include page="barStep3.jsp"/>
        </div>
    </form>
</div>
</body>

<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.4.5/js/bootstrapvalidator.min.js"></script>
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/bootstrap-clockpicker.min.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/clockpicker.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/wizard.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/validator.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/userphoto.js" />"></script>

</html>
