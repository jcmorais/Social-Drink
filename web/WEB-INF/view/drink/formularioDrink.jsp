<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<html>

<head>
    <meta charset="utf-8">
    <!-- Bootstrap -->
    <link rel="stylesheet" type="text/css" href="./resources/bootstrap/css/bootstrap.min.css" />
</head>
<body>
<div class='container'>
    <jsp:include page="../topbar.jsp"/>
</div>
<div class='container'>
    <div class='container'>
        <h1>Cria o teu drink</h1>
    </div>
    <div class="jumbotron col-md-8 col-md-offset-2">
        <div class="container-fluid" style="height: 100px;">
        <h2>Cria o teu drink</h2>
        <p>Partilha aqui a receita para da tua melhor bebida!</p>
        </div>
    </div>
    <form  method="post" class="form-horizontal" id="formulario" role="form" action="/SocialDrink/newdrink">

        <div class="form-group">
            <div class='container'>
                <div class="row ">
                    <div class="col-md-4 col-md-offset-2">
                        <label for="nome">Nome</label>
                        <input type="text" class="form-control" id="nome" name="nome" placeholder="nome do drink">
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
                        <input type="text" class="form-control" id="descricao" name="descricao" placeholder="descrição da bebida">
                    </div>
                </div>
            </div>
        </div>


        <!--

        <div class="form-group">
            <div class='container'>
                <div class="row">
                    <div class="col-md-8 col-md-offset-2">
                        <label >Foto</label>
                        <div><label class="btn btn-default btn-file">Browse <input type="file" style="display: none;" id="foto" name="file" for="foto"> </label></div>
                    </div>
                </div>
            </div>
        </div>
        -->

        <div class="form-group">
            <div class='container'>
                <div class="row">
                    <div class="col-md-4 col-md-offset-2">
                        <label for="nome">Quantidade</label>
                        <input type="text" class="form-control" id="quantidade" name="quantidade" placeholder="quantidade">
                    </div>
                    <div class="col-md-4">
                        <label>Tempo de preparação (min)</label>
                        <input type="text" class="form-control" id="tempo" name="tempo" placeholder="tempo">
                        <!--
                        <label>Tipo de Benida</label>

                        <select class="form-control" id="tipoBebida" name="tipoBebida">
                            <option value="1">Alcoólica</option>
                            <option value="2">Sem Álcool</option>
                        </select>
                        -->
                    </div>
                </div>
            </div>
        </div>


        <!--
        <div class="form-group container">
            <div class="row">
                <div class="col-md-4 col-md-offset-2">
                    <label>Tempo de preparação</label>
                    <input type="text" class="form-control" id="tempo" name="tempo" placeholder="tempo">
                </div>
            </div>
        </div>
        -->


        <div class="form-group container">
            <div class="row">
                <div class="col-md-6 col-md-offset-2">
                    <label >Passos de preparação</label>
                    <div class="multi-field-wrapper">
                        <div class="multi-fields">
                            <div class="multi-field">
                                <input type="text" class="form-control" name="passos[]">
                                <button type="button" class="btn btn-default" id="removePasso">Remover</button>
                            </div>
                        </div>
                        <button  type="button" class="btn btn-default" id="addPasso">Adicionar passo</button>
                    </div>
                </div>
            </div>
        </div>

        <br><br><br>


        <div class="form-group container">

            <div class="row">
                <div class="col-md-3 col-md-offset-2">
                    <label>Ingredientes</label>
                    <input id="searchinput" class="form-control" type="search" placeholder="Search..." />
                    <select class="form-control" id="lstBox1" multiple="multiple" size=8>
                        <c:forEach items="${ingredientes}" var="ingrediente">
                            <option value="${ingrediente.getID()}">${ingrediente.getName()}</option>
                        </c:forEach>
                    </select>
                </div>

                <div class="list-arrows col-md-1 text-center">
                    <label></label>
                    <button class="btn btn-default btn-sm move-right" id="btnRight">
                        <span class="glyphicon glyphicon-chevron-right"></span>
                    </button>
                </div>

                <div class="col-md-4">
                    <label>Tabela de Ingredientes</label>
                    <table id="tabelaIng" class="table table-center">
                        <thead>
                        <tr>
                            <th class="col-md-1">#</th>
                            <th class="col-md-2">Ingrediente</th>
                            <th class="col-md-2">Quantidade</th>
                        </tr>
                        </thead>
                        <tbody>
                        </tbody>
                    </table>
                </div>

            </div>

        </div>
        <button  type="submit" form="formulario" class="btn btn-default col-md-offset-2">Submit</button>
    </form>
</div>
</body>
</html>

<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="./resources/bootstrap/js/bootstrap.min.js"></script>
<script src="./resources/bootstrap/js/multiselect.js"></script>
<script src="./resources/bootstrap/js/bootstrap-list-filter.src.js"></script>
<script src="./resources/bootstrap/js/bootstrap.min.js"></script>

<script>
    var countP = 1;
    function funcPassos() {
        var table = document.getElementById("tabelaPassos");
        var row = table.insertRow(countP);
        var cell1 = row.insertCell(0);
        var cell2 = row.insertCell(1);
        cell1.innerHTML = countP;
        cell2.innerHTML = $('#passo').val();
        countP = countP + 1;
        $('#passo').val('');
        cell2.setAttribute('id','passos');
    }
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
            alert("Nothing to move.");
            e.preventDefault();
        }

        $('#lstBox2').append($(selectedOpts).clone());
        var table = document.getElementById("tabelaIng");
        var row = table.insertRow(count);
        var cell1 = row.insertCell(0);
        var cell2 = row.insertCell(1);
        var cell3 = row.insertCell(2);
        cell1.innerHTML = count;
        cell2.innerHTML = $(selectedOpts).text();
        cell3.innerHTML = '<input name="quantidades[]" type="text">';
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
    $('.multi-field-wrapper').each(function() {
        var $wrapper = $('.multi-fields', this);
        $("#addPasso", $(this)).click(function(e) {
            $('.multi-field:first-child', $wrapper).clone(true).appendTo($wrapper).find('input').val('').focus();
        });
        $('.multi-field #removePasso', $wrapper).click(function() {
            if ($('.multi-field', $wrapper).length > 1)
                $(this).parent('.multi-field').remove();
        });
    });
</script>


<script>
    $("form").submit(function() {


            $('#tabelaIng tr').each(function () {
                var $tds = $(this).find("td").eq(1);

                $.each($tds, function () {
                    console.log($(this).attr('value'));
                    var input = $("<input>")
                            .attr("type", "hidden")
                            .attr("name", "ingredientes[]").val($(this).attr('value'));
                    $('#formulario').append($(input));
                });
            });

            var MyRows = $('#tabelaIng').find('tbody').find('tr');
            for (var i = 0; i < MyRows.length; i++) {
                console.log($(MyRows[i]).find('td:eq(0)').html());
            }


            var e = document.getElementById("tipoBebida");
            var idTipo = e.options[e.selectedIndex].value;
            var input = $("<input>")
                    .attr("type", "hidden")
                    .attr("name", "mydata").val('daddos de teste');
            $('#formulario').append($(input));


    });
</script>

