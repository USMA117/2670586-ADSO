CREATE DATABASE videojuegos_api;
USE videojuegos_api;



CREATE TABLE categoria(
    id_categoria INT AUTO_INCREMENT PRIMARY KEY ,
    nombre_categoria VARCHAR(50) NOT NULL,
    descripcion_categoria VARCHAR(150) NOT NULL
)

CREATE TABLE videojuego(
    id_juego INT PRIMARY KEY AUTO_INCREMENT,
    nombre_videojuego VARCHAR(50) NOT NULL,
    desripcion_videojuego VARCHAR(150) NOT NULL,
    url_portada VARCHAR(255) NOT NULL,
    id_categoria INT,
    FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria)
)



INSERT INTO categoria (nombre_categoria,descripcion_categoria)VALUES (1,"Accion");
INSERT INTO videojuego (nombre_videojuego, descripcion_videojuego, url_portada, id_categoria) VALUES ("Spiderman", "Prueba de spiderman 1","https://image.api.playstation.com/vulcan/ap/rnd/202009/3021/B2aUYFC0qUAkNnjbTHRyhrg3.png",1);