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
    </form>

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
                $('#submit-profile-photo').notify(data,'success');
                $('#blah').addClass('hidden');
            },
            dataType:"text"
        }).submit();

    }

    function uploadAlbum(){
        $('#resultAlbum').html('');

        $("#albumForm").ajaxForm({
            success:function(data) {
                $('#upload-album').notify(data,'success');
                $('#dvPreview').addClass('hidden');
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
                $('#dvPreview').removeClass('hidden');
                var regex = /^([a-zA-Z0-9\s_\\.\-:])+(.jpg|.jpeg|.gif|.png|.bmp)$/;
                $($(this)[0].files).each(function () {
                    var file = $(this);
                    if (regex.test(file[0].name.toLowerCase())) {
                        var reader = new FileReader();
                        reader.onload = function (e) {
                            var img = $("<img />");
                            //img.attr("style", "height:250px;width: 250px");
                            img.addClass("album-image");
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
        $('#blah').removeClass('hidden');
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