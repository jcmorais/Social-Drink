<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <!-- Bootstrap -->
    <link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/css/style-fred.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/bootstrap/css/wizard.css" />" rel="stylesheet">

</head>
<body>
<c:if test="${sessionid == -1}">
    <jsp:include page="../topbaranon.jsp"/>

    <h1>É necessário estar autenticado para criar uma nova bebida.</h1>
</c:if>

<c:if test="${sessionid != -1}">
    <jsp:include page="../topbar.jsp"/>
<div class="container">
    <div class="stepwizard">
        <div class="stepwizard-row setup-panel">
            <div class="stepwizard-step">
                <a href="#step-1" type="button" class="btn btn-primary btn-circle" style="background: #0eb493">1</a>
                <p>Informação do Drink</p>
            </div>
            <div class="stepwizard-step">
                <a href="#step-2" type="button" class="btn btn-default btn-circle" disabled="disabled" style="background: #0eb493">2</a>
                <p>Ingredientes</p>
            </div>
            <div class="stepwizard-step">
                <a href="#step-3" type="button" class="btn btn-default btn-circle" disabled="disabled" style="background: #0eb493">3</a>
                <p>Passos de Preparação</p>
            </div>
        </div>
    </div>
    <form  method="post" class="form-horizontal" id="formulario" role="form" action="/SocialDrink/drink/newdrink">
        <div class="row setup-content" id="step-1">

            <div class="form-group">
                <div class='container'>
                    <div class="row ">
                        <div class="col-md-4 col-md-offset-2">
                            <label for="nome">Nome</label>
                            <input type="text" class="form-control" id="nome" name="nome" placeholder="nome do drink" required="required">
                        </div>
                        <div class="col-md-4">
                            <label for="nome">Tipo de Bebida</label>
                            <select class="form-control" id="tipoBebida" name="tipoBebida">
                                <option value="1">Alcoólica</option>
                                <option value="2">Sem Álcool</option>
                            </select>
                        </div>
                    </div>
                </div>
            </div>

            <div class="form-group">
                <div class='container'>
                    <div class="row">
                        <div class="col-md-8 col-md-offset-2">
                            <label class="control-label">Descrição</label>
                            <input type="text" class="form-control" id="descricao" name="descricao" placeholder="descrição da bebida" required="required">
                        </div>
                    </div>
                </div>
            </div>

            <div class="form-group">
                <div class='container'>
                    <div class="row">
                        <div class="col-md-4 col-md-offset-2">
                            <label for="nome">Quantidade</label>
                            <div class="input-group">
                                <input name="quantidade" id="quantity-spinner" size="40" class="form-control" type="text" value="1" min="1" max="10" style="text-align: center;">
                            </div>
                        </div>
                        <div class="col-md-4">
                            <label>Tempo de preparação (min)</label>
                            <div class="input-group">
                                <input name="tempo" id="duration-spinner" size="40" class="form-control" type="text" value="1" min="1" max="10" style="text-align: center;">
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="container">
                <div class="form-group col-md-10 col-md-offset-8">
                    <button class="btn btn-primary nextBtn btn-lg pull-right" type="button" style="background: #0eb493">Seguinte</button>
                </div>
            </div>
        </div>
        <div class="row setup-content" id="step-2">

            <div class="form-group container">

                <div class="row">
                    <div class="col-md-4 col-md-offset-1">
                        <label>Ingredientes</label>
                        <div class="row">
                            <div class="col-md-12">
                                <input id="searchinput" class="form-control" type="search" placeholder="Search..." />
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <select class="form-control" id="lstBox1" multiple="multiple" size=8>
                                    <c:forEach items="${ingredientes}" var="ingrediente">
                                        <option value="${ingrediente.getID()}">${ingrediente.getName()}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-1">
                        <div class="list-arrows col-md-1 text-center">
                            <label class="add-ingridient"></label>
                            <button class="btn btn-default btn-sm move-right" id="btnRight">
                                <span class="glyphicon glyphicon-chevron-right">Adicionar</span>
                            </button>

                        </div>

                    </div>



                    <div class="col-md-4 col-md-offset-1">
                        <label>Tabela de Ingredientes</label>
                        <table id="tabelaIng" class="table table-center">
                            <thead>
                            <tr>
                                <th class="col-md-1">#</th>
                                <th class="col-md-2">Ingrediente</th>
                                <th class="col-md-2">Quantidade</th>
                                <th></th>
                            </tr>
                            </thead>
                            <tbody>
                            </tbody>
                        </table>
                    </div>

                </div>

            </div>

            <div class="container">
                <div class="form-group col-md-10">
                    <button class="btn col-md-offset-2 btn-default prevBtn btn-lg pull-left" type="button" style="background: #0eb493">Anterior</button>
                    <button class="btn btn-primary nextBtn btn-lg pull-right" type="button" style="background: #0eb493">Seguinte</button>
                </div>
            </div>
        </div>
        <div class="row setup-content" id="step-3">

            <div class="form-group container">
                <div class="row">
                    <div class="col-md-8 col-md-offset-2">
                        <label >Passos de preparação</label>
                        <div class="multi-field-wrapper">
                            <div class="multi-fields">
                                <div class="multi-field inline">
                                    <div class="col-md-10">
                                        <input id="passos" type="text" class="form-control">
                                    </div>
                                    <div class="col-md-2">
                                        <button  type="button" class="btn btn-default" id="addPasso">Adicionar passo</button>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-8 col-md-offset-2">
                <table class="table center" id="stepsTable">
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>Passo</th>
                        <th></th>
                    </tr>
                    </thead>
                    <tbody>
                    </tbody>
                </table>
            </div>


            <div class="container">
                <div class="form-group col-md-10">
                    <button class="btn col-md-offset-2  btn-default prevBtn btn-lg pull-left" type="button" style="background: #0eb493">Anterior</button>
                    <button class="btn btn-success btn-lg pull-right" type="submit" style="background: #0eb493">Finish!</button>
                </div>
            </div>
        </div>
    </form>
