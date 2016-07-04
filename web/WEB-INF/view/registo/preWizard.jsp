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

    <link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/bootstrap-theme.min.css" />
    <link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/wizard.css" />

    <!-- Include Bootstrap Datepicker -->
    <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker.min.css" />
    <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker3.min.css" />
    <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.4.5/css/bootstrapvalidator.min.css " />


</head>
<body>
<jsp:include page="../topbar.jsp"/>
<div class="container">
    <form method="post" id="preForm" role="form" action="/SocialDrink/register">
        <div class="row setup-content">
            <div class="col-xs-12">
                <div class="col-md-12">
                    <div class="col-md-6 col-md-offset-5">
                        <h2 align="left">Registe-se</h2>
                    </div>
                    <div class="col-md-6 col-md-offset-5">
                        <h3 align="left">Facebook</h3>
                    </div>
                    <div class="col-md-6 col-md-offset-5">
                        <h3 align="left">Google</h3>
                    </div>
                    <div class="col-md-6 col-md-offset-5">
                        <h4 align="center">ou</h4>
                    </div>
                    <div class="form-group col-md-6 col-md-offset-5">
                        <label for="tipoConta">Tipo de Conta</label>
                        <select class="form-control" id="tipoConta" name="tipoConta">
                            <option value="utilizador">Utilizador</option>
                            <option value="bar">Bar</option>
                        </select>
                    </div>
                    <div class="form-group col-md-6 col-md-offset-7">
                        <button class="btn btn-primary nextBtn btn-lg" type="submit" value="Register">Registar</button>
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
