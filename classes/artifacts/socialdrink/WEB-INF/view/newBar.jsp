<%--
  Created by IntelliJ IDEA.
  User: jpp
  Date: 08/06/16
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%><html>
<head>
    <title>Registo</title>
    <link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/bootstrap-theme.min.css" />
    <link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/wizard.css" />
</head>
<body>
<jsp:include page="topbar.jsp"/>
<div class="container">
    <div class="stepwizard">
        <div class="stepwizard-row setup-panel">
            <div class="stepwizard-step">
                <a href="#step-1" type="button" class="btn btn-primary btn-circle">1</a>
                <p>Informações de conta</p>
            </div>
            <div class="stepwizard-step">
                <a href="#step-2" type="button" class="btn btn-default btn-circle" disabled="disabled">2</a>
                <p>Informações pessoais</p>
            </div>
            <div class="stepwizard-step">
                <a href="#step-3" type="button" class="btn btn-default btn-circle" disabled="disabled">3</a>
                <p>Confirme as suas informações</p>
            </div>
        </div>
    </div>
    <form role="form">
        <div class="row setup-content" id="step-1">
            <jsp:include page="wizardCommon.jsp"/>
        </div>
        <div class="row setup-content" id="step-2">
            <div class="col-xs-12">
                <div class="col-md-12">
                    <div class="form-group">
                        <label class="control-label">Nome</label>
                        <input maxlength="100" type="text" required="required" class="form-control" placeholder="Introduza o nome do bar" />
                    </div>
                    <div class="form-group">
                        <label class="control-label">Morada</label>
                        <input maxlength="200" type="text" required="required" class="form-control" placeholder="Introduza a morada" />
                    </div>
                    <div class="form-group">
                        <label class="control-label">Cidade</label>
                        <input maxlength="50" type="text" required="required" class="form-control" placeholder="Introduza a cidade" />
                    </div>
                    <div class="form-group">
                        <label class="control-label">Código Postal</label>
                        <input maxlength="50" type="text" required="required" class="form-control" placeholder="Introduza código postal" />
                    </div>
                    <div class="form-group">
                        <label class="control-label">Contacto</label>
                        <input maxlength="10" type="text" required="no" class="form-control" placeholder="Introduza o número de telefone/telemóvel" />
                    </div>
                    <div class="form-group">
                        <label class="control-label">Descrição</label>
                        <textarea maxlength="300" rows="5" type="text" required="no" class="form-control" placeholder="Faça uma breve descrição acerca de si" /></textarea>
                    </div>
                    <button class="btn btn-default prevBtn btn-lg pull-left" type="button" >Anterior</button>
                    <button class="btn btn-primary nextBtn btn-lg pull-right" type="button" >Seguinte</button>
                </div>
            </div>
        </div>
        <div class="row setup-content" id="step-3">
            <div class="col-xs-12">
                <div class="col-md-12">
                    <button class="btn btn-default prevBtn btn-lg pull-left" type="button" >Prev</button>
                    <button class="btn btn-success btn-lg pull-right" type="submit">Finish!</button>
                </div>
            </div>
        </div>
    </form>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="./resources/bootstrap/js/bootstrap.min.js"></script>
<script src="./resources/bootstrap/js/wizard.js"></script>
</body>
</html>
