let catalogo_juegos = document.getElementById('catalogo_juegos');


fetch("http://localhost/13-videojuegosAPI/API/obtenerVideojuegos.php")
.then( respuesta => respuesta.json())
.then(datos =>{
    console.log(datos);
    for(let i = 0;i < datos.length;i++){
        const card_videojuego = document.createElement("div");
        card_videojuego.setAttribute("class","contenedor_videojuego");

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
})