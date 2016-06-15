<%--
  Created by IntelliJ IDEA.
  User: jpp
  Date: 15/06/16
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="col-xs-12">
    <div class="col-md-12">
        <div class="col-md-7 col-md-offset-3">
            <h2 align="left">Hórario de Funcionamento</h2>
        </div>
        <div class="form-group form-inline col-md-7 col-md-offset-3">
            <div class="col-md-3">
                <label class="control-label">Segunda-Feira</label>
            </div>
            <div class="input-group col-md-offset-1">
                <label class="c-input c-checkbox">
                    <input type="checkbox">
                    <span class="c-indicator"></span>
                </label>
                <span class="help-inline">&nbsp;Aberto</span>
            </div>
            <div class="input-group clockpicker col-md-2 col-md-offset-2" name="open1">
                <input type="text" class="form-control" value="09:00" >
                    <span class="input-group-addon add-on btn">
                        <span class="glyphicon glyphicon-time"></span>
                    </span>
            </div>
            <span class="help-inline">&nbsp;&nbsp;até&nbsp;&nbsp;</span>
            <div class="input-group clockpicker col-md-2" name="close1">
                <input type="text" class="form-control" value="18:00" >
                <span class="input-group-addon add-on btn"><span class="glyphicon glyphicon-time"></span></span>
            </div>
        </div>
        <div class="form-group form-inline col-md-7 col-md-offset-3">
            <div class="col-md-3">
                <label class="control-label">Terça-Feira</label>
            </div>
            <div class="input-group col-md-offset-1">
                <label class="c-input c-checkbox">
                    <input type="checkbox">
                    <span class="c-indicator"></span>
                </label>
                <span class="help-inline">&nbsp;Aberto</span>
            </div>
            <div class="input-group clockpicker col-md-2 col-md-offset-2" name="open2">
                <input type="text" class="form-control" value="09:00" >
                    <span class="input-group-addon add-on btn">
                        <span class="glyphicon glyphicon-time"></span>
                    </span>
            </div>
            <span class="help-inline">&nbsp;&nbsp;até&nbsp;&nbsp;</span>
            <div class="input-group clockpicker col-md-2" name="close2">
                <input type="text" class="form-control" value="18:00" >
                <span class="input-group-addon add-on btn"><span class="glyphicon glyphicon-time"></span></span>
            </div>
        </div>
        <div class="form-group form-inline col-md-7 col-md-offset-3">
            <div class="col-md-3">
                <label class="control-label">Quarta-Feira</label>
            </div>
            <div class="input-group col-md-offset-1">
                <label class="c-input c-checkbox">
                    <input type="checkbox">
                    <span class="c-indicator"></span>
                </label>
                <span class="help-inline">&nbsp;Aberto</span>
            </div>
            <div class="input-group clockpicker col-md-2 col-md-offset-2" name="open3">
                <input type="text" class="form-control" value="09:00" >
                    <span class="input-group-addon add-on btn">
                        <span class="glyphicon glyphicon-time"></span>
                    </span>
            </div>
            <span class="help-inline">&nbsp;&nbsp;até&nbsp;&nbsp;</span>
            <div class="input-group clockpicker col-md-2" name="close3">
                <input type="text" class="form-control" value="18:00" >
                <span class="input-group-addon add-on btn"><span class="glyphicon glyphicon-time"></span></span>
            </div>
        </div>
        <div class="form-group form-inline col-md-7 col-md-offset-3">
            <div class="col-md-3">
                <label class="control-label">Quinta-Feira</label>
            </div>
            <div class="input-group col-md-offset-1">
                <label class="c-input c-checkbox">
                    <input type="checkbox">
                    <span class="c-indicator"></span>
                </label>
                <span class="help-inline">&nbsp;Aberto</span>
            </div>
            <div class="input-group clockpicker col-md-2 col-md-offset-2" name="open4">
                <input type="text" class="form-control" value="09:00" >
                    <span class="input-group-addon add-on btn">
                        <span class="glyphicon glyphicon-time"></span>
                    </span>
            </div>
            <span class="help-inline">&nbsp;&nbsp;até&nbsp;&nbsp;</span>
            <div class="input-group clockpicker col-md-2" name="close4">
                <input type="text" class="form-control" value="18:00" >
                <span class="input-group-addon add-on btn"><span class="glyphicon glyphicon-time"></span></span>
            </div>
        </div>
        <div class="form-group form-inline col-md-7 col-md-offset-3">
            <div class="col-md-3">
                <label class="control-label">Sexta-Feira</label>
            </div>
            <div class="input-group col-md-offset-1">
                <label class="c-input c-checkbox">
                    <input type="checkbox">
                    <span class="c-indicator"></span>
                </label>
                <span class="help-inline">&nbsp;Aberto</span>
            </div>
            <div class="input-group clockpicker col-md-2 col-md-offset-2" name="open5">
                <input type="text" class="form-control" value="09:00" >
                    <span class="input-group-addon add-on btn">
                        <span class="glyphicon glyphicon-time"></span>
                    </span>
            </div>
            <span class="help-inline">&nbsp;&nbsp;até&nbsp;&nbsp;</span>
            <div class="input-group clockpicker col-md-2" name="close5">
                <input type="text" class="form-control" value="18:00" >
                <span class="input-group-addon add-on btn"><span class="glyphicon glyphicon-time"></span></span>
            </div>
        </div>
        <div class="form-group form-inline col-md-7 col-md-offset-3">
            <div class="col-md-3">
                <label class="control-label">Sábado</label>
            </div>
            <div class="input-group col-md-offset-1">
                <label class="c-input c-checkbox">
                    <input type="checkbox">
                    <span class="c-indicator"></span>
                </label>
                <span class="help-inline">&nbsp;Aberto</span>
            </div>
            <div class="input-group clockpicker col-md-2 col-md-offset-2" name="open6">
                <input type="text" class="form-control" value="09:00" >
                    <span class="input-group-addon add-on btn">
                        <span class="glyphicon glyphicon-time"></span>
                    </span>
            </div>
            <span class="help-inline">&nbsp;&nbsp;até&nbsp;&nbsp;</span>
            <div class="input-group clockpicker col-md-2" name="close6">
                <input type="text" class="form-control" value="18:00" >
                <span class="input-group-addon add-on btn"><span class="glyphicon glyphicon-time"></span></span>
            </div>
        </div>
        <div class="form-group form-inline col-md-7 col-md-offset-3">
            <div class="col-md-3">
                <label class="control-label">Domingo</label>
            </div>
            <div class="input-group col-md-offset-1">
                <label class="c-input c-checkbox">
                    <input type="checkbox">
                    <span class="c-indicator"></span>
                </label>
                <span class="help-inline">&nbsp;Aberto</span>
            </div>
            <div class="input-group clockpicker col-md-2 col-md-offset-2" name="open7">
                <input type="text" class="form-control" value="09:00" >
                    <span class="input-group-addon add-on btn">
                        <span class="glyphicon glyphicon-time"></span>
                    </span>
            </div>
            <span class="help-inline">&nbsp;&nbsp;até&nbsp;&nbsp;</span>
            <div class="input-group clockpicker col-md-2" name="close7">
                <input type="text" class="form-control" value="18:00" >
                <span class="input-group-addon add-on btn"><span class="glyphicon glyphicon-time"></span></span>
            </div>
        </div>
        <div class="form-group col-md-7 col-md-offset-3">
            <button class="btn btn-default prevBtn btn-lg pull-left" type="button" >Anterior</button>
            <button class="btn btn-primary nextBtn btn-lg pull-right" type="button" >Seguinte</button>
        </div>
    </div>
</div>