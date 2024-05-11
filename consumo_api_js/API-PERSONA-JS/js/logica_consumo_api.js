let contenedor_personas;
let formulario_ingreso_persona;
let nombres;
let apellidos;
let telefono;
let direccion;
let correo;
let foto;
let btn_cancelar_form;
let btn_insertar_form;
let urlApi = "https://codetesthub.com/API/Obtener.php";
let alerta_persona_ingresada;

window.onload = function(){
    contenedor_personas = document.getElementById('contenedor_personas');
    formulario_ingreso_persona = document.getElementById('formulario_ingreso_persona');
    cedula = document.getElementById('cedula');
    nombres = document.getElementById('nombres');
    apellidos = document.getElementById('apellidos');
    telefono = document.getElementById('telefono');
    direccion = document.getElementById('direccion');
    correo = document.getElementById('correo');
    foto = document.getElementById('foto');
    btn_insertar_form = document.getElementById('btn_insertar_form');
    btn_cancelar_form = document.getElementById('btn_cancelar_form');
    alerta_persona_ingresada = document.getElementById('alerta_persona_ingresada');
    obtenerPersona();
}

function obtenerPersona(){
    fetch(urlApi)
    .then(respuesta => respuesta.json())
    .then(datosPersona =>{
        console.log(datosPersona);
        contenedor_personas.innerHTML+= "";
            for (let i = 0; i < datosPersona.length; i++){
                let html_temp = `<div class="col-3 mb-2 text-center p-3 border ">
                                    <div style='height:160px;'>
                                        <img src='https://upload.wikimedia.org/wikipedia/commons/9/99/Sample_User_Icon.png' style='width:50%;' >
                                    </div><br>
                                    <strong>${datosPersona[i].cedula}</strong><br>
                                    <strong>${datosPersona[i].nombres} ${datosPersona[i].apellidos}</strong><br>
                                    <strong>${datosPersona[i].email}</strong><br>
                                    <div class="row justify-content-center mt-2">
                                        <div class="col-5">
                                            <button class="btn btn-success" onclick="formularioActualizar('${datosPersona[i].cedula}','${datosPersona[i].nombres}','${datosPersona[i].apellidos}','${datosPersona[i].telefono}','${datosPersona[i].direccion}','${datosPersona[i].email}','${datosPersona[i].foto}')">Actualizar</button>
                                        </div>
                                        <div class="col-5">
                                            <button class="btn btn-danger" onclick="eliminarPersona('${datosPersona[i].cedula}')">Eliminar</button>
                                        </div>
                                    </div>
                                    
                                </div>`;
                contenedor_personas.innerHTML+= html_temp;
            }
    });
}

function formularioIngresarPersona(){
    formulario_ingreso_persona.style.display = "block";
    contenedor_personas.style.display = "none";

}

function insertarPersona(){

    console.log(correo.value)
    let datosNuevaPersona = new FormData();
    datosNuevaPersona.append("cedula",parseInt(cedula.value));
    datosNuevaPersona.append("nombres",nombres.value);
    datosNuevaPersona.append("apellidos",apellidos.value);
    datosNuevaPersona.append("telefono",telefono.value);
    datosNuevaPersona.append("direccion",direccion.value);
    datosNuevaPersona.append("email",correo.value);
    datosNuevaPersona.append("foto",foto.value);

    let configuracion = {
        method: "POST",
        headers:{
            "Accept":"application/json",
        },
        body:datosNuevaPersona,
    }

    fetch("https://codetesthub.com/API/Insertar.php",configuracion)
    .then(respuesta => respuesta.json())
    .then(datosPersona => {
        console.log(datosPersona);
        window.location.reload();
    });
}

function formularioActualizar(p_cedula, p_nombres, p_apellidos, p_telefono, p_direccion, p_correo, p_foto) {
    console.log(p_correo);
    formulario_ingreso_persona.style.display = "block";
    contenedor_personas.style.display = "none";
    
    this.cedula.value = p_cedula;
    this.nombres.value = p_nombres;
    this.apellidos.value = p_apellidos;
    this.telefono.value = p_telefono;
    this.direccion.value = p_direccion;
    this.correo.value = p_correo;
    this.foto.value = p_foto;
    btn_insertar_form.removeAttribute('onclick');
    btn_insertar_form.setAttribute('onclick',"actualizarPersona()");
    
}


function actualizarPersona(){

    console.log(correo.value)
    let datosNuevaPersona = new FormData();
    datosNuevaPersona.append("cedula",parseInt(this.cedula.value));
    datosNuevaPersona.append("nombres",nombres.value);
    datosNuevaPersona.append("apellidos",apellidos.value);
    datosNuevaPersona.append("telefono",telefono.value);
    datosNuevaPersona.append("direccion",direccion.value);
    datosNuevaPersona.append("email",correo.value);
    datosNuevaPersona.append("foto",foto.value);

    let configuracion = {
        method: "POST",
        headers:{
            "Accept":"application/json",
        },
        body:datosNuevaPersona,
    }

    fetch("https://codetesthub.com/API/Actualizar.php",configuracion)
    .then(respuesta => respuesta.json())
    .then(datosPersona => {
        console.log(datosPersona);
        window.location.reload();
    });
    
}

function eliminarPersona(p_cedula){
    this.cedula.value = p_cedula;
    let cedulaEliminar = new FormData();
    cedulaEliminar.append("cedula",parseInt(this.cedula.value));

    let configuracion = {
        method: "POST",
        headers:{
            "Accept":"application/json",
        },
        body:cedulaEliminar,
    }

    let resultado = confirm("¿Estás seguro de que deseas eliminar este elemento?");

    if (resultado) {
        fetch("https://codetesthub.com/API/Eliminar.php",configuracion)
        .then(respuesta => respuesta.json())
        .then(datosPersona =>{
            console.log(`Persona eliminada ${datosPersona.nombres}`);
            window.location.reload();
        });
    } else {
        window.location.reload();
    }
    
}

function cancelarForm(){
    window.location.reload();
}