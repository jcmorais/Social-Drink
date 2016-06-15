<%--
  Created by IntelliJ IDEA.
  User: jpp
  Date: 15/06/16
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="col-xs-12">
    <div class="col-md-12">
        <div class="col-md-7 col-md-offset-3">
            <h2 align="left">Informação do Bar</h2>
        </div>
        <div class="form-group col-xs-10 col-xs-offset-0 col-md-3">
            <div class="text-center">
                <img src="//placehold.it/100" class="avatar img-circle" alt="avatar">
                <h4>Carregue uma foto de perfil</h4>
                <input type="file" class="form-control">
            </div>
        </div>
        <div class="form-group col-md-7 col-md-offset-0">
            <label class="control-label">Nome</label>
            <input maxlength="100" type="text" required="required" class="form-control" placeholder="Introduza o nome do bar" />
        </div>
        <div class="form-group col-md-7 col-md-offset-0">
            <label class="control-label">Morada</label>
            <input maxlength="200" type="text" required="required" class="form-control" placeholder="Introduza a morada do bar" />
        </div>
        <div class="form-group col-md-7 col-md-offset-0">
            <label class="control-label">Cidade</label>
            <input maxlength="50" type="text" required="required" class="form-control" placeholder="Introduza a cidade" />
        </div>
        <div class="form-group col-md-7 col-md-offset-3">
            <label class="control-label">Contacto</label>
            <input maxlength="10" type="text" required="no" class="form-control" placeholder="Introduza o número de telefone" />
        </div>
        <div class="form-group col-md-7 col-md-offset-3">
            <label class="control-label">Descrição</label>
            <textarea maxlength="300" rows="5" type="text" required="no" class="form-control" placeholder="Faça uma breve descrição acerca de si" /></textarea>
        </div>
        <div class="form-group col-md-7 col-md-offset-3">
            <button class="btn btn-default prevBtn btn-lg pull-left" type="button" >Anterior</button>
            <button class="btn btn-primary nextBtn btn-lg pull-right" type="button" >Seguinte</button>
        </div>
    </div>
</div>