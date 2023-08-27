window.addEventListener( "load",   function(){
	
	
	
	  let btn = document.querySelector("#hi");	 
	  
	  btn.addEventListener("click", function(){
	  let name  = document.querySelector("#name").value;
	  alert( name);
		 // alert("hi");
		 window.location.href="/mvc/hi?name=" + name;
	  })
	
} );