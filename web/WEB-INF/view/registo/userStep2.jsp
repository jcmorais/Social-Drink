<%--
  Created by IntelliJ IDEA.
  User: jpp
  Date: 08/06/16
  Time: 18:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%><html>

<div class="col-xs-12">
    <div class="col-md-12">
        <div class="col-md-7 col-md-offset-3">
            <h2 align="left">Informação Pessoal</h2>
        </div>
        <div class="form-group col-xs-10 col-xs-offset-0 col-md-3">
            <div class="text-center">
                <img src="//placehold.it/100" class="avatar img-circle" alt="avatar">
                <h4>Carregue uma foto de perfil</h4>
                <input type="file" class="form-control">
            </div>
        </div>
        <div class="form-group col-md-7 col-md-offset-0">
            <label class="control-label">Primeiro nome</label>
            <input maxlength="100" type="text" required="required" class="form-control" id="primeironome" name="primeironome" placeholder="Introduza o seu primeiro nome" />
        </div>
        <div class="form-group col-md-7 col-md-offset-0">
            <label class="control-label">Ultimo nome</label>
            <input maxlength="100" type="text" required="required" class="form-control" id="ultimonome" name="ultimonome" placeholder="Introduza o seu ultimo nome" />
        </div>
        <div class="form-group col-md-7 col-md-offset-0">
            <label class="control-label">Profissão</label>
            <input maxlength="100" type="text" required="required" class="form-control" id="profissao" name="profissao" placeholder="Introduza a sua profissão" />
        </div>
        <div class="form-group col-md-7 col-md-offset-3">
            <label class="control-label">Cidade</label>
            <input maxlength="50" type="text" required="required" class="form-control" id="cidade" name="cidade" placeholder="Introduza a cidade" />
        </div>
        <div class="form-group col-md-2 col-md-offset-3">
            <label class="control-label" for="genero">Género</label>
            <select class="form-control" id="genero" name="genero">
                <option value="masc">Masculino</option>
                <option value="fem">Feminino</option>
            </select>
        </div>
        <div class="form-group col-md-2">
            <label class="control-label">Data de nascimento</label>
            <div class="date">
                <div class="input-group input-append date" id="datePicker">
                    <input type="date" class="form-control" name="date" />
                    <span class="input-group-addon add-on btn"><span class="glyphicon glyphicon-calendar"></span></span>
                </div>
            </div>
        </div>
        <div class="form-group col-md-3">
            <label class="control-label">Contacto</label>
            <input maxlength="10" type="text" required="no" class="form-control" id="contacto" name="contacto" placeholder="Introduza o número de telefone" />
        </div>
        <div class="form-group col-md-7 col-md-offset-3">
            <label class="control-label">Descrição</label>
            <textarea maxlength="300" rows="5" type="text" required="no" class="form-control" id="descricao" name="descricao" placeholder="Faça uma breve descrição acerca de si" /></textarea>
        </div>
        <div class="form-group col-md-7 col-md-offset-3">
            <button class="btn btn-default prevBtn btn-lg pull-left" type="button" >Anterior</button>
            <button class="btn btn-primary nextBtn btn-lg pull-right" type="button" >Seguinte</button>
        </div>
    </div>
</div>
