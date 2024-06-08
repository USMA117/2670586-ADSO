let catalogo_juegos = document.getElementById('catalogo_juegos');
let btn_ingresar_persona = document.getElementById('btn_ingresar_persona');
let modal = document.getElementById('modal');
let btn_cerrar_modal = document.getElementById('cerrar_modal');
let btn_eliminar_del_modal = document.getElementById('btn_eliminar_del_modal');
let btn_actualizar_insertar_modal = document.getElementById('btn_actualizar_insertar_modal');

let portada_videojuego_modal = document.getElementById("portada_videojuego_modal");
let nombre_videojuego_modal = document.getElementById("nombre_videojuego_modal");
let descripcion_videojuego_modal = document.getElementById("descripcion_videojuego_modal");
let url_portada_videojuego_modal = document.getElementById('url_portada_videojuego_modal');
let categoria_videojuego_modal = document.getElementById('categoria_videojuego_modal');

function imiprimirCatalogoJuegos(){
    fetch("http://localhost/13-videojuegosAPI/API/obtenerVideojuegos.php")
    .then( respuesta => respuesta.json())
    .then(datos =>{
        console.log(datos);
        for(let i = 0;i < datos.length;i++){
            const card_videojuego = document.createElement("div");
            card_videojuego.setAttribute("class","contenedor_videojuego");
            card_videojuego.addEventListener("click",()=>{
                modal.style.display = "block";
                imprimir_datos_modal(datos[i]);
            });

            const nombre_videojuego = document.createElement("p");
            nombre_videojuego.setAttribute("class","nombre_videojuego");

            const portada_videojuego = document.createElement("img");
            portada_videojuego.setAttribute("class","portada_videojuego");

            portada_videojuego.src = datos[i].url_portada
            nombre_videojuego.innerText = datos[i].nombre_videojuego;
            card_videojuego.appendChild(portada_videojuego);
            card_videojuego.appendChild(nombre_videojuego);
            catalogo_juegos.appendChild(card_videojuego); 

        }
    });
}
imiprimirCatalogoJuegos();

function imprimir_datos_modal(videojuegoActual){
    console.log(videojuegoActual);

    portada_videojuego_modal.src = videojuegoActual.url_portada;
    url_portada_videojuego_modal.value = videojuegoActual.url_portada;
    nombre_videojuego_modal.value = videojuegoActual.nombre_videojuego;
    descripcion_videojuego_modal.value = videojuegoActual.descripcion_videojuego;

    btn_actualizar_insertar_modal.textContent = "Editar";
    btn_actualizar_insertar_modal.addEventListener("click",()=>{
        actualizarVideojuego(videojuegoActual.id_juego,videojuegoActual.nombre_videojuego,videojuegoActual.descripcion_videojuego,videojuegoActual.url_portada);
    });
    btn_eliminar_del_modal.textContent = "Eliminar"

}

btn_cerrar_modal.addEventListener("click",()=>{
    modal.style.display = "none";
});

btn_ingresar_persona.addEventListener("click",()=>{
    portada_videojuego_modal.src = "";
    url_portada_videojuego_modal.value = "";
    nombre_videojuego_modal.value = "";
    descripcion_videojuego_modal.value = "";
    categoria_videojuego_modal.value = "";

    btn_actualizar_insertar_modal.textContent = "Insertar";
    btn_eliminar_del_modal.textContent = "Cancelar"

    btn_actualizar_insertar_modal.addEventListener("click",()=>{
        insertarNuevoVideojuego(url_portada_videojuego_modal.value,nombre_videojuego_modal.value,descripcion_videojuego_modal.value,categoria_videojuego_modal.value );
    });
    btn_eliminar_del_modal.addEventListener("click",()=>{
        modal.style.display = "none";
    });
    url_portada_videojuego_modal.addEventListener("input", ()=> {
        portada_videojuego_modal.src = url_portada_videojuego_modal.value;
    });
    modal.style.display = "block";
});

function insertarNuevoVideojuego(portada,nombre,descripcion,categoria){
    console.log(nombre);
    let nuevoJuego = new FormData();
    nuevoJuego.append("nombre_videojuego",nombre);
    nuevoJuego.append("descripcion_videojuego",descripcion);
    nuevoJuego.append("url_portada",portada);
    nuevoJuego.append("id_categoria",categoria);

    let configuracion = {
        method: "POST",
        headers:{
            "Accept":"application/json",
        },
        body:nuevoJuego,
    }

    fetch("http://localhost/13-videojuegosAPI/API/insertarVideojuego.php",configuracion)
    .then(respuesta => respuesta.json())
    .then(datos =>{
        console.log(datos);
    });
}

function actualizarVideojuego(id,nombre,descripcion,portada){
    
    let datosActualizarVideojuego = new FormData();
    datosActualizarVideojuego.append("id_juego",id);
    datosActualizarVideojuego.append("nombre_videojuego",nombre);
    datosActualizarVideojuego.append("descripcion_videojuego",descripcion);
    datosActualizarVideojuego.append("url_portada",portada);

    let configuracion = {
        method: "POST",
        headers:{
            "Accept":"application/json",
        },
        body:datosActualizarVideojuego,
    }

    fetch("http://localhost/13-videojuegosAPI/API/actualizarVideojuego.php",configuracion)
    .then(respuesta => respuesta.json())
    .then(datos => {
        console.log(datos);
    });

}