<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jpp
  Date: 22/06/16
  Time: 00:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta charset="utf-8">
    <title>Registo</title>

    <link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/css/wizard.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/css/style-index-template.css"/>" rel="stylesheet">

    <!-- Include Bootstrap Datepicker -->
    <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker.min.css" />
    <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker3.min.css" />
    <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.4.5/css/bootstrapvalidator.min.css " />


</head>
<body>
<jsp:include page="../topbar.jsp"/>
<div class="container" style="padding-top: 100px">
    <form method="post" id="preForm" role="form" action="/SocialDrink/register">
        <div class="row setup-content">
            <div class="col-xs-12">
                <div class="col-md-12">
                    <div class="sec-title text-center col-md-7 col-md-offset-3">
                        <h2 align="left">Registe-se</h2>
                    </div>
                    <div class="col-md-5 col-md-offset-3" style="padding-top: 20px">
                        <h4>Por favor escolha o seu tipo de utilizador para ter uma experiência mais adequada às suas necessidades.<br>
                        Se é dono de um estabelecimente escolha o tipo de utilizador Bar. <br>
                        Se é apenas um consumidor ou criador de bebidas por conta própria escolha o tipo de utilizador Utilizador</h4>
                    </div>
                    <div class="form-group col-md-5 col-md-offset-3" style="padding-top: 20px">
                        <label for="tipoConta"><h4>Tipo de Conta</h4></label>
                        <select class="form-control" id="tipoConta" name="tipoConta">
                            <option value="utilizador">Utilizador</option>
                            <option value="bar">Bar</option>
                        </select>
                    </div>
                    <div class="form-group col-md-7 col-md-offset-3" style="padding-top: 20px">
                        <button class="btn btn-primary nextBtn btn-lg" type="submit" value="Register" style="background: #0eb493">Registar</button>
                    </div>
                </div>
            </div>
        </div>
    </form>
</div>
</body>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="./resources/bootstrap/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.4.5/js/bootstrapvalidator.min.js"></script>
<script src="./resources/bootstrap/js/validator.js"></script>

</html>
