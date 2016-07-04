/**
 * Created by jpp on 04/07/16.
 */
function search() {
    $(document).on('click', '.navbar-collapse form[role="search"].active button[type="submit"]', function(event) {
    var $form = $(this).closest('searchbar'),
        $input = $form.find('searchWord');
    alert($input.var());
    });
}