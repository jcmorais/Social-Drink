<%--
  Created by IntelliJ IDEA.
  User: Frederico
  Date: 20/06/2016
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    <link rel="stylesheet" href="./resources/bootstrap/css/style-fred.css" media="screen" title="no title" charset="utf-8">
    <link rel="stylesheet" href="./resources/bootstrap/js/libraries/flexSlider/flexslider.css" media="screen" title="no title" charset="utf-8">
    <link rel="stylesheet" href="./resources/bootstrap/js/libraries/five-star-rating/css/rating.css" media="screen" title="no title" charset="utf-8">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
    <title>Drink</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-4">
            <h2>
                Vodka de Morango
            </h2>
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
                    <img class="img-responsive center-block drink-main-image" src="./resources/img/images/caipi.jpg" alt="caipi" />
                </div>
            </div>
            <div class="row">
                <h3 class="text-center">Informação Geral</h3>
                <div class="col-md-3">
                    <p class="drink-item-information">
                        4
                    </p>
                    <p class="text-center">
                        Ingredientes
                    </p>
                </div>
                <div class="col-md-3">
                    <p class="drink-item-information">
                        2
                    </p>
                    <p class="text-center">
                        Rendimento
                    </p>
                </div>
                <div class="col-md-3">
                    <p class="drink-item-information">
                        6
                    </p>
                    <p class="text-center">
                        Minutos
                    </p>
                </div>
                <div class="col-md-3">
                    <p class="drink-item-information">
                        4
                    </p>
                    <p class="text-center">
                        Comentários
                    </p>
                </div>

            </div>
        </div>
        <div class="col-md-4 col-md-offset-2">
            <h3 class="text-center">Descrição</h3>
            <p class="drink-description">
                Esta é uma caipirinha. Muito boa e refrescante.
                O Lorem Ipsum é um texto modelo da indústria tipográfica e de impressão. O Lorem Ipsum tem vindo a ser o texto padrão usado por estas indústrias desde o ano de 1500, quando uma misturou os caracteres de um texto para criar um espécime de livro. Este texto não só sobreviveu 5 séculos, mas também o salto para a tipografia electrónica, mantendo-se essencialmente inalterada. Foi popularizada nos anos 60 com a disponibilização das folhas de Letraset, que continham passagens com Lorem Ipsum, e mais recentemente com os programas de publicação como o Aldus PageMaker que incluem versões do Lorem Ipsum.
            </p>

        </div>
    </div>
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <h3 class="text-center">Share</h3>
            <div class="row">
                <div class="col-md-3">
                    <a href="#">
                        <img class="social-icon" src="./resources/img/images/social/facebook.ico" alt="" />
                    </a>
                </div>
                <div class="col-md-3">
                    <a href="#">
                        <img class="social-icon" src="./resources/img/images/social/google.ico" alt="" />
                    </a>
                </div>
                <div class="col-md-3">
                    <a href="#">
                        <img class="social-icon" src="./resources/img/images/social/instagram.ico" alt="" />
                    </a>
                </div>
                <div class="col-md-3">
                    <a href="#">
                        <img class="social-icon" src="./resources/img/images/social/twitter.ico" alt="" />
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
                    <th class="text-center">
                        Ingredientes
                    </th>
                </tr>
                <tr>
                    <td>
                        100 ml Vodka
                    </td>
                </tr>
                <tr>
                    <td>
                        3 morangos
                    </td>
                </tr>
            </table>
        </div>
        <div class="col-md-3 col-md-offset-2">
            <table class="table table-striped table-bordered text-center">
                <tr>
                    <th class="text-center" colspan="2">
                        Preparação
                    </th>
                </tr>
                <tr>
                    <td>
                        1
                    </td>
                    <td>
                        Bater os morangos na liquidificadora
                    </td>
                </tr>
                <tr>
                    <td>
                        2
                    </td>
                    <td>
                        Deitar vodka num copo largo
                    </td>
                </tr>
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
                        <label for="rating" class="text-center">Avaliar</label>
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
        <h3 class="text-center">Outros comentários</h3>
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


<script type="text/javascript" charset="utf-8">
    $(window).load(function() {
        $('.flexslider').flexslider();
    });
</script>


</body>

<script src="libraries/flexSlider/jquery.flexslider.js"></script>
<script type="text/javascript" src="./resources/bootstrap/js/libraries/five-star-rating/js/dist/rating.min.js"></script>
<script type="text/javascript" src="./resources/bootstrap/js/libraries/lightbox2/dist/js/lightbox.min.js"></script>
<script type="text/javascript" src="./resources/bootstrap/js/myJavascript.js">

</script>
</html>

