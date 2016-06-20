//target element
var el=document.querySelector('#avaliar');
//current rating, or initial rating
var currentRating=3;
//maxRating
var maxRating=5;
//callback to run after setting the rating
var callback=function(rating){alert(rating);};
var myRating = rating(el,currentRating,maxRating,callback);
