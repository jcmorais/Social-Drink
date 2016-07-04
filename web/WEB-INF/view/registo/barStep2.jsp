<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <div class="sec-title col-md-7 col-md-offset-3">
            <h2>Informação do Bar</h2>
        </div>
        <div class="form-group col-xs-10 col-xs-offset-0 col-md-3">
            <img id="userphoto" name="photo" src="<c:url value="//images/user/default.png"/>" alt="avatar" />
            <label class="btn btn-default btn-file">
                Carregue uma foto de perfil
                <input type="file" style="display: none;" name="photoFile" accept="image/jpeg, image/png" onchange="readURL(this);">
            </label>
        </div>
        <div class="form-group col-md-7 col-md-offset-0">
            <label class="control-label">Nome</label>
            <input maxlength="100" type="text" required="required" class="form-control" id="nome" name="nome" placeholder="Introduza o nome do bar" />
        </div>
        <div class="form-group col-md-7 col-md-offset-0">
            <label class="control-label">Morada</label>
            <input maxlength="200" type="text" required="required" class="form-control" id="morada" name="morada" placeholder="Introduza a morada do bar" />
        </div>
        <div class="form-group col-md-7 col-md-offset-0">
            <label class="control-label">Código-Postal</label>
            <input maxlength="20" type="text" required="required" class="form-control" id="codpostal" name="codpostal" placeholder="Introduza o código-postal do bar" />
        </div>
        <div class="form-group col-md-7 col-md-offset-3">
            <label class="control-label">Cidade</label>
            <input maxlength="50" type="text" required="required" class="form-control" id="cidade" name="cidade" placeholder="Introduza a cidade" />
        </div>
        <div class="form-group col-md-7 col-md-offset-3">
            <label class="control-label">Contacto</label>
            <input maxlength="10" type="text" required="no" class="form-control" id="contacto" name="contacto" placeholder="Introduza o número de telefone" />
        </div>
        <div class="form-group col-md-7 col-md-offset-3">
            <label class="control-label">Descrição</label>
            <textarea maxlength="300" rows="5" type="text" required="no" class="form-control" id="descricao" name="descricao" placeholder="Faça uma breve descrição acerca de si" /></textarea>
        </div>
        <div class="form-group col-md-7 col-md-offset-3">
            <button class="btn btn-default prevBtn btn-lg pull-left" type="button" style="background: #0eb493">Anterior</button>
            <button class="btn btn-primary nextBtn btn-lg pull-right" type="button" style="background: #0eb493">Seguinte</button>
        </div>
    </div>
</div>