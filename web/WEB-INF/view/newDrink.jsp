<%--
  Created by IntelliJ IDEA.
  User: carlosmorais
  Date: 08/06/16
  Time: 19:34
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>new drink</title>
    <meta charset="utf-8">
    <!-- Bootstrap -->
    <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet"  type="text/css" />
</head>
<body>

<div class="container">

<form action="/SocialDrink/newdrink" method="post">
    <div class="page-header">
        <h1>Cria o teu drink</h1>
    </div>


        <label class="control-label col-sm-2" for="nome">Nome:</label>
        <div class="col-sm-4">
            <input type="text" class="form-control" id="nome" name="nome" placeholder="Introz o nome da bebida">
        </div>

    <label class="control-label col-sm-2" for="nome">Quantidade:</label>
    <div class="col-sm-4">
        <input type="int" class="form-control" id="quantidade" name="quantidade" placeholder="Introz o nome da bebida">
    </div>

    <label class="control-label col-sm-2" for="nome">tipoQuantidade:</label>
    <div class="col-sm-4">
        <input type="text" class="form-control" id="tipoQuantidade" name="tipoQuantidade" placeholder="Introz o nome da bebida">
    </div>

    <label class="control-label col-sm-2" for="nome">tempo:</label>
    <div class="col-sm-4">
        <input type="text" class="form-control" id="tempo" name="tempo" placeholder="Introz o nome da bebida">
    </div>

    <input type="text" class="form-control" id="passos" name="passos" placeholder="passox">
    <input type="text" class="form-control" id="passos" name="passos" placeholder="passox">
    <input type="text" class="form-control" id="passos" name="passos" placeholder="passox">

    <input type="submit" value="Submit">
</form>

</div>


</body>
</html>
