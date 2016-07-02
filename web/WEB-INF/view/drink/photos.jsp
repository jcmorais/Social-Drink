<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Sucesso!</title>

    <link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css" />" rel="stylesheet">

    <style>
        .im-centered { border: dashed; padding: 10px}
        .album-image{ height:250px; width: 250px; padding: 10px;}
        .hidden{ visibility: hidden}
    </style>
</head>
<body>

<jsp:include page="../topbar.jsp"/>

<div style="margin-top: 100px" class="container">
    <c:if test="${successMessage == 'yes'}">
        <div class="container">
            <div class="success">${message}</div>
        </div>
    </c:if>
    <form id="photoForm" method="post" action="/SocialDrink/drink/${drinkId}/photo"  enctype="multipart/form-data">
        <div class="container">
            <h2>Escolha a foto principal do Drink!</h2>
            <p>Esta será a fotografia principal da sua bebida!</p>
            <br>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-md-8 col-md-offset-2 im-centered">
                        <img id="blah" name="photo" src="" alt="your image" style="visibility: hidden;"/>
                    <br>
                    <hr>
                <div class="col-md-6 col-md-offset-3">
                    <div class="col-md-6">
                        <label class="btn btn-default btn-file">
                            Selecionar uma foto
                            <input type="file" style="display: none;" name="photoFile" accept="image/jpeg, image/png" onchange="readURL(this);">
                        </label>
                    </div>
                    <div class="col-md-6">
                        <input id="submit-profile-photo" class="btn btn-success" onclick="uploadPhoto()" value="Upload!">
                    </div>
                </div>
            </div>
            </div>
        </div>
    </form>
</div>

<div class="container">
    <h1>Adiciona fotos ao àlbum do Drink!</h1>
    <p>Estas fotografias serão exibidas no album da sua bebida!</p>

</div>
    <form id="albumForm" method="post" action="/SocialDrink/drink/${drinkId}/photos"  enctype="multipart/form-data">
        <div class="container">
            <div class="container">
                <div class="row">
                    <div class="col-md-8 col-md-offset-2 im-centered">
                        <div id="dvPreview"></div>
                        <br>
                        <hr>
                        <div class="col-md-6 col-md-offset-3">
                            <div class="col-md-6">
                                <label class="btn btn-default btn-file">
                                    Selecionar fotos<input id="fileupload" multiple="multiple" type="file" style="display: none;" name="photosFiles" accept="image/jpeg, image/png">
                                </label>
                            </div>
                            <div class="col-md-6">
                                <input id="upload-album" class="btn btn-success"  onclick="uploadAlbum()" value="Confirmar">
                            </div>
                        </div>
                    </div>
                </div>
            </div>



        </div>
    </form>

</body>
</html>


<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="http://malsup.github.com/jquery.form.js"></script>
<script src="<c:url value="/resources/bootstrap/js/notify.min.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/photos.js" />"></script>







<style>

    .success {
        border: 1px solid;
        margin: 10px 0px;
        padding:15px 10px 15px 150px;
        background-repeat: no-repeat;
        background-position: 10px center;
    }
    .success {
        color: #4F8A10;
        background-color: #DFF2BF;
        background-image:url('<c:url value="/resources/img/success.png"/>');
    }
</style>