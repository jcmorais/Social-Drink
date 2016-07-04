<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">


    <!-- Bootstrap -->
    <link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css"/>" rel="stylesheet">

    <link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/style-fred2.css"/>" media="screen" title="no title" charset="utf-8">
    <link href="<c:url value="/resources/bootstrap/css/style-fred.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/js/libraries/flexSlider/flexslider.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/js/libraries/five-star-rating/css/rating.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/css/style-fred.css" />" rel="stylesheet">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
    <title>Drink</title>
</head>
<body>
<div class="container">
    <div class="row row-centered">

        <!-- Button trigger modal -->
        <button  type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#moviesModal">
            Launch demo modal
        </button>

        <!-- Modal -->
        <div class="modal fade" id="moviesModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="myModalLabel">Com esta bebida sugerimos...</h4>
                    </div>
                    <div class="modal-body">
                        <div class="row">
                            <c:forEach items="${movies}" var="movie">
                                <div class="col-md-3 movie">
                                    <p class="title"> ${movie.getTitle()} </p>
                                    <li><img class=" image" src="<c:url value="${movie.getImg_path()}"/>"/></li>
                                    <p class="year centered"> ${movie.getYear()}  </p>
                                    <button class="btn">View</button>
                                </div>
                            </c:forEach>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
                    </div>
                </div>
            </div>
        </div>

    </div>
        </div>


    <div class="row row-centered">
<c:forEach items="${canis}" var="canil">
        <div class="col-md-4 col-centered animal">
            <!--img class="logo" src="pata.gif" alt="" /-->
            <p class="animal-title">
                ${canil.getName()}
            </p>
            <hr>
          <span class="glyphicon glyphicon-home icon">
          </span>
            <p class="animal-address">${canil.getAddress()}</p>
            <p class="animal-text">${canil.getDescription()}</p>
            <hr>
            <div class="contacts">
                <p class="head">Contacts:</p>
                <div class="contact">
              <span class="glyphicon glyphicon-time icon">
              </span>
                    <p class="schedule">${canil.getSchedule()}</p>
                </div>
                <div class="contact">
              <span class="glyphicon glyphicon-phone-alt icon">
              </span>
                    <p class="phone">Phone: </span>${canil.getPhone()}</p>
                </div>

                <div class="contact">
              <span class="glyphicon glyphicon-envelope icon">
              </span>
                    <a class="mail" href="mailto:${canil.getEmail()}?Subject=Adoptar%20Animal" target="_top">Contactar Agora!</a>
                </div>
                <div class="contact">
              <span class="glyphicon glyphicon-globe icon">
              </span>
                    <a class="map" href="http://maps.google.com/?q=${canil.getLat()},${canil.getLng()}" target="_blank">Ver no mapa!</a>
                </div>
            </div>
        </div>
    </c:forEach>

    </div>
</div>

</body>


<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="<c:url value="/resources/bootstrap/js/libraries/flexSlider/jquery.flexslider.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/libraries/five-star-rating/js/dist/rating.min.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/libraries/lightbox2/dist/js/lightbox.min.js" />"></script>


<script type="text/javascript" src="<c:url value="/resources/bootstrap/js/modal.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/bootstrap/js/myJavascript.js" />">

</script>
</html>
