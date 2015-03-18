$(function() {
	povoarDivTema();
});

function povoarDivTema() {
	$("#campoTemas").hide();
	
	$(".temas").click(function(){
		$(".temas").each(function(){
			$(this).removeClass("active-menu");
		});
		
		$("#campoTemas").show();
		
		var nomeTema = $(this).data("nome");
		//document.getElementById("temaSelecionado").innerHTML = nomeTema;
		$(this).addClass("active-menu");
		
		
		var idTema = $(this).attr("id");
		
		$.ajax({
			type:'GET',
			url:'/tema?$id='+idTema,
			success:function(data){
				document.getElementById("campoTemas").innerHTML = data;
			}
		});
			
		
	});	
}