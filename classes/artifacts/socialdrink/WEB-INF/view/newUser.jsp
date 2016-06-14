<%--
  Created by IntelliJ IDEA.
  User: jpp
  Date: 08/06/16
  Time: 18:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%><html>
<head>
    <title>Registo</title>
    <link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/bootstrap-theme.min.css" />
    <link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/wizard.css" />


    <!-- Include Bootstrap Datepicker -->
    <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker.min.css" />
    <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker3.min.css" />


    
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
                        <label class="control-label">Primeiro nome</label>
                        <input maxlength="100" type="text" required="required" class="form-control" placeholder="Introduza o seu primeiro nome" />
                    </div>
                    <div class="form-group">
                        <label class="control-label">Ultimo nome</label>
                        <input maxlength="100" type="text" required="required" class="form-control" placeholder="Introduza o seu ultimo nome" />
                    </div>
                    <div class="form-group">
                        <label class="control-label">Data de nascimento</label>
                        <div class="date">
                            <div class="input-group input-append date" id="datePicker">
                                <input type="text" class="form-control" name="date" />
                                <span class="input-group-addon add-on btn"><span class="glyphicon glyphicon-calendar"></span></span>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label">Género</label>
                            <div class="radio">
                                <label> <input type="radio" name="genero" id="Masculino" value="masculino" checked> Masculino </label>
                            </div>
                            <div class="radio">
                                <label> <input type="radio" name="genero" id="Feminino" value="feminino"> Feminino </label>
                            </div>
                    </div>
                    <div class="form-group">
                        <label class="control-label">Profissão</label>
                        <input maxlength="100" type="text" required="required" class="form-control" placeholder="Introduza a sua profissão" />
                    </div>
                    <div class="form-group">
                        <label class="control-label">Cidade</label>
                        <input maxlength="50" type="text" required="required" class="form-control" placeholder="Introduza a cidade" />
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


</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.min.js"></script>
<script src="./resources/bootstrap/js/bootstrap.min.js"></script>
<script src="./resources/bootstrap/js/wizard.js"></script>
<script src="./resources/bootstrap/js/datepicker.js"></script>
</html>
