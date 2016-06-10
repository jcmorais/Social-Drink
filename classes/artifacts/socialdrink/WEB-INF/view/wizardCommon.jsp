<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="col-xs-12">
    <div class="col-md-12">
        <div class="form-group">
            <label class="control-label">Email</label>
            <input  maxlength="100" type="text" required="required" class="form-control" placeholder="Introduza o email"  />
        </div>
        <div class="form-group">
            <label class="control-label">Confirmar o Email</label>
            <input  maxlength="100" type="text" required="required" class="form-control" placeholder="Introduza novamente o email"  />
        </div>
        <div class="form-group">
            <label class="control-label">Password</label>
            <input maxlength="100" type="password" required="required" class="form-control" placeholder="Introduza a password" />
        </div>
        <div class="form-group">
            <label class="control-label">Confirmar a Password</label>
            <input maxlength="100" type="password" required="required" class="form-control" placeholder="Introduza novamente a password" />
        </div>
        <div class="form-group">
            <label for="sel1">Tipo de Conta</label>
            <select class="form-control" id="sel1">
                <option>Utilizador</option>
                <option>Bar</option>
            </select>
        </div>
        <button class="btn btn-primary nextBtn btn-lg pull-right" type="button" >Seguinte</button>
    </div>
</div>