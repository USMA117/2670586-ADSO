let contentPrincipal;
let nombrePokemon;
let imgPokemon;
let spinnerCarga;
let btnPagAnterior;
let btnPagSiguiente;
let contadorPaginas = 0;
let pagina = 1;
let endpoint = "https://pokeapi.co/api/v2/pokemon";

window.onload = function(){
    contentPrincipal = document.getElementById('contentPrincipal');
    nombrePokemon = document.getElementById('nombrePokemon');
    imgPokemon = document.getElementById('imgPokemon');
    btnPagAnterior = document.getElementById('btnPagAnterior');
    btnPagSiguiente = document.getElementById('btnPagSiguiente');
    paginaActual = document.getElementById('paginaActual');
    spinnerCarga = document.getElementById('spinner');
    consumoAPI(endpoint);
    btnPagSiguiente.addEventListener("click",()=>{
        endpoint = `https://pokeapi.co/api/v2/pokemon?offset=${contadorPaginas+=20}&limit=20`
        reiniciarContent();
        pagina += 1;
        consumoAPI(endpoint);
        
    });

    btnPagAnterior.addEventListener("click",()=>{
        endpoint = `https://pokeapi.co/api/v2/pokemon?offset=${contadorPaginas-=20}&limit=20`
        reiniciarContent();
        consumoAPI(endpoint);
        pagina -= 1;
    });
}

function consumoAPI(endpoint){
    
    // Consumo - AJAX
        fetch(endpoint)
        .then(respuesta=>respuesta.json() )
        .then(data => {
            spinnerCarga.style.display = "none";
            console.log(data.results);
            contentPrincipal.innerHTML+= "";
            for (let i = 0; i < data.results.length; i++){
                let html_temp = `<div class="col-3">
                                    <button onclick="cargarDetalle('${data.results[i].url}')" class="btn btn-outline-light col-12 m-1 mt-0 border fs-4"> ${data.results[i].name} </button>
                                </div>`;
                contentPrincipal.innerHTML+= html_temp;
            }
            paginaActual.textContent = pagina;
            
        })
        .catch(error => {
            spinnerCarga.style.display = "block";
        });
}

function cargarDetalle(endpoint){
    fetch(endpoint)
    .then(respuesta => respuesta.json())
    .then(data => {
        nombrePokemon.innerHTML = data.name;
        imgPokemon.src = data.sprites.other.dream_world.front_default;
    });

}
// region reiniciar
function reiniciarContent(){
    contentPrincipal.innerHTML = "";
    imgPokemon.src = "";
    nombrePokemon.textContent = "Escoge un pokemon";
}