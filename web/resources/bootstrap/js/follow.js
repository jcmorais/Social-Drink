/**
 * Created by jpp on 03/07/16.
 */

function follow(userId, sessionId) {
    var url = '/SocialDrink/favorite/follow/'+userId+'/'+sessionId; // the script where you handle the form input.
    $.ajax({
        type: "POST",
        url: url,
        data: null, // serializes the form's elements.
        success: function(data)
        {
            $("#follow").attr("style","display: ");
            $("#unfollow").attr("style","display: ");
            $('#follow').hide();
            $('#unfollow').show;
        }
    });
}

function unfollow(userId, sessionId) {
    var url = '/SocialDrink/favorite/unfollow/'+userId+'/'+sessionId; // the script where you handle the form input.
    $.ajax({
        type: "POST",
        url: url,
        data: null, // serializes the form's elements.
        success: function(data)
        {
            $("#follow").attr("style","display: ");
            $("#unfollow").attr("style","display: ");
            $("#follow").show();
            $("#unfollow").hide();
        }
    });
}