
function validaNombre(formulario){
    var elemento= document.getElementById("txtdni");
    var elemento1= document.getElementById("txtcontraseña");
     var erdni=/^[1-9]{1}[0-9]{7}$/;
    if (elemento.value =="" || elemento1.value =="") {
        alert("El campo no puede ser vacio");
        return false;
    } else if (!(erdni.test(elemento.value))) {
                    alert('Contenido del dni no es un DNI válido.');
                    return false;  }
    
    return true;
    }
function valida2(formulario){
    var elemento= document.getElementById("txtdni");
      var elementoa= document.getElementById("txtcelular");
      var erdni=/^[1-9]{1}[0-9]{7}$/;
      var erdno=/^[1-9]{9}/;
             
    if (elementoa.value =="") {
        alert("El campo no puede ser vacio de celular");
        return false;
    }else if(!(erdno.test(elementoa.value))){
        alert('Contenido de celular invalido');
          return false;
    }
    else if (!(erdni.test(elemento.value))) {
                    alert('Contenido del dni no es un DNI válido.');
                    return false;  }
    
    return true;
    }
    
    function val(formulario){
    var elemento= document.getElementById("txtco");
      var elementoa= document.getElementById("txtcontra");
             
    if (elemento.value == "" || elementoa.value =="" ) {
        alert("El campo no puede estar vacio");
        return false;
    } 
    
    return true;
    }

