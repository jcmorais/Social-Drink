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

    <title>Drink</title>
</head>
<body>
<div class="container">
    <jsp:include page="../topbar.jsp"/>

    <div class="container">
<div class="container">
    <div class="row">
        <div class="col-md-4">
            <div class='container'>
            <h2><c:out value="${drink.name}"></c:out></h2>
                </div>
        </div>
        <div class="col-md-2">
            <h3>
                <ul class="c-rating show-rating">
                    <li class="c-rating__item is-active"></li>
                    <li class="c-rating__item is-active"></li>
                    <li class="c-rating__item is-active"></li>
                    <li class="c-rating__item"></li>
                    <li class="c-rating__item"></li>
                </ul>
                <div class="">
                    (11 votos)
                </div>
            </h3>

        </div>
        <div class="col-md-4 col-md-offset-2">
            <h2>Adicionar aos favoritos</h2>
        </div>
    </div>
    <hr>
    <div class="row">
        <div class="col-md-4">
            <div class="row">
                <div class="col-md-12">
                    <img class="img-responsive center-block drink-main-image" src="<c:url value="/resources/img/images/caipi.jpg"/>" alt="caipi" />
                </div>
            </div>
            <div class="row">
                <h3 class="text-center">Informação Geral</h3>
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
                    <p class="drink-item-information">
                        <c:out value="${commentsLength}"></c:out>
                    </p>
                    <p class="text-center">
                        Comentários
                    </p>
                </div>

            </div>
        </div>
        <div class="col-md-4 col-md-offset-2">
            <h3 class="text-center">Descrição</h3>
            <p class="drink-description"> <c:out value="${drink.description}"></c:out> </p>
        </div>
    </div>
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <h3 class="text-center">Share</h3>
            <div class="row">
                <div class="col-md-3">
                    <a href="#"><img class="social-icon" src="<c:url value="/resources/img/images/social/facebook.ico"/>" alt="" /></a>
                </div>
                <div class="col-md-3">
                    <a href="#">
                        <img class="social-icon" src="<c:url value="/resources/img/images/social/google.ico"/>" alt="" />
                    </a>
                </div>
                <div class="col-md-3">
                    <a href="#">
                        <img class="social-icon" src="<c:url value="/resources/img/images/social/instagram.ico" />" alt="" />
                    </a>
                </div>
                <div class="col-md-3">
                    <a href="#">
                        <img class="social-icon" src="<c:url value="/resources/img/images/social/twitter.ico" />" alt="" />
                    </a>
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
                    <li>
                        <img src="./resources/img/images/caipirinha/1.jpg" />
                    </li>
                    <li>
                        <img src="./resources/img/images/caipirinha/2.jpg" />
                    </li>
                    <li>
                        <img src="./resources/img/images/caipirinha/3.jpg" />
                    </li>
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
            <div class="form-group">
                <div class="row">
                    <div class="col-md-4">
                        <label for="comment" class="text-center">Comentar</label>
                    </div>
                    <div class="col-md-8">
                        <textarea id="comment" class="form-control" name="" rows="8" cols="40"></textarea>
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
                        <button type="button" class="btn btn-success" name="submit">Submeter</button>
                    </div>
                </div>

                <div>

                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <h3 class="text-center">Comentários de Utilizadores</h3>
        <div class="col-md-6">
            <div class="drink-comment">
                <div class="col-md-2">
                    <img class="comment picture circular-photo" src="<c:url value="/resources/img/images/people/adam.jpg"/>" alt="" />
                </div>
                <div class="col-md-10">
                    <div class="comment-text">
                        <p class="commentator">
                            João Bastinhas
                        <ul class="c-rating show-rating">
                            <li class="c-rating__item is-active"></li>
                            <li class="c-rating__item is-active"></li>
                            <li class="c-rating__item is-active"></li>
                            <li class="c-rating__item"></li>
                            <li class="c-rating__item"></li>
                        </ul>
                        </p>

                        <p>
                            Very interesting cocktail!asdsfs fsdgdsgdfgfdf dhdfhfhdhh shdasvdbsndsbnfvds shdfsfdsvvsdfvsdhfshdbfbh
                        </p>
                    </div>
                </div>

            </div>
        </div>
        <div class="col-md-6">
            <div class="drink-comment">
                <div class="col-md-2">
                    <img class="comment picture circular-photo" src="./resources/img/images/people/adam.jpg" alt="" />
                </div>
                <div class="col-md-10">
                    <div class="comment-text">
                        <p class="commentator">
                            João Bastinhas
                        <ul class="c-rating show-rating">
                            <li class="c-rating__item is-active"></li>
                            <li class="c-rating__item is-active"></li>
                            <li class="c-rating__item is-active"></li>
                            <li class="c-rating__item"></li>
                            <li class="c-rating__item"></li>
                        </ul>
                        </p>

                        <p>
                            Very interesting cocktail!asdsfs fsdgdsgdfgfdf dhdfhfhdhh shdasvdbsndsbnfvds shdfsfdsvvsdfvsdhfshdbfbh
                        </p>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-md-6">
            <div class="drink-comment">
                <div class="col-md-2">
                    <img class="comment picture circular-photo" src="./resources/img/images/people/adam.jpg" alt="" />
                </div>
                <div class="col-md-10">
                    <div class="comment-text">
                        <p class="commentator">
                            João Bastinhas
                        <ul class="c-rating show-rating">
                            <li class="c-rating__item is-active"></li>
                            <li class="c-rating__item is-active"></li>
                            <li class="c-rating__item is-active"></li>
                            <li class="c-rating__item"></li>
                            <li class="c-rating__item"></li>
                        </ul>
                        </p>

                        <p>
                            Very interesting cocktail!asdsfs fsdgdsgdfgfdf dhdfhfhdhh shdasvdbsndsbnfvds shdfsfdsvvsdfvsdhfshdbfbh
                        </p>
                    </div>
                </div>

            </div>
        </div>
        <div class="col-md-6">
            <div class="drink-comment">
                <div class="col-md-2">
                    <img class="comment picture circular-photo" src="./resources/img/images/people/adam.jpg" alt="" />
                </div>
                <div class="col-md-10">
                    <div class="comment-text">
                        <p class="commentator">
                            João Bastinhas
                        <ul class="c-rating show-rating">
                            <li class="c-rating__item is-active"></li>
                            <li class="c-rating__item is-active"></li>
                            <li class="c-rating__item is-active"></li>
                            <li class="c-rating__item"></li>
                            <li class="c-rating__item"></li>
                        </ul>
                        </p>

                        <p>
                            Very interesting cocktail!asdsfs fsdgdsgdfgfdf dhdfhfhdhh shdasvdbsndsbnfvds shdfsfdsvvsdfvsdhfshdbfbh
                        </p>
                    </div>
                </div>

            </div>
        </div>
        <div class="col-md-6">
            <div class="drink-comment">
                <div class="col-md-2">
                    <img class="comment picture circular-photo" src="./resources/img/images/people/adam.jpg" alt="" />
                </div>
                <div class="col-md-10">
                    <div class="comment-text">
                        <p class="commentator">
                            João Bastinhas
                        <ul class="c-rating show-rating">
                            <li class="c-rating__item is-active"></li>
                            <li class="c-rating__item is-active"></li>
                            <li class="c-rating__item is-active"></li>
                            <li class="c-rating__item"></li>
                            <li class="c-rating__item"></li>
                        </ul>
                        </p>

                        <p>
                            Very interesting cocktail!asdsfs fsdgdsgdfgfdf dhdfhfhdhh shdasvdbsndsbnfvds shdfsfdsvvsdfvsdhfshdbfbh
                        </p>
                    </div>
                </div>

            </div>
        </div>
        <div class="col-md-6">
            <div class="drink-comment">
                <div class="col-md-2">
                    <img class="comment picture circular-photo" src="./resources/img/images/people/adam.jpg" alt="" />
                </div>
                <div class="col-md-10">
                    <div class="comment-text">
                        <p class="commentator">
                            João Bastinhas
                        <ul class="c-rating show-rating">
                            <li class="c-rating__item is-active"></li>
                            <li class="c-rating__item is-active"></li>
                            <li class="c-rating__item is-active"></li>
                            <li class="c-rating__item"></li>
                            <li class="c-rating__item"></li>
                        </ul>
                        </p>

                        <p>
                            Very interesting cocktail!asdsfs fsdgdsgdfgfdf dhdfhfhdhh shdasvdbsndsbnfvds shdfsfdsvvsdfvsdhfshdbfbh
                        </p>
                    </div>
                </div>

            </div>
        </div>

    </div>
</div>

        </div>
</div>
</body>
</html>


<script src="<c:url value="/resources/bootstrap/js/libraries/flexSlider/jquery.flexslider.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/libraries/five-star-rating/js/dist/rating.min.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/libraries/lightbox2/dist/js/lightbox.min.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/myJavascript.js" />"></script>


<script type="text/javascript" charset="utf-8">
    $(window).load(function() {
        $('.flexslider').flexslider();
    });
</script>


