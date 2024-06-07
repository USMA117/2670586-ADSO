let catalogo_juegos = document.getElementById('catalogo_juegos');


fetch("http://localhost/videojuegosAPI/API/obtenerVideojuegos.php")
.then( respuesta => respuesta.json())
.then(datos =>{
    console.log(datos);
    for(let i = 0;i < datos.length;i++){
        const card_videojuego = document.createElement("div");
        const nombre_videojuego = document.createElement("p");
        nombre_videojuego.innerText = datos[i].nombre_videojuego;

        card_videojuego.appendChild(nombre_videojuego);
        catalogo_juegos.appendChild(card_videojuego); 

    }
})