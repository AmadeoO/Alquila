        var header = document.getElementById("userbtn");
        var btns = header.getElementsByClassName("btn");
        for (var i = 0; i < btns.length; i++) {
            btns[i].addEventListener("click", function() {
                var current = document.getElementsByClassName("active");
                if (current.length > 0) {
                    current[0].className = current[0].className.replace(" active", "");
                }
                this.className += " active";
            });
        }

        var tipoB = document.getElementById("userbtn");
        var btns = tipoB.getElementsByClassName("tipo");
        for (var i = 0; i < btns.length; i++) {
            btns[i].addEventListener("click", function() {
                var current = document.getElementsByClassName("selected");
                if (current.length > 0) {
                    current[0].className = current[0].className.replace(" selected", "");
                }
                this.className += " selected";
            });
        }

        var expBtn = document.getElementById("expensas");
        var btns = expBtn.getElementsByClassName("monto");
        for (var i = 0; i < btns.length; i++) {
            btns[i].addEventListener("click", function() {
                var current = document.getElementsByClassName("expselected");
                if (current.length > 0) {
                    current[0].className = current[0].className.replace(" expselected", "");
                }
                this.className += " expselected";
            });
        }

 


$("#departamento").click(function(){
	$('#AuxTipo').val("Departamento");
})

$("#casa").click(function(){
	$('#AuxTipo').val("Casa");
})

$("#BtnPublicar").click(function(){
	var calle= document.getElementsByName('calle')[0].value;
	var altura= document.getElementsByName('altura')[0].value;
	var piso= document.getElementsByName('piso')[0].value;
	var departamento= document.getElementsByName('departamento')[0].value;
	
	var direccion = calle + " " + altura + " " + piso + " " + departamento;	
	$('#AuxDir').val(direccion);
	msgAnuncio();
		
})

$("#btnExpensas").click(function(){
	$('#valorExpensas').show();
})

$("#btnSinExpensas").click(function(){
	$('#valorExpensas').hide();
})

function msgAnuncio(){
	if(document.getElementsByName('calle')[0].value != "" && document.getElementsByName('altura')[0].value != ""
		&& $('#ingresartexto').val() != "" && $('#legal').val() != "" && $('#otrosDetalles').val() != "" 
		&& $('#monto').val() != ""){		
		window.alert("Se registro el anuncio con exito")
	}
}


