<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: carlosmorais
  Date: 04/07/16
  Time: 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/style-fred2.css"/>" media="screen" title="no title" charset="utf-8">

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
                            <img class="image center-block" src="<c:url value="${movie.getImg_path()}"/>"/>
                            <p class="year centered"> ${movie.getYear()}  </p>
                            <button class="btn center-block">View</button>
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
