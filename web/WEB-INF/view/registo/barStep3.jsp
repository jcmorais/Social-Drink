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
                    <input type="checkbox" name="check1" value="1">
                    <input type="hidden" name="check1" value="0">
                    <span class="c-indicator"></span>
                </label>
                <span class="help-inline">&nbsp;Aberto</span>
            </div>
            <div class="input-group clockpicker col-md-2 col-md-offset-2">
                <input type="text" class="form-control" value="09:00" id="open1" name="open1" >
                    <span class="input-group-addon add-on btn">
                        <span class="glyphicon glyphicon-time"></span>
                    </span>
            </div>
            <span class="help-inline">&nbsp;&nbsp;até&nbsp;&nbsp;</span>
            <div class="input-group clockpicker col-md-2">
                <input type="text" class="form-control" value="18:00" name="close1" >
                <span class="input-group-addon add-on btn"><span class="glyphicon glyphicon-time"></span></span>
            </div>
        </div>
        <div class="form-group form-inline col-md-7 col-md-offset-3">
            <div class="col-md-3">
                <label class="control-label">Terça-Feira</label>
            </div>
            <div class="input-group col-md-offset-1">
                <label class="c-input c-checkbox">
                    <input type="checkbox"  name="check2" value="1">
                    <input type="hidden"  name="check2" value="0">
                    <span class="c-indicator"></span>
                </label>
                <span class="help-inline">&nbsp;Aberto</span>
            </div>
            <div class="input-group clockpicker col-md-2 col-md-offset-2">
                <input type="text" class="form-control" value="09:00" name="open2" >
                    <span class="input-group-addon add-on btn">
                        <span class="glyphicon glyphicon-time"></span>
                    </span>
            </div>
            <span class="help-inline">&nbsp;&nbsp;até&nbsp;&nbsp;</span>
            <div class="input-group clockpicker col-md-2">
                <input type="text" class="form-control" value="18:00" name="close2" >
                <span class="input-group-addon add-on btn"><span class="glyphicon glyphicon-time"></span></span>
            </div>
        </div>
        <div class="form-group form-inline col-md-7 col-md-offset-3">
            <div class="col-md-3">
                <label class="control-label">Quarta-Feira</label>
            </div>
            <div class="input-group col-md-offset-1" >
                <label class="c-input c-checkbox">
                    <input type="checkbox" name="check3" value="1">
                    <input type="hidden" name="check3" value="0">
                    <span class="c-indicator"></span>
                </label>
                <span class="help-inline">&nbsp;Aberto</span>
            </div>
            <div class="input-group clockpicker col-md-2 col-md-offset-2">
                <input type="text" class="form-control" value="09:00" name="open3" >
                    <span class="input-group-addon add-on btn">
                        <span class="glyphicon glyphicon-time"></span>
                    </span>
            </div>
            <span class="help-inline">&nbsp;&nbsp;até&nbsp;&nbsp;</span>
            <div class="input-group clockpicker col-md-2">
                <input type="text" class="form-control" value="18:00" name="close3" >
                <span class="input-group-addon add-on btn"><span class="glyphicon glyphicon-time"></span></span>
            </div>
        </div>
        <div class="form-group form-inline col-md-7 col-md-offset-3">
            <div class="col-md-3">
                <label class="control-label">Quinta-Feira</label>
            </div>
            <div class="input-group col-md-offset-1">
                <label class="c-input c-checkbox">
                    <input type="checkbox" name="check4" value="1">
                    <input type="hidden" name="check4" value="0">
                    <span class="c-indicator"></span>
                </label>
                <span class="help-inline">&nbsp;Aberto</span>
            </div>
            <div class="input-group clockpicker col-md-2 col-md-offset-2">
                <input type="text" class="form-control" value="09:00" name="open4" >
                    <span class="input-group-addon add-on btn">
                        <span class="glyphicon glyphicon-time"></span>
                    </span>
            </div>
            <span class="help-inline">&nbsp;&nbsp;até&nbsp;&nbsp;</span>
            <div class="input-group clockpicker col-md-2">
                <input type="text" class="form-control" value="18:00" name="close4" >
                <span class="input-group-addon add-on btn"><span class="glyphicon glyphicon-time"></span></span>
            </div>
        </div>
        <div class="form-group form-inline col-md-7 col-md-offset-3">
            <div class="col-md-3">
                <label class="control-label">Sexta-Feira</label>
            </div>
            <div class="input-group col-md-offset-1">
                <label class="c-input c-checkbox">
                    <input type="checkbox" name="check5" value="1">
                    <input type="hidden"  name="check5" value="0">
                    <span class="c-indicator"></span>
                </label>
                <span class="help-inline">&nbsp;Aberto</span>
            </div>
            <div class="input-group clockpicker col-md-2 col-md-offset-2">
                <input type="text" class="form-control" value="09:00" name="open5" >
                    <span class="input-group-addon add-on btn">
                        <span class="glyphicon glyphicon-time"></span>
                    </span>
            </div>
            <span class="help-inline">&nbsp;&nbsp;até&nbsp;&nbsp;</span>
            <div class="input-group clockpicker col-md-2">
                <input type="text" class="form-control" value="18:00" name="close5" >
                <span class="input-group-addon add-on btn"><span class="glyphicon glyphicon-time"></span></span>
            </div>
        </div>
        <div class="form-group form-inline col-md-7 col-md-offset-3">
            <div class="col-md-3">
                <label class="control-label">Sábado</label>
            </div>
            <div class="input-group col-md-offset-1">
                <label class="c-input c-checkbox">
                    <input type="checkbox" name="check6" value="1">
                    <input type="hidden" name="check6" value="0">
                    <span class="c-indicator"></span>
                </label>
                <span class="help-inline">&nbsp;Aberto</span>
            </div>
            <div class="input-group clockpicker col-md-2 col-md-offset-2">
                <input type="text" class="form-control" value="09:00" name="open6" >
                    <span class="input-group-addon add-on btn">
                        <span class="glyphicon glyphicon-time"></span>
                    </span>
            </div>
            <span class="help-inline">&nbsp;&nbsp;até&nbsp;&nbsp;</span>
            <div class="input-group clockpicker col-md-2">
                <input type="text" class="form-control" value="18:00" name="close6" >
                <span class="input-group-addon add-on btn"><span class="glyphicon glyphicon-time"></span></span>
            </div>
        </div>
        <div class="form-group form-inline col-md-7 col-md-offset-3">
            <div class="col-md-3">
                <label class="control-label">Domingo</label>
            </div>
            <div class="input-group col-md-offset-1">
                <label class="c-input c-checkbox">
                    <input type="checkbox" name="check7" value="1">
                    <input type="hidden" name="check7" value="0">
                    <span class="c-indicator"></span>
                </label>
                <span class="help-inline">&nbsp;Aberto</span>
            </div>
            <div class="input-group clockpicker col-md-2 col-md-offset-2">
                <input type="text" class="form-control" value="09:00" name="open7" >
                    <span class="input-group-addon add-on btn">
                        <span class="glyphicon glyphicon-time"></span>
                    </span>
            </div>
            <span class="help-inline">&nbsp;&nbsp;até&nbsp;&nbsp;</span>
            <div class="input-group clockpicker col-md-2">
                <input type="text" class="form-control" value="18:00" name="close7" >
                <span class="input-group-addon add-on btn"><span class="glyphicon glyphicon-time"></span></span>
            </div>
        </div>
        <div class="form-group col-md-7 col-md-offset-3">
            <button class="btn btn-default prevBtn btn-lg pull-left" type="button" >Anterior</button>
            <button class="btn btn-primary nextBtn btn-lg pull-right" type="button" >Seguinte</button>
        </div>
    </div>
</div>
