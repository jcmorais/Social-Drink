/**
 * Created by Frederico on 27/06/2016.
 */
$(document).ready(function(){
    var stepNumber=1;
    var stepDescription='';



    $('#addPasso').click(function(event){
        event.preventDefault();
        stepDescription=$('#passos').val();
        var newRow = '<tr"><td class="col-md-1 step-number">'+stepNumber+'</td><td class="col-md-9">'+stepDescription+'</td><td class="text-right"><a href="#" class="remover col-md-2">Remover</a></td></tr>';
        stepNumber++;
        $('#stepsTable tr:last').after(newRow);
        $('#passos').val('');
    });

    $('#stepsTable ').on("click",".remover",function(){

        var tr = $(this).closest('tr');
        tr.remove();
        var number=1;
        $('#stepsTable tbody tr').each(function(){
            $(this).first('td').html(number);
            number++;
        });
        return false;
    });




});
