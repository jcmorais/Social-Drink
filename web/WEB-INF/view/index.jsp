<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Social Drink</title>

    <link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/bootstrap-theme.min.css" />
    <link href="./resources/bootstrap/css/font-awesome-4.3.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="./resources/bootstrap/css/style-index-template.css" rel="stylesheet">


    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="./resources/bootstrap/js/ie10-viewport-bug-workaround.js"></script>

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script src="./resources/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
<jsp:include page="topbaranon.jsp"/>
<div id="main-header">
    <div class="logo">
    </div><!--/logo-->
    <div class="container centered">
        <div class="row">
            <div class="col-md-8 col-md-offset-2">
                <h1>The place where you can find all the bars recipes of cocktail. Do it all by yourself! </h1>
            </div>
        </div><!--/row-->

    </div><!--/container-->
</div><!--main-header-->
<section class="features" id="features">
    <div class="container">
        <div class="row">

            <div data-wow-duration="500ms" class="sec-title text-center mb50 wow bounceInDown animated animated" style="visibility: visible; animation-duration: 500ms; animation-name: bounceInDown;">
                <h2>o que fazemos</h2>
                <div class="devider"><i class="fa fa-heart-o fa-lg"></i></div>
            </div>

            <!-- service item -->
            <div data-wow-duration="500ms" class="col-md-4 wow fadeInLeft animated" style="visibility: visible; animation-duration: 500ms; animation-name: fadeInLeft;">
                <div class="service-item">
                    <div class="service-icon">
                        <i class="fa fa-search fa-2x"></i>
                    </div>

                    <div class="service-desc">
                        <h3>Pesquise</h3>
                        <p>Pesquise todas as bebidas que deseja. Temos uma grande variedade de bebidas e todas elas com receitas realizadas por profissionais que lhe irão garantir a melhor experiência</p>
                    </div>
                </div>
            </div>
            <!-- end service item -->

            <!-- service item -->
            <div data-wow-delay="500ms" data-wow-duration="500ms" class="col-md-4 wow fadeInUp animated" style="visibility: visible; animation-duration: 500ms; animation-delay: 500ms; animation-name: fadeInUp;">
                <div class="service-item">
                    <div class="service-icon">
                        <i class="fa fa-heart fa-2x"></i>
                    </div>

                    <div class="service-desc">
                        <h3>Guarde as bebidas</h3>
                        <p>Adicione as suas receitas favoritas na sua wishlist, para manter por perto sempre uma lista organizada de bebidas que irá um dia preparar no jantar de amigos ou numa festa</p>
                    </div>
                </div>
            </div>
            <!-- end service item -->

            <!-- service item -->
            <div data-wow-delay="900ms" data-wow-duration="500ms" class="col-md-4 wow fadeInRight animated" style="visibility: visible; animation-duration: 500ms; animation-delay: 900ms; animation-name: fadeInRight;">
                <div class="service-item">
                    <div class="service-icon">
                        <i class="fa fa-plus fa-2x"></i>
                    </div>

                    <div class="service-desc">
                        <h3>Adicione</h3>
                        <p>Partilhe as suas bebidas preferidas com outras pessoas adicionando-as à plataforma, para que todos possam usufruir do seu bom gosto e torne-se um barman popular</p>
                    </div>
                </div>
            </div>
            <!-- end service item -->

        </div>
    </div>
</section>



<div id="themesell-g">
    <div class="container">
        <div class="row">

            <div class="sec-title text-center">
                <h2>Algumas das bebidas mais populares</h2>
                <div class="devider"><i class="fa fa-heart-o fa-lg"></i></div>
            </div>

        </div>
        <div class="row centered">

            <div class="col-md-8 col-md-offset-2">
                <p>Agarre já no shaker e comece a preparar algumas das bebidas mais votadas e escolhidas< especialmente para si!</p>

            </div><!--/col-md-8-->
        </div><!--/row-->
    </div><!--/.container-->
    <div class="portfolio-centered mt">
        <div class="recentitems portfolio">
            <c:forEach items="${bestDrinks}" var="drink">
            <div class="portfolio-item graphic-design">
                <div class="he-wrap tpl6">
                    <img style="display: block; margin-left: auto;
	margin-right: auto;" src="<c:url value="${drink.getPhoto().getFilePath()}"/>" class="img-responsive" alt="">
                    <div class="he-view">
                            <div style="background: #2E2E2E; opacity: 0.7">

                                <h3 class="a1 centered" style="padding-bottom: 25px" data-animate="fadeInDown">${drink.getName()}</h3>
                            </div>
                        <div style="text-align:center;">
                            <a href="/SocialDrink/drink/${drink.getID()}" class="" data-animate="fadeInUp"></a>
                            <a href="/SocialDrink/drink/${drink.getID()}" class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-eye"></i></a>
                        </div>

                        </div><!-- he bg -->
                </div><!-- he wrap -->
            </div><!-- end col-12 -->
            </c:forEach>
        </div><!-- portfolio -->
    </div><!-- portfolio container -->