</div>
</c:if>
</body>
</html>



<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/bootstrap/js/wizard.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/jquery.validate.min.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/messages_pt_PT.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/bootstrap-number-input.js" />"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.4.5/js/bootstrapvalidator.min.js"></script>
<script src="<c:url value="/resources/bootstrap/js/validator.js" />"></script>
<script src="<c:url value="/resources/bootstrap/js/new-drink.js" />"></script>



<!--script>

    function sendForm() {
        var table = document.getElementById("tabelaIng");
        for (var i = 1, row; row = table.rows[i]; i++) {
            var input = $("<input>")
                    .attr("type", "hidden")
                    .attr("name", "ingredientes[]").val();
            $('#form1').append($(input));

            var input = $("<input>")
                    .attr("type", "hidden")
                    .attr("name", "mydata").val("bla");
            $('#form1').append($(input));
        }


    }

</script-->


<script>
    $('#quantity-spinner').bootstrapNumber();
    $('#duration-spinner').bootstrapNumber();
</script>





<script type="text/javascript">
    jQuery(document).ready(function($) {
        $('#multiselect').multiselect();
    });
</script>



<script>
    count = 1;

    $('#btnRight').click(function(e) {
        var selectedOpts = $('#lstBox1 option:selected');
        if (selectedOpts.length == 0) {
            e.preventDefault();
        }

        $('#lstBox1 option:selected').remove();

        $('#lstBox2').append($(selectedOpts).clone());
        var table = document.getElementById("tabelaIng");
        var row = table.insertRow(count);
        var cell1 = row.insertCell(0);
        var cell2 = row.insertCell(1);
        var cell3 = row.insertCell(2);
        var cell4 = row.insertCell(3);
        cell1.innerHTML = count;
        cell2.innerHTML = $(selectedOpts).text();
        cell3.innerHTML = '<input value="1" name="quantidades[]" type="text">';
        cell4.innerHTML = '<a href="#" class="remover">Remover</a>';
        count = count + 1;
        $('#ingrediente').val('');
        cell2.setAttribute('value',$(selectedOpts).attr('value'));
        e.preventDefault();
    });

    $('#btnLeft').click(function(e) {
        var selectedOpts = $('#lstBox2 option:selected');
        if (selectedOpts.length == 0) {
            alert("Nothing to move.");
            e.preventDefault();
        }

        $('#lstBox1').append($(selectedOpts).clone());
        $(selectedOpts).remove();
        e.preventDefault();
    });

    $('#tabelaIng').on("click",".remover",function(){
        var tr = $(this).closest('tr');
        tr.remove();
        return false;
    });


</script>



<script>
    $('#lstBox1').btsListFilter('#searchinput', {
        loadingClass: 'loading',
        sourceTmpl: '<a class="list-group-item" href="http://osm.org/#map=12/{lat}/{lon}"><span>{title}</span></a>',
        sourceData: function(text, callback) {
            return $.getJSON('search.php?q='+text, function(json) {
                callback(json);
            });
        }
    });
</script>


<script type="text/javascript">
    var showOnlyOptionsSimilarToText = function (selectionEl, str, isCaseSensitive) {
        if (typeof isCaseSensitive == 'undefined')
            isCaseSensitive = true;
        if (isCaseSensitive)
            str = str.toLowerCase();

        var $el = $(selectionEl);

        $el.children("option:selected").removeAttr('selected');
        $el.val('');
        $el.children("option").hide();

        $el.children("option").filter(function () {
            var text = $(this).text();
            if (isCaseSensitive)
                text = text.toLowerCase();

            if (text.indexOf(str) > -1)
                return true;

            return false;
        }).show();

    };

    var timeout;
    $("#searchinput").on("keyup", function () {
        var userInput = $("#searchinput").val();
        window.clearTimeout(timeout);
        timeout = window.setTimeout(function() {
            showOnlyOptionsSimilarToText($("#lstBox1"), userInput, true);
        }, 500);
    });

</script>




<script>
    var flag =1;

    var userId = ${sessionid};



    $("form").submit(function(e) {
        if(flag==1) {
            $('#tabelaIng tr').each(function () {
                var $tds = $(this).find("td").eq(1);
                $.each($tds, function () {
                    var input = $("<input>")
                            .attr("type", "hidden")
                            .attr("name", "ingredientes[]").val($(this).attr('value'));
                    $('#formulario').append($(input));
                });
            });

            var input = $("<input>")
                    .attr("type", "hidden")
                    .attr("name", "userId").val(userId);
            $('#formulario').append($(input));

            $('#stepsTable tr').each(function () {
                var $tds = $(this).find("td").eq(1);
                $.each($tds, function () {
                    var input = $("<input>")
                            .attr("type", "hidden")
                            .attr("name", "passos[]").val($(this).text());
                    $('#formulario').append($(input));
                });
            });


        }
        flag=0;
    });
</script>

