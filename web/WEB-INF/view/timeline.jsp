<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Social Drink</title>

    <link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/bootstrap-theme.min.css" />
    <link href="./resources/bootstrap/css/timeline.css" rel="stylesheet">
    <link href="./resources/bootstrap/css/style-fred.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <![endif]-->
    <script src="./resources/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container">
    <jsp:include page="topbar.jsp"/>
    <div class="page-header">
        <h1 id="timeline">Timeline</h1>
    </div>
    <ul class="timeline">
        <li>
            <div class="timeline-badge"><i class="glyphicon glyphicon-glass"></i></div>
            <div class="timeline-panel">
                <div class="timeline-heading">
                    <h4 class="timeline-title">Bar X</h4>
                    <p><small class="text-muted"><i class="glyphicon glyphicon-time"></i> 11 horas atrás</small></p>
                </div>
                <div class="timeline-body">
                    <img class="col-md-5" src="./resources/img/images/caipirinha/1.jpg" alt="" />
                    <p class="col-md-7">
                        Noite da caipirinha hoje. 50% de desconto. Todas as segundas bebidas brancas teão 25%
                    </p>
                </div>
            </div>
        </li>
        <li class="timeline-inverted">
            <div class="timeline-badge warning"><i class="glyphicon glyphicon-user"></i></div>
            <div class="timeline-panel">
                <div class="timeline-heading">
                    <div class="container">
                        <div class="col-md-1">
                            <img class="circular-photo" src="./resources/img/images/people/adam.jpg" alt="" />
                        </div>
                        <div class="col-md-10">
                            <h4 class="timeline-title">João Madeira</h4>
                            <p><small class="text-muted"><i class="glyphicon glyphicon-time"></i> 12 horas atrás</small></p>
                        </div>
                    </div>
                </div>
                <div class="timeline-body">
                    <p>Mussum ipsum cacilds, vidis litro abertis. Consetis adipiscings elitis. Pra lá , depois divoltis porris, paradis. Paisis, filhis, espiritis santis. Mé faiz elementum girarzis, nisi eros vermeio, in elementis mé pra quem é amistosis quis leo. Manduma pindureta quium dia nois paga. Sapien in monti palavris qui num significa nadis i pareci latim. Interessantiss quisso pudia ce receita de bolis, mais bolis eu num gostis.</p>
                    <p>Suco de cevadiss, é um leite divinis, qui tem lupuliz, matis, aguis e fermentis. Interagi no mé, cursus quis, vehicula ac nisi. Aenean vel dui dui. Nullam leo erat, aliquet quis tempus a, posuere ut mi. Ut scelerisque neque et turpis posuere pulvinar pellentesque nibh ullamcorper. Pharetra in mattis molestie, volutpat elementum justo. Aenean ut ante turpis. Pellentesque laoreet mé vel lectus scelerisque interdum cursus velit auctor. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam ac mauris lectus, non scelerisque augue. Aenean justo massa.</p>
                </div>
            </div>
        </li>
        <li>
            <div class="timeline-badge danger"><i class="glyphicon glyphicon-heart"></i></div>
            <div class="timeline-panel">
                <div class="timeline-heading">
                    <p><small class="text-muted"><i class="glyphicon glyphicon-time"></i> 12 horas atrás</small></p>
                </div>
                <div class="timeline-body">
                    <div class="col-md-2">
                        <img class="circular-photo" src="./resources/img/images/caipirinha/2.jpg" alt="" />
                    </div>
                    <div class="col-md-10">
                        <p>
                            José Ribeiro gostou <a href="#">desta foto</a>
                        </p>
                    </div>
                    <img>
                </div>
            </div>
        </li>
        <li class="timeline-inverted">
            <div class="timeline-badge success"><i class="glyphicon glyphicon-stats"></i></div>
            <div class="timeline-panel">
                <div class="timeline-heading">
                    <p><small class="text-muted"><i class="glyphicon glyphicon-time"></i> 12 horas atrás</small></p>
                </div>
                <div class="timeline-body">
                    <div class="col-md-2">
                        <img class="circular-photo" src="./resources/img/images/caipirinha/2.jpg" alt="" />
                    </div>
                    <div class="col-md-10">
                        <p>
                            José Rodrigues avaliou a seguinte receita <a href="#">Caipirinha</a>
                        </p>
                    </div>
                    <img>
                </div>
            </div>
        </li>
        <li class="timeline-inverted">
            <div class="timeline-badge info"><i class="glyphicon glyphicon-thumbs-up"></i></div>
            <div class="timeline-panel">
                <div class="timeline-heading">
                    <p><small class="text-muted"><i class="glyphicon glyphicon-time"></i> 12 horas atrás</small></p>
                </div>
                <div class="timeline-body">
                    <div class="col-md-2">
                        <img class="circular-photo" src="./resources/img/images/caipirinha/2.jpg" alt="" />
                    </div>
                    <div class="col-md-10">
                        <p>
                            José Rodrigues gostou da seguinte receita <a href="#">Caipirinha</a>
                        </p>
                    </div>
                    <img>
                </div>
            </div>
        </li>

    </ul>
</div>




</body>
</html>