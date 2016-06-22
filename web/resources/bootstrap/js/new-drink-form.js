/**
 * Created by Frederico on 22/06/2016.
 */
$().ready(function(){
    $("#formulario").validate({
        rules:{
            nome: "required",
            descricao: "required",
            quantidade: "required",
            tempo:"required",
            

        }
    })
})