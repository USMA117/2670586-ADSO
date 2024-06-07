CREATE DATABASE videojuegos_api;
USE videojuegos_api;

CREATE TABLE videojuego(
    id_juego INT PRIMARY KEY AUTO_INCREMENT,
    nombre_videojuego VARCHAR(50) NOT NULL,
    desripcion_videojuego VARCHAR(150) NOT NULL,
    url_portada VARCHAR(255) NOT NULL,
    id_categoria INT,
    FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria)

)

CREATE TABLE categoria(
    id_categoria INT PRIMARY KEY AUTO_INCREMENT,
    nombre_categoria VARCHAR(50) NOT NULL,
    descripcion_categoria VARCHAR(150) NOT NULL
)