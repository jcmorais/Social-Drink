<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="col-md-6">
    <div class="drink-comment">
        <div class="col-md-2">
            <img class="comment picture circular-photo" src="<c:url value="${eval.getUser().getPhoto().getFilePath()}"/>" alt="" />
        </div>
        <div class="col-md-10">
            <div class="comment-text">
                <p class="commentator">
                    ${eval.getUser().getFirstname()} ${eval.getUser().getLastname()}
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
                    <div style="margin-top:5px; margin-left: 5px; color: #999999">${data} </div> </ul>
                </p>

                <p>${eval.getText()}</p>
            </div>
        </div>

    </div>
</div>