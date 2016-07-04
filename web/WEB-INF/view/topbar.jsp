<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<nav class="navbar navbar-default navbar-fixed-top">

    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#"><img class="img-responsive2" src="<c:url value="/resources/img/logo.png"/>"></a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <form class="navbar-form navbar-left" role="search">
                <div class="input-group">
                    <input type="text" class="form-control" role="search" id="searchWord" name="searchWord" placeholder="Pesquisar pessoa, bar, bebida..." autocomplete="off">
                    <span class="input-group-addon" style="width:10%;"><span class="glyphicon glyphicon-search" role="button"></span></span>
                </div>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="/SocialDrink/timeline"><img src="<c:url value="/resources/img/homebutton.png"/>"></a></li>
                <li><a href="/SocialDrink/drink/newdrink"><img src="<c:url value="/resources/img/drink.png"/>"></a></li>
                <li><a href="/SocialDrink/user/${session.getID()}"><img width="25" height="25" class="img-responsive center-block" src="<c:url value="${user.getPhoto().getFilePath()}"/>"/></a></li>
                <li><a href="/SocialDrink/logout"><img src="<c:url value="/resources/img/newfollower.png"/>"></a></li>

            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>


