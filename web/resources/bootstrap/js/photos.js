/**
 * Created by jpp on 02/07/16.
 */
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
