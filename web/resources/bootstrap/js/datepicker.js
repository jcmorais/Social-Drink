/**
 * Created by jpp on 10/06/16.
 */
$('#datePicker')
    .datepicker({
        format: 'mm/dd/yyyy'
    })
    .on('changeDate', function(e) {
        $('#datePicker').formValidation('revalidateField', 'date');
    });