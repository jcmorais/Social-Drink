<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jpp
  Date: 15/06/16
  Time: 18:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta charset="utf-8">
    <title>Novo Utilizador</title>

    <!-- Include Bootstrap -->
    <link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/css/wizard.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/css/style-index-template.css"/>" rel="stylesheet">

    <!-- Include Bootstrap Datepicker -->
    <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker.min.css" />
    <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker3.min.css" />

    <!-- Include Bootstrap Validator -->
    <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.4.5/css/bootstrapvalidator.min.css" />

</head>
<body>
<jsp:include page="../topbaranon.jsp"/>
<div class="container" style="padding-top: 100px">
    <div class="stepwizard">
        <div class="stepwizard-row setup-panel">
            <div class="stepwizard-step">
                <a href="#step-1" type="button" class="btn btn-primary btn-circle" style="background: #0eb493">1</a>
                <p>Informação de Conta</p>
            </div>
            <div class="stepwizard-step">
                <a href="#step-2" type="button" class="btn btn-default btn-circle" disabled="disabled" style="background: #0eb493">2</a>
                <p>Informações Pessoal</p>
            </div>
        </div>
    </div>
    <form method="post" id="formUser" role="form" action="/SocialDrink/register/newUser" enctype="multipart/form-data">
        <div class="row setup-content" id="step-1">
            <jsp:include page="bothStep1.jsp"/>
        </div>
        <div class="row setup-content" id="step-2">
            <jsp:include page="userStep2.jsp"/>
        </div>
    </form>
</div>
</body>

<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.4.5/js/bootstrapvalidator.min.js"></script>
<script src="<c:url value="/resources/bootstrap/js/datepicker.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/wizard.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/validator.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/userphoto.js" />"></script>

</html>
