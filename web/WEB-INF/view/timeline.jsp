<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Social Drink</title>

    <!-- Bootstrap -->
    <link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css" />" rel="stylesheet">

    <!-- Timeline -->
    <link href="<c:url value="/resources/bootstrap/css/timeline.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/css/style-fred.css"/>" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <![endif]-->
    <script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>

</head>
<body>
<div class="container">
    <jsp:include page="topbar.jsp"/>
    <div class="page-header">
        <h1 id="timeline">Timeline</h1>
    </div>
    <ul class="timeline">


        <c:forEach items="${events}" var="event">
            <c:if test="${event.getClass().name == 'socialdrink.EventDrink'}">
                <li class="timeline-inverted">
                    <div class="timeline-badge warning"><i class="glyphicon glyphicon-glass"></i></div>
                    <div class="timeline-panel">
                        <div class="timeline-heading">
                            <div class="container">
                                <div class="col-md-1">
                                    <img class="circular-photo" src="<c:url value="${event.getDrink().getPhoto().getFilePath()}"/>"/>
                                </div>
                                <div class="col-md-10">
                                    <h4 class="timeline-title">Criou o Drink ${event.getDrink().getName()}</h4>
                                    <p><small class="text-muted"><i class="glyphicon glyphicon-time"></i> 12 horas atrás</small></p>
                                </div>
                            </div>
                        </div>
                        <div class="timeline-body">
                            ${event.getDrink().getDescription()}
                        </div>
                    </div>
                </li>
            </c:if>

            <c:if test="${event.getClass().name == 'socialdrink.EventEval'}">
                <li class="timeline-inverted">
                    <div class="timeline-badge warning"><i class="glyphicon glyphicon-star-empty"></i></div>
                    <div class="timeline-panel">
                        <div class="timeline-heading">
                            <div class="container">
                                <div class="col-md-1">
                                    <!-- stars -->
                                </div>
                                <div class="col-md-10">
                                    <h4 class="timeline-title">Avaliou o Drink ${event.getDrink().getName()}</h4>
                                    <p><small class="text-muted"><i class="glyphicon glyphicon-time"></i> 12 horas atrás</small></p>
                                </div>
                            </div>
                        </div>
                        <div class="timeline-body">
                                ${event.getDrink().getDescription()}
                        </div>
                    </div>
                </li>
            </c:if>


            <c:if test="${event.getClass().name == 'socialdrink.EventFavorite'}">
                <li class="timeline-inverted">
                    <div class="timeline-badge warning"><i class="glyphicon glyphicon-heart"></i></div>
                    <div class="timeline-panel">
                        <div class="timeline-heading">
                            <div class="container">
                                <div class="col-md-10">
                                    <h4 class="timeline-title">Adicionou o Drink ${event.getDrink().getName()} aos Favoritos</h4>
                                    <p><small class="text-muted"><i class="glyphicon glyphicon-time"></i> 12 horas atrás</small></p>
                                </div>
                            </div>
                        </div>
                        <div class="timeline-body">
                                ${event.getDrink().getDescription()}
                        </div>
                    </div>
                </li>
            </c:if>

        </c:forEach>
    </ul>
</div>




</body>
</html>