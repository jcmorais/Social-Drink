<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<html>
<head>
    <meta charset="utf-8">
    <!-- Bootstrap -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet"  type="text/css" />
</head>
<body>
<div class='container'>
    <div class="page-header">
        <h1>Cria o teu drink</h1>
    </div>
    <form  class="form-horizontal" id="formulario" role="form" action="/SocialDrink/newdrink" method="post">

        <div class="form-group">
            <label class="control-label col-sm-2">nome</label>
            <div class="col-sm-4"><input type="text" class="form-control" id="nome" name="nome" placeholder="nome do drink"></div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2">Foto:</label>
            <div class="col-sm-10"><label class="btn btn-default btn-file cl-sm-4">Browse <input type="file" style="display: none;" id="foto" for="foto"> </label></div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2">Quantidade</label>
            <div class="col-sm-2"><input type="text" class="form-control" id="quantidade" name="quantidade" placeholder="quantidade"></div>
            <div class="form-group col-sm-2">
                <select class="form-control" id="tipoQuantidade" name="tipoQuantidade">
                    <option>copos</option>
                    <option>canecas</option>
                    <option>doses</option>
                    <option>baldes</option>
                </select>
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2">Tempo de preparação</label>
            <div class="col-sm-2"><input type="text" class="form-control" id="tempo" name="tempo" placeholder="tempo"></div>
            <label class="control-label">(minutos)</label>
        </div>

        <br><br><br>

        <div class="form-group">
            <label class="control-label col-sm-2">ingrediente</label>
            <div class="col-sm-3"><input type="text" class="form-control" id="ingrediente" name="ingrediente" placeholder="ingrediente"></div>
            <button  type="button" class="btn btn-default" onclick="myFunction()">Adicionar</button>
            <div>
                <div class="row col-md-3">
                    <table id="myTable" class="table table-center">
                        <thead>
                        <tr>
                            <th class="col-md-1">#</th>
                            <th class="col-md-2">Ingrediente</th>
                        </tr>
                        </thead>
                        <tbody>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>


        <br><br><br>

        <div class="form-group">
            <label class="control-label col-sm-2">passo</label>
            <div class="col-sm-3"><input type="text" class="form-control" id="passo" for="passo" placeholder="passo"></div>
            <button  type="button" class="btn btn-default" onclick="myFunction2()">Adicionar</button>
            <div>
                <div class="row col-md-3">
                    <table id="tabelaPassos" class="table table-center">
                        <thead>
                        <tr>
                            <th class="col-md-1">#</th>
                            <th class="col-md-2">Passo</th>
                        </tr>
                        </thead>
                        <tbody>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>


        <button type="submit" form="formulario" class="btn btn-default">Submit</button>
    </form>
</div>
</body>
</html>

<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="/js/bootstrap.min.js"></script>


<script>
    var count = 1;
    function myFunction() {
        var table = document.getElementById("myTable");
        var row = table.insertRow(count);
        var cell1 = row.insertCell(0);
        var cell2 = row.insertCell(1);
        cell1.innerHTML = count;
        cell2.innerHTML = $('#ingrediente').val();
        count = count + 1;
        $('#ingrediente').val('');
        cell2.setAttribute('id','ingrediente');
    }
</script>



<script>
    var countP = 1;
    function myFunction2() {
        var table = document.getElementById("tabelaPassos");
        var row = table.insertRow(countP);
        var cell1 = row.insertCell(0);
        var cell2 = row.insertCell(1);
        cell1.innerHTML = countP;
        cell2.innerHTML = $('#passo').val();
        countP = countP + 1;
        $('#passo').val('');
        cell2.setAttribute('name','passos');
    }
</script>


<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>