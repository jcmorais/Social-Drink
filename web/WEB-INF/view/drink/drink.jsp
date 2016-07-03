<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <link href="<c:url value="/resources/bootstrap/css/style-fred.css" />" rel="stylesheet">

    <title>Drink</title>


    <meta property="og:url"           content="http://www.your-domain.com/your-page.html" />
    <meta property="og:type"          content="website" />
    <meta property="og:title"         content="Your Website Title" />
    <meta property="og:description"   content="Your description" />
    <meta property="og:image"         content="http://www.your-domain.com/path/image.jpg" />


</head>
<body>
<jsp:include page="../topbar.jsp"/>

<div class="container" style="padding-top: 100px">
    <div class="container">
        <div class="row">
            <div class="col-md-6">
                <div class='container'>
                    <h2 style="display: inline-block"><c:out value="${drink.name.toUpperCase()}"></c:out></h2>
                    <h3 style="display: inline-block; padding-top: 5px">
                        <ul class="c-rating show-rating">
                            <c:if test="${rating == '0'}">
                                <li class="c-rating__item"></li>
                                <li class="c-rating__item"></li>
                                <li class="c-rating__item"></li>
                                <li class="c-rating__item"></li>
                                <li class="c-rating__item"></li>
                            </c:if>
                            <c:if test="${rating == '1'}">
                                <li class="c-rating__item is-active"></li>
                                <li class="c-rating__item"></li>
                                <li class="c-rating__item"></li>
                                <li class="c-rating__item"></li>
                                <li class="c-rating__item"></li>
                            </c:if>
                            <c:if test="${rating == '2'}">
                                <li class="c-rating__item is-active"></li>
                                <li class="c-rating__item is-active"></li>
                                <li class="c-rating__item"></li>
                                <li class="c-rating__item"></li>
                                <li class="c-rating__item"></li>
                            </c:if>
                            <c:if test="${rating == '3'}">
                                <li class="c-rating__item is-active"></li>
                                <li class="c-rating__item is-active"></li>
                                <li class="c-rating__item is-active"></li>
                                <li class="c-rating__item"></li>
                                <li class="c-rating__item"></li>
                            </c:if>
                            <c:if test="${rating == '4'}">
                                <li class="c-rating__item is-active"></li>
                                <li class="c-rating__item is-active"></li>
                                <li class="c-rating__item is-active"></li>
                                <li class="c-rating__item is-active"></li>
                                <li class="c-rating__item"></li>
                            </c:if>
                            <c:if test="${rating == '5'}">
                                <li class="c-rating__item is-active"></li>
                                <li class="c-rating__item is-active"></li>
                                <li class="c-rating__item is-active"></li>
                                <li class="c-rating__item is-active"></li>
                                <li class="c-rating__item is-active"></li>
                            </c:if>
                        </ul>
                    </h3>
                </div>
            </div>
            <div class="col-md-2">
                <p>Com alcool</p>


            </div>
            <div class="col-md-2 col-md-offset-2">
                <button id="addFavorite" value="${drink.getID()}" type="button" onclick="addFavorite()" >Adicionar aos favoritos</button>
                <button id="removeFavorite" value="${drink.getID()}" type="button" onclick="removeFavorite()" >Remover dos favoritms</button>
            </div>
        </div>
        <hr>
        <div class="row">
            <div class="col-md-4">
                <div class="row">
                    <div class="col-md-12">
                        <img class="img-responsive center-block drink-main-image" src="<c:url value="${drink.getPhoto().getFilePath()}"/>"/>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-3">
                        <p class="drink-item-information">
                            <c:out value="${ingredientsLength}"></c:out>
                        </p>
                        <p class="text-center">
                            Ingredientes
                        </p>
                    </div>
                    <div class="col-md-3">
                        <p class="drink-item-information">
                            <c:out value="${drink.yeld}"></c:out>
                        </p>
                        <p class="text-center">
                            Quantidade
                        </p>
                    </div>
                    <div class="col-md-3">
                        <p class="drink-item-information">
                            <c:out value="${drink.timeToPrepate}"></c:out>
                        </p>
                        <p class="text-center">
                            Minutos
                        </p>
                    </div>
                    <div class="col-md-3">
                        <p id="commentsLength" class="drink-item-information">
                            <c:out value="${commentsLength}"></c:out>
                        </p>
                        <p class="text-center">
                            Comentários
                        </p>
                    </div>

                </div>
            </div>
            <div class="col-md-4 col-md-offset-1">
                <div class="row">

                    <div class="row">
                        <div class='container'>
                            <div class="row">
                                <div class="" style="display: inline-block">
                                    <h2><c:out value="${drink.name.toUpperCase()}"></c:out></h2>
                                </div>

                                <div style="display: inline-block; padding-top: 4px; padding-left: 10px" class="">
                                    <h3>
                                        <ul class="c-rating show-rating">
                                            <c:if test="${rating == '0'}">
                                                <li class="c-rating__item"></li>
                                                <li class="c-rating__item"></li>
                                                <li class="c-rating__item"></li>
                                                <li class="c-rating__item"></li>
                                                <li class="c-rating__item"></li>
                                            </c:if>
                                            <c:if test="${rating == '1'}">
                                                <li class="c-rating__item is-active"></li>
                                                <li class="c-rating__item"></li>
                                                <li class="c-rating__item"></li>
                                                <li class="c-rating__item"></li>
                                                <li class="c-rating__item"></li>
                                            </c:if>
                                            <c:if test="${rating == '2'}">
                                                <li class="c-rating__item is-active"></li>
                                                <li class="c-rating__item is-active"></li>
                                                <li class="c-rating__item"></li>
                                                <li class="c-rating__item"></li>
                                                <li class="c-rating__item"></li>
                                            </c:if>
                                            <c:if test="${rating == '3'}">
                                                <li class="c-rating__item is-active"></li>
                                                <li class="c-rating__item is-active"></li>
                                                <li class="c-rating__item is-active"></li>
                                                <li class="c-rating__item"></li>
                                                <li class="c-rating__item"></li>
                                            </c:if>
                                            <c:if test="${rating == '4'}">
                                                <li class="c-rating__item is-active"></li>
                                                <li class="c-rating__item is-active"></li>
                                                <li class="c-rating__item is-active"></li>
                                                <li class="c-rating__item is-active"></li>
                                                <li class="c-rating__item"></li>
                                            </c:if>
                                            <c:if test="${rating == '5'}">
                                                <li class="c-rating__item is-active"></li>
                                                <li class="c-rating__item is-active"></li>
                                                <li class="c-rating__item is-active"></li>
                                                <li class="c-rating__item is-active"></li>
                                                <li class="c-rating__item is-active"></li>
                                            </c:if>
                                        </ul>
                                    </h3>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-3">
                                    <img src="">
                                    <span>Alcoolico</span>
                                </div>
                                <div class="col-md-3">
                                    <img src="">
                                    <span>Favourited</span>
                                </div>
                            </div>


                        </div>
                    </div>





                </div>
                <div class="row">
                    <h3 class="text-center">Descrição</h3>
                    <p class="drink-description"> <c:out value="${drink.description}"></c:out> </p>
                </div>
                <div class="row">
                    <h3 class="text-center">Share</h3>
                    <div class="row">
                        <div class="col-md-3">
                            <a href="https://www.facebook.com/sharer/sharer.php?u=${link}" target="_blank"><img class="social-icon" src="<c:url value="/resources/img/images/social/facebook.ico"/>" alt="" /></a>
                        </div>
                        <div class="col-md-3">
                            <a href="https://plus.google.com/share?url=${link}" target="_blank" class="gplus-counter" id="gplus_share">
                                <img class="social-icon" src="<c:url value="/resources/img/images/social/google.ico"/>" alt="" />
                            </a>
                        </div>
                        <div class="col-md-3">
                            <a href="#">
                                <img class="social-icon" src="<c:url value="/resources/img/images/social/instagram.ico" />" alt="" />
                            </a>
                        </div>
                        <div class="col-md-3">
                            <a href="https://twitter.com/intent/tweet?text=${link}">
                                <img class="social-icon" src="<c:url value="/resources/img/images/social/twitter.ico" />" alt="" />
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <hr>
</div>
<!-- Modo de preparação -->
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="flexslider">
                <ul class="slides">
                    <c:forEach items="${photos}" var="photo">
                        <li><img src="<c:url value="${photo.getFilePath()}"/>"/></li>
                    </c:forEach>
                </ul>
            </div>


        </div>
    </div>
    <div class="row">
        <div class="col-md-3 col-md-offset-2">
            <table class="table table-striped table-bordered text-center">
                <tr>
                    <th class="text-center">Ingrediente</th>
                    <th class="text-center">Quantidade</th>
                </tr>

                <c:forEach items="${ingredients}" var="ingredient">
                    <tr>
                        <td> <c:out value="${ingredient.ingredient.name}"/> </td>
                        <td> <c:out value="${ingredient.amount}"/> </td>
                    </tr>
                </c:forEach>

            </table>
        </div>
        <div class="col-md-3 col-md-offset-2">
            <table class="table table-striped table-bordered text-center">
                <tr>
                    <th class="text-center" colspan="2">
                        Preparação
                    </th>
                </tr>
                <c:forEach items="${steps}" var="step">
                    <tr>
                        <td> <c:out value="${step.number}"/> </td>
                        <td> <c:out value="${step.description}"/> </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
    <hr>
