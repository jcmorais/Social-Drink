<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: jpp
  Date: 28/06/16
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <title><c:out value="${user.firstname} ${user.lastname}"></c:out></title>

    <link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/css/panels.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/css/style-index-template.css"/>" rel="stylesheet">

</head>
<body>
<c:if test="${sessionid != -1}">
    <jsp:include page="../topbar.jsp"/>
</c:if>
<c:if test="${sessionid == -1}">
    <jsp:include page="../topbaranon.jsp"/>
</c:if>
<div class="container" style="padding-top: 100px">
    <div class="col-md-3">
        <div class="panel panel-default">
            <div class="panel-body" >
                <img class="img-responsive center-block" src="<c:url value="${user.getPhoto().getFilePath()}"/>"/>
                <h4><c:out value="${user.firstname} ${user.lastname}"></c:out></h4>


                <c:if test="${sessionid ne user.getID()}">
                <c:if test="${ not empty session}">
                    <c:set var="contains" value='false' />
                    <c:set var="testID" value="${user.getID()}" />

                    <c:forEach var="item" items="${followers}">
                        <p>Test${testID} Item${item}</p>
                        <c:if test="${item == testID}">
                            <c:set var="contains" value="true" />
                        </c:if>
                    </c:forEach>


                        <c:if test="${contains == 'false'}">
                            <div id="follow">
                                <a class="btn icon-btn btn-success" onclick="follow(${user.getID()},${sessionid})">
                                    <span class="glyphicon btn-glyphicon glyphicon-heart-empty img-circle text-success"></span>
                                    Seguir
                                </a>
                            </div>
                            <div id="unfollow" style="display: none;">
                                <a class="btn icon-btn btn-warning" onclick="unfollow(${user.getID()},${sessionid})">
                                    <span class="glyphicon btn-glyphicon glyphicon-minus img-circle text-warning"></span>
                                    Não Seguir
                                </a>
                            </div>
                        </c:if>
                        <c:if test="${contains == 'true'}">
                            <div id="follow" style="display: none;">
                                <a class="btn icon-btn btn-success" onclick="follow(${user.getID()},${sessionid})">
                                    <span class="glyphicon btn-glyphicon glyphicon-heart-empty img-circle text-success"></span>
                                    Seguir
                                </a>
                            </div>
                            <div id="unfollow">
                                <a class="btn icon-btn btn-warning" onclick="unfollow(${user.getID()},${sessionid})">
                                    <span class="glyphicon btn-glyphicon glyphicon-minus img-circle text-warning"></span>
                                    Não Seguir
                                </a>
                            </div>
                        </c:if>

                </c:if>
                </c:if>

            </div>
        </div>
        <div class="panel panel-default">
            <div class="panel-body" >
                <c:out value="${user.description}"></c:out>
            </div>
        </div>
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Contactos</h3>
                </div>
                <div class="panel-body" >
                    <div class="col-md-6"><b>Email:</b></div>
                    <div class="col-md-6"><c:out value="${user.email}"></c:out></div>
                    <div class="col-md-6"><b>Telefone:</b></div>
                    <div class="col-md-6"><c:out value="${user.contact}"></c:out></div>
                </div>
            </div>
    </div>
    <div class="col-md-9">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title">Bebidas</h3>
            </div>
            <div class="panel-body" >
                <c:if test="${empty userdrinks}">
                    Não existem bebidas.
                </c:if>
                <c:forEach items="${userdrinks}" var="drink">
                    <a href="/SocialDrink/drink/${drink.getID()}">
                        <div class="col-md-3">
                            <div class="he-wrap tpl6">
                                <img width="100" height="100"
                                     src="<c:url value="${drink.getPhoto().getFilePath()}"/>" class="img-responsive" alt="">
                                <div class="he-view">
                                    <div style="background: #2E2E2E; opacity: 0.7">
                                        <h3 class="a1 centered" data-animate="fadeInDown">${drink.getName()}</h3>
                                    </div>
                                    <div style="text-align:center;">
                                        <a class="" data-animate="fadeInUp"></a>
                                        <a class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-eye"></i></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </a>
                </c:forEach>
            </div>
        </div>
        <div class="col-md-7">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Sobre</h3>
                </div>
                <div class="panel-body">
                    <div class="col-md-7"><b>Data de nascimento:</b></div>
                    <div class="col-md-5"><c:out value="${user.birthday}"></c:out></div>
                    <div class="col-md-7"><b>Profissão:</b></div>
                    <div class="col-md-5"><c:out value="${user.profession}"></c:out></div>
                    <div class="col-md-7"><b>Género:</b></div>
                    <div class="col-md-5"><c:out value="${user.sex}"></c:out></div>
                    <div class="col-md-7"><b>Localidade:</b></div>
                    <div class="col-md-5"><c:out value="${user.city.name}"></c:out></div>
                </div>
            </div>
        </div>
        <div class="col-md-5">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Seguidores</h3>
                </div>
                <div class="panel-body">
                    <c:if test="${empty followers}">
                        Não existem seguidores.
                    </c:if>
                    <c:forEach var="follower" items="${followers}">
                        <a href="/SocialDrink/user/${follower.ID}" style="color: inherit">
                            <div class="col-md-2">
                                <img height="50" width="50" class="img-responsive center-block" src="<c:url value="${follower.getPhoto().getFilePath()}"/>"/>
                            </div>
                        </a>
                    </c:forEach>
                </div>
            </div>
        </div>
        <div class="col-md-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Favoritos</h3>
                </div>
                <div class="panel-body">
                    <c:if test="${empty favorites}">
                        Não existem bebidas favoritas.
                    </c:if>
                    <c:forEach items="${favorites}" var="favorite">
                        <a href="/SocialDrink/drink/${favorite.getID()}">
                            <div class="col-md-3">
                                <div class="he-wrap tpl6">
                                    <img width="100" height="100"
                                         src="<c:url value="${favorite.getPhoto().getFilePath()}"/>" class="img-responsive" alt="">
                                    <div class="he-view">
                                        <div style="background: #2E2E2E; opacity: 0.7">
                                            <h3 class="a1 centered" data-animate="fadeInDown">${favorite.getName()}</h3>
                                        </div>
                                        <div style="text-align:center;">
                                            <a class="" data-animate="fadeInUp"></a>
                                            <a class="dmbutton a2" data-animate="fadeInUp"><i class="fa fa-eye"></i></a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </a>
                    </c:forEach>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script src="<c:url value="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/retina-1.1.0.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/jquery.hoverdir.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/jquery.hoverex.min.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/follow.js" />"></script>


</html>