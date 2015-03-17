$(function(){
	recuperarId();
	alterarEstrela();
});

function recuperarId() {
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
	
};



function alterarEstrela(){
	$(".star1").click(function(){
	
		var objEstrela = document.getElementById("star1");
		objEstrela.src ="star1.jpg";
	});
}