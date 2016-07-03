/**
 * Created by jpp on 03/07/16.
 */

function follow() {


    var url = '/SocialDrink/favorite/follow/'+$('#follow').val(); // the script where you handle the form input.
    $.ajax({
        type: "POST",
        url: url,
        data: null, // serializes the form's elements.
        success: function(data)
        {
            $("#follow").hide();
            $("#unfollow").show();
        }
    });
}

function unfollow() {
    var url = '/SocialDrink/favorite/unfollow/'+$('#unfollow').val(); // the script where you handle the form input.
    $.ajax({
        type: "POST",
        url: url,
        data: null, // serializes the form's elements.
        success: function(data)
        {
            $("#unfollow").hide();
            $("#follow").show();
        }
    });
}