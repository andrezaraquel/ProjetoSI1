$(function() {
	$("#campoTemas").hide();
	
	$(".temas").click(function(){
		$(".temas").each(function(){
			$(this).removeClass("active-menu");
		});
		$("#campoTemas").show();
		var id = $(this).attr('id');
		var nomeTema = $(this).data("nome");
		document.getElementById("temaSelecionado").innerHTML = nomeTema;
		$(this).addClass("active-menu");
	});
	
});