</div><!--/.G-->

<div class="container ptb">
    <div class="row">

        <div class="sec-title text-center">
            <h2>Outros serviços - Adote um animal</h2>
            <div class="devider"><i class="fa fa-heart-o fa-lg"></i></div>
        </div>

    </div>
    <div class="row">

        <div class="col-md-6">
            <p>São os muitos os locais onde pode adoptar um animal. As associações são um bom ponto de partida, assim como canis municipais. Veja aqui uma lista das associações que existem no nosso país e escolha a mais perto da sua residência..</p>
        </div><!--/col-md-6-->
        <div class="col-md-6">
            <p>A presença de um animal de estimação em casa tráz felicidade e bem estar. Bolinhas de pelo alegres, fofinhas e cheias de vida, grandes ou pequenas, brancas, pretas, marrons ou amarelas, pulam e brincam o dia todo como se fossem brinquedinhos com energia infinita..</p>
        </div><!--/col-md-6-->
    </div><!--/row-->


</div><!-- /.container -->
<div class="container">
    <div class="row">
        <div class="col-md-10 col-md-offset-1">
            <img src="./resources/img/img-index-theme/dog2.jpg" class="img-responsive" alt="">
        </div>
    </div><!--/row-->
</div><!--/.container-->

<div>
    <a  class="btn btn-primary btn-lg" onclick="canis()" id="openBtn">Ver lista de canis</a>
    <!--button   type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#moviesModal">
        Filmes sugeridos
    </button-->
</div>

<div id="canisContainner">

</div>


<div id="themesell-footer">
    <div class="container">
        <div class="row centered">
            <div class="col-md-8 col-md-offset-2">
                <a href="#"><i class="fa fa-twitter"></i></a>
                <a href="#"><i class="fa fa-dribbble"></i></a>
                <a href="#"><i class="fa fa-instagram"></i></a>
                <a href="#"><i class="fa fa-facebook"></i></a>
            </div><!--/col-md-8-->
        </div>
    </div><!--/container-->
</div><!--/.F-->

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="./resources/bootstrap/js/bootstrap.min.js"></script>
<script src="./resources/bootstrap/js/retina-1.1.0.js"></script>
<script src="./resources/bootstrap/js/jquery.hoverdir.js"></script>
<script src="./resources/bootstrap/js/jquery.hoverex.min.js"></script>
<script src="./resources/bootstrap/js/jquery.prettyPhoto.js"></script>
<script src="./resources/bootstrap/js/jquery.isotope.min.js"></script>
<script src="./resources/bootstrap/js/custom.js"></script>


<script>
    // Portfolio
    (function($) {
        "use strict";
        var $container = $('.portfolio'),
                $items = $container.find('.portfolio-item'),
                portfolioLayout = 'fitRows';

        if( $container.hasClass('portfolio-centered') ) {
            portfolioLayout = 'masonry';
        }

        $container.isotope({
            filter: '*',
            animationEngine: 'best-available',
            layoutMode: portfolioLayout,
            animationOptions: {
                duration: 750,
                easing: 'linear',
                queue: false
            },
            masonry: {
            }
        }, refreshWaypoints());

        function refreshWaypoints() {
            setTimeout(function() {
            }, 1000);
        }

        $('nav.portfolio-filter ul a').on('click', function() {
            var selector = $(this).attr('data-filter');
            $container.isotope({ filter: selector }, refreshWaypoints());
            $('nav.portfolio-filter ul a').removeClass('active');
            $(this).addClass('active');
            return false;
        });

        function getColumnNumber() {
            var winWidth = $(window).width(),
                    columnNumber = 1;

            if (winWidth > 1200) {
                columnNumber = 5;
            } else if (winWidth > 950) {
                columnNumber = 4;
            } else if (winWidth > 600) {
                columnNumber = 3;
            } else if (winWidth > 400) {
                columnNumber = 2;
            } else if (winWidth > 250) {
                columnNumber = 1;
            }
            return columnNumber;
        }

        function setColumns() {
            var winWidth = $(window).width(),
                    columnNumber = getColumnNumber(),
                    itemWidth = Math.floor(winWidth / columnNumber);

            $container.find('.portfolio-item').each(function() {
                $(this).css( {
                    width : itemWidth + 'px'
                });
            });
        }

        function setPortfolio() {
            setColumns();
            $container.isotope('reLayout');
        }

        $container.imagesLoaded(function () {
            setPortfolio();
        });

        $(window).on('resize', function () {
            setPortfolio();
        });
    })(jQuery);
</script>

</body>
</html>



<script>


    function canis() {
        var url = '/SocialDrink/service/canis'; // the script where you handle the form input.
        $.ajax({
            type: "GET",
            url: url,
            data: null, // serializes the form's elements.
            success: function (data) {
                $('#canisContainner').html(data);
                $('#canisModal').modal({
                    show: true
                });
            }
        });

    }
</script>