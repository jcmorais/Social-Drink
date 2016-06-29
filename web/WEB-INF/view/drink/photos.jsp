<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Sucesso!</title>

    <link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css" />" rel="stylesheet">
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
            <h2>Escolha a foto principal do Drink !</h2>
            <p>Esta será a fotografia principal da sua bebida!</p>

            <br>

        </div>
        <br><br>
        <div class="container">
            <img id="blah" name="photo" src="" alt="your image" style="display: none;"/>
            <label class="btn btn-default btn-file col-md-3">
                Selecionar uma foto<input type="file" style="display: none;" name="photoFile" accept="image/jpeg, image/png" onchange="readURL(this);">
            </label>
            <div class="container col-md-3"><input class="btn-success" type="submit" onclick="uploadPhoto()" value="Confirmar"></div>
        </div>

        <div class="alert alert-success" id="result" style="display: none;"></div>
    </form>
</div>

<div class="container">
    <form id="albumForm" method="post" action="/SocialDrink/drink/${drinkId}/photos"  enctype="multipart/form-data">
        <div class="container">
            <h1>Adiciona fotos ao àlbum do Drink !</h1>
            <label class="btn btn-default btn-file">
               Selecionar fotos<input id="fileupload" multiple="multiple" type="file" style="display: none;" name="photosFiles" accept="image/jpeg, image/png">
            </label>
        </div>
        <br />
        <br />
        <div id="dvPreview"></div>
        <br><br>
        <div class="container"><input class="btn-success" type="submit" onclick="uploadAlbum()" value="Confirmar"></div>
        <div class="alert alert-success" id="resultAlbum" style="display: none;"></div>
    </form>
</div>

</body>
</html>


<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="http://malsup.github.com/jquery.form.js"></script>
<script src="<c:url value="/resources/bootstrap/js/notify.min.js" />"></script>





<script>
    function uploadPhoto(){
        $('#result').html('');

        $("#photoForm").ajaxForm({
            success:function(data) {
                $('#result').html(data);
                document.getElementById("result").style.display = "";
                $('#blah').notify(data);
            },
            dataType:"text"
        }).submit();

    }

    function uploadAlbum(){
        $('#resultAlbum').html('');

        $("#albumForm").ajaxForm({
            success:function(data) {
                $('#resultAlbum').html(data);
                document.getElementById("resultAlbum").style.display = "";
            },
            dataType:"text"
        }).submit();
    }
</script>


<script>
    $(function () {
        $("#fileupload").change(function () {
            if (typeof (FileReader) != "undefined") {
                var dvPreview = $("#dvPreview");
                dvPreview.html("");
                var regex = /^([a-zA-Z0-9\s_\\.\-:])+(.jpg|.jpeg|.gif|.png|.bmp)$/;
                $($(this)[0].files).each(function () {
                    var file = $(this);
                    if (regex.test(file[0].name.toLowerCase())) {
                        var reader = new FileReader();
                        reader.onload = function (e) {
                            var img = $("<img />");
                            img.attr("style", "height:250px;width: 250px");
                            img.attr("src", e.target.result);
                            dvPreview.append(img);
                        }
                        reader.readAsDataURL(file[0]);
                    } else {
                        alert(file[0].name + " is not a valid image file.");
                        dvPreview.html("");
                        return false;
                    }
                });
            } else {
                alert("This browser does not support HTML5 FileReader.");
            }
        });
    });


    function readURL(input) {
        if (input.files && input.files[0]) {
            var reader = new FileReader();

            reader.onload = function (e) {
                $('#blah')
                        .attr('src', e.target.result)
                        .attr("style", "height:400px;width: 400px");
            };
            reader.readAsDataURL(input.files[0]);
        }
        document.getElementById("blah").style.display = "";
    }

    function AddMoreFile(tableID) {
        var table = document.getElementById(tableID);
        var rowCount = table.rows.length;
        var row = table.insertRow(rowCount);
        var col1 = row.insertCell(0);
        var colInput = document.createElement("input");
        colInput.type = "file";
        colInput.name="files";
        col1.appendChild(colInput);
    }

</script>


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