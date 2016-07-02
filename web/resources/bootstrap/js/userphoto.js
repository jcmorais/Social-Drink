/**
 * Created by jpp on 02/07/16.
 */
function readURL(input) {
    if (input.files && input.files[0]) {
        var reader = new FileReader();

        reader.onload = function (e) {
            $('#userphoto')
                .attr('src', e.target.result)
                .attr("style", "height:200px;width: 200px");
        };
        reader.readAsDataURL(input.files[0]);
    }
    document.getElementById("userphoto").style.display = "";
    $('#userphoto').removeClass('hidden');
}


