<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: carlosmorais
  Date: 04/07/16
  Time: 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<div class="modal fade" id="canisModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">Encontra o canil mais perto de ti!</h4>
            </div>
            <div class="modal-body">
                <div class="row">
                    <c:forEach items="${canis}" var="canil">
                        <div class="col-md-4 col-centered animal">
                            <!--img class="logo" src="pata.gif" alt="" /-->
                            <div class="row">
                                <div class="col-md-8 col-md-offset-2">
                                    <p class="animal-title center-block">
                                            ${canil.getName()}
                                    </p>
                                </div>
                            </div>
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
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
                </div>
            </div>
        </div>
    </div>

</div>
