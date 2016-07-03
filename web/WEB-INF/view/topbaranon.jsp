<%--
  Created by IntelliJ IDEA.
  User: jpp
  Date: 22/06/16
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
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
            <a class="navbar-brand" href="#"><img class="img-responsive2" src="./resources/img/logo.png"></a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <form class="navbar-form navbar-left" role="search">
                <div class="input-group">
                    <input type="text" class="form-control" role="search" placeholder="Pesquisar pessoa, bar, bebida..." autocomplete="off">
                    <span class="input-group-addon" style="width:10%;"><span class="glyphicon glyphicon-search" role="button"></span></span>
                </div>
            </form>
            <form class="navbar-form navbar-right" role="form" action="/SocialDrink/login" method="post">
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="Email" autocomplete="off" name="email">
                </div>
                <div class="input-group">
                    <input type="password" class="form-control" placeholder="Password" autocomplete="off" name="password">
                </div>
                <a href="#"><button class="btn btn-default" type="submit">Login</button></a>
                <a href="/SocialDrink/register" class="btn btn-default" role="button">Registar</a>
            </form>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
