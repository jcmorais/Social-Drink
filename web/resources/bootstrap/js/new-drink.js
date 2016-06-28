/**
 * Created by Frederico on 27/06/2016.
 */
$(document).ready(function(){
    var stepNumber=1;
    var stepDescription='';



    $('#addPasso').click(function(event){
        event.preventDefault();
        stepDescription=$('#passos').val();
        var newRow = '<tr"><td class="step-number">'+stepNumber+'</td><td>'+stepDescription+'</td><td><a href="#" class="remover">Remover</a></td></tr>';
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
