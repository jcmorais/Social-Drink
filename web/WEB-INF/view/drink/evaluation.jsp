<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <!-- Bootstrap -->
    <link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css" />" rel="stylesheet">

    <!-- others -->
    <link href="<c:url value="/resources/bootstrap/css/style-fred.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/js/libraries/flexSlider/flexslider.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/js/libraries/five-star-rating/css/rating.css" />" rel="stylesheet">
    <title>Title</title>
</head>
<body>
<form  method="post" class="form-horizontal" id="evalForm" role="form" action="/SocialDrink/drink/1/evaluation">
    <div class="form-group">
        <div class="row">
            <div class="col-md-4">
                <label for="comment" class="text-center">Comentar</label>
            </div>
            <div class="col-md-8">
                <textarea id="comment" name="comment" class="form-control" name="" rows="8" cols="40"></textarea>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
                <label class="text-center">Avaliar</label>
            </div>
            <div class="col-md-8">
                <div id="avaliar" class="c-rating"></div>
            </div>

        </div>
        <div class="row">
            <div class="col-md-4">
            </div>
            <div class="col-md-8 text-left">
                <button type="submit" class="btn btn-success" name="submit">Submeter</button>
            </div>
        </div>

        <div>

        </div>
    </div>
</form>


</body>
</html>


<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="<c:url value="/resources/bootstrap/js/libraries/flexSlider/jquery.flexslider.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/libraries/five-star-rating/js/dist/rating.min.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/libraries/lightbox2/dist/js/lightbox.min.js" />"></script>




<script>

    //target element
    var el=document.querySelector('#avaliar');
    //current rating, or initial rating
    var currentRating=3;
    //maxRating
    var maxRating=5;
    //callback to run after setting the rating
    var callback=function(rating){};
    var myRating = rating(el,currentRating,maxRating,callback);


    function test(){
        alert(myRating.getRating());
    }

</script>


<script>
    $("#evalForm").submit(function(e) {
        var url = "/SocialDrink/drink/1/evaluation"; // the script where you handle the form input.

        var input = $("<input>")
                .attr("type", "hidden")
                .attr("name", "stars").val(myRating.getRating());
        $('#formulario').append($(input));
        $('#evalForm').append($(input));
        $.ajax({
            type: "POST",
            url: url,
            data: $("#evalForm").serialize(), // serializes the form's elements.
            success: function(data)
            {
                $("#evalForm").hide();
            }
        });

        e.preventDefault(); // avoid to execute the actual submit of the form.
    });

</script>



<!-- EXTERNAL SCRIPTS FOR CALLMENICK.COM, PLEASE DO NOT INCLUDE -->
<script src="js/lib/githubicons.js"></script>
<script src="js/lib/carbonad.js"></script>
<script>
    (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
                (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
            m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
    })(window,document,'script','//www.google-analytics.com/analytics.js','ga');
    ga('create', 'UA-34160351-1', 'auto');
    ga('send', 'pageview');
</script>
<!-- /EXTERNAL SCRIPTS -->