</div>

<!-- comentarios -->
<div class="container">
    <div class="row">
        <h3>Comentários</h3>
        <div class="col-md-12 text-center write-comment">
            <jsp:include page="evaluation.jsp"/>
        </div>
    </div>
    <div class="row">
        <h3 class="text-center">Comentários de Utilizadores</h3>
        <div class="container" id="comments">
            <div id="userEval"></div>
        <c:forEach items="${evaluations}" var="eval">
            <div class="col-md-6">
                <div class="drink-comment">
                    <div class="col-md-2">
                        <img class="comment picture circular-photo" src="<c:url value="${eval.getUser().getPhoto().getFilePath()}"/>" alt="" />
                    </div>
                    <div class="col-md-10">
                        <div class="comment-text">
                            <p class="commentator">
                                    ${eval.getUser().getFirstname()} ${eval.getUser().getLastname()}
                            <div style="display:inline-block">
                            <ul class="c-rating show-rating">
                                <c:if test="${eval.getValue() == '1'}">
                                    <li class="c-rating__item is-active"></li>
                                    <li class="c-rating__item"></li>
                                    <li class="c-rating__item"></li>
                                    <li class="c-rating__item"></li>
                                    <li class="c-rating__item"></li>
                                </c:if>
                                <c:if test="${eval.getValue() == '2'}">
                                    <li class="c-rating__item is-active"></li>
                                    <li class="c-rating__item is-active"></li>
                                    <li class="c-rating__item"></li>
                                    <li class="c-rating__item"></li>
                                    <li class="c-rating__item"></li>
                                </c:if>
                                <c:if test="${eval.getValue() == '3'}">
                                    <li class="c-rating__item is-active"></li>
                                    <li class="c-rating__item is-active"></li>
                                    <li class="c-rating__item is-active"></li>
                                    <li class="c-rating__item"></li>
                                    <li class="c-rating__item"></li>
                                </c:if>
                                <c:if test="${eval.getValue() == '4'}">
                                    <li class="c-rating__item is-active"></li>
                                    <li class="c-rating__item is-active"></li>
                                    <li class="c-rating__item is-active"></li>
                                    <li class="c-rating__item is-active"></li>
                                    <li class="c-rating__item"></li>
                                </c:if>
                                <c:if test="${eval.getValue() == '5'}">
                                    <li class="c-rating__item is-active"></li>
                                    <li class="c-rating__item is-active"></li>
                                    <li class="c-rating__item is-active"></li>
                                    <li class="c-rating__item is-active"></li>
                                    <li class="c-rating__item is-active"></li>
                                </c:if>
                            </ul>
                            <div style="margin-top:5px; margin-left: 5px; color: #999999; display:inline-block">${eval.getDate()} </div>
                        </div>
                            </p>

                            <p>${eval.getText()}</p>
                        </div>
                    </div>

                </div>
            </div>
        </c:forEach>
        </div>

    </div>
</div>

</div>
</body>
</html>

<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="<c:url value="/resources/bootstrap/js/libraries/flexSlider/jquery.flexslider.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/libraries/five-star-rating/js/dist/rating.min.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/libraries/lightbox2/dist/js/lightbox.min.js" />"></script>


<script type="text/javascript" charset="utf-8">
    $(window).load(function() {
        $('.flexslider').flexslider();
    });
</script>



<script>
    function addFavorite() {
        var url = '/SocialDrink/favorite/add/'+$('#addFavorite').val(); // the script where you handle the form input.
        alert(url);
        $.ajax({
                type: "POST",
                url: url,
                data: null, // serializes the form's elements.
                success: function(data)
                {
                    alert('sucesso');
                }
            });
    }

    function removeFavorite() {
        var url = '/SocialDrink/favorite/remove/'+$('#removeFavorite').val(); // the script where you handle the form input.
        alert(url);
        $.ajax({
            type: "POST",
            url: url,
            data: null, // serializes the form's elements.
            success: function(data)
            {
                alert('sucesso');
            }
        });
    }
</script>