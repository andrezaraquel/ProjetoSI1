$(function() {
	povoarDivTema();
	alternaDivModal();
});

function povoarDivTema() {	
	$(".temas").click(function(){
		$(".temas").each(function(){
			$(this).removeClass("active-menu");
		});
		
		var nomeTema = $(this).data("nome");
		$(this).addClass("active-menu");
		
		
		var idTema = $(this).attr("id");		
		
		$.ajax({
			type:'GET',
			url:'/tema?$id='+idTema,
			success:function(data){
				document.getElementById("campoTemas").innerHTML = data;
				$(".idDoTema").attr("value", idTema);
			}
		});			
	});	
}

function enviaFormAjax() {
	$(".enviarForm").click(function() {
		var rota = $(this).attr("form");
		
		$.ajax({
			type:'GET',
			url:'/'+rota,
			success:function(data){
				document.getElementById("campoTemas").innerHTML = data;
				$(".idDoTema").attr("value", idTema);
			}
		});
	});
}

function alternaDivModal() {
    $('#tabDicas a').click(function (e) {
        e.preventDefault();
        $(this).tab('show');
    })
}