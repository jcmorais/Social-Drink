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

    <!-- Include Bootstrap Datepicker -->
    <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker.min.css" />
    <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker3.min.css" />

    <!-- Include local CSS -->

</head>
<body>
<jsp:include page="topbar.jsp"/>
<div class="container">
    <form role="form">
        <div class="row setup-content">
            <div class="col-xs-12">
                <div class="col-md-12">
                    <div class="col-md-6 col-md-offset-5">
                        <h2 align="left">Informação Pessoal</h2>
                    </div>
                    <div class="form-group col-md-4 col-xs-8">
                        <div class="text-center">
                            <img src="//placehold.it/100" class="avatar img-circle" alt="avatar">
                            <h4>Carregue uma foto de perfil</h4>
                            <input type="file" class="form-control">
                        </div>
                    </div>
                    <div class="form-group col-md-7 col-md-offset-1">
                        <label class="control-label">Primeiro nome</label>
                        <input maxlength="100" type="text" required="required" class="form-control" placeholder="Introduza o seu primeiro nome" />
                    </div>
                    <div class="form-group col-md-7 col-md-offset-1">
                        <label class="control-label">Ultimo nome</label>
                        <input maxlength="100" type="text" required="required" class="form-control" placeholder="Introduza o seu ultimo nome" />
                    </div>
                    <div class="form-group col-md-7 col-md-offset-1">
                        <label class="control-label">Profissão</label>
                        <input maxlength="100" type="text" required="required" class="form-control" placeholder="Introduza a sua profissão" />
                    </div>
                    <div class="form-group col-md-7 col-md-offset-5">
                        <label class="control-label">Cidade</label>
                        <input maxlength="50" type="text" required="required" class="form-control" placeholder="Introduza a cidade" />
                    </div>
                    <div class="form-group col-md-2 col-md-offset-5">
                        <label class="control-label" for="sel1">Género</label>
                        <select class="form-control" id="sel1">
                            <option>Masculino</option>
                            <option>Feminino</option>
                        </select>
                    </div>
                    <div class="form-group col-md-2">
                        <label class="control-label">Data de nascimento</label>
                        <div class="date">
                            <div class="input-group input-append date" id="datePicker">
                                <input type="text" class="form-control" name="date" />
                                <span class="input-group-addon add-on btn"><span class="glyphicon glyphicon-calendar"></span></span>
                            </div>
                        </div>
                    </div>
                    <div class="form-group col-md-3">
                        <label class="control-label">Contacto</label>
                        <input maxlength="10" type="text" required="no" class="form-control" placeholder="Introduza o número de telefone" />
                    </div>
                    <div class="form-group col-md-7 col-md-offset-5">
                        <label class="control-label">Descrição</label>
                        <textarea maxlength="300" rows="5" type="text" required="no" class="form-control" placeholder="Faça uma breve descrição acerca de si" /></textarea>
                    </div>
                    <div class="form-group col-md-7 col-md-offset-5">
                    <button class="btn btn-default prevBtn btn-lg pull-left" type="button" >Anterior</button>
                    <button class="btn btn-primary nextBtn btn-lg pull-right" type="button" >Seguinte</button>
                        </div>
                </div>
            </div>
        </div>
    </form>
</div>
</body>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.min.js"></script>
<script src="./resources/bootstrap/js/bootstrap.min.js"></script>
<script src="./resources/bootstrap/js/datepicker.js"></script>

</html>
