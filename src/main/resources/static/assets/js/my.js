$(document).ready(function(){	
	
	const id=$.cookie("id");	
	if(id){
		$("#loginDiv").html(id+" 행님 하이요 <button id='logoutBtn'>logout</button>")
	}
	$("#loginBtn").click(function(){
		const id = $("#id").val();
		const pw = $("#pw").val();
		$.post('../../login', {id,pw}, function(data){
			data=JSON.parse(data);
			if(data.id){				
				$("#loginDiv").html(data.id+" 행님 하이요 <button id='logoutBtn'>logout</button>");
				$.cookie("id",data.id);
			}
		});
	})
})
$(document).on("click","#logoutBtn",function(){
	$.post('../../logout',{},function(data){
		data=JSON.parse(data);
		if(data.msg=="ok"){
			$.removeCookie("id");
			location.reload();
		}else{
			alert(data.msg);
		}
	});
})