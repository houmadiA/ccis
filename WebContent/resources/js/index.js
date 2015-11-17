
$(document).ready(function ($) {
alert("hhhhhhhh");
	$("#suiv").click(function(){
		$hauteur=$(".temoignages").height();
		$hauteur=$hauteur+300;
		$(".temoignages").animate({scrollTop:$hauteur},2000);
	})

	$("#prec").click(function(){
		$hauteur=$(".temoignages").height();
		$hauteur=$hauteur-300;
		$(".temoignages").animate({scrollTop:$hauteur},2000);
	})
});