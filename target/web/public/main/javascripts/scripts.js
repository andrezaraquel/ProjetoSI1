
$(function() {
	povoarDivTema();
	alternaDivModal();	
//	var idTema = 11;
//	enviarFormNovaDica(idTema);
	
});

function povoarDivTema() {	
	$(".temas").click(function(){
		
		$(".metaDica").hide();
		
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
				//enviarFormNovaDica(idTema);
			}
		});			
	});		
}

function alternaDivModal() {
    $('#tabDicas a').click(function (e) {
        e.preventDefault();
        $(this).tab('show');
    });
}

function enviarFormNovaDica(idTema) {
	if(idTema != null) {
		alert("entrou aqui");
		$.ajax({
			type:'GET',
			url:'/tema?$id='+idTema,
			success:function(data){
				document.getElementById("campoTemas").innerHTML = data;						
			}
		});		
	}
}


