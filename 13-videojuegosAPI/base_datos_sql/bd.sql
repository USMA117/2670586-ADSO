CREATE DATABASE videojuegos_api;
USE videojuegos_api;



CREATE TABLE categoria(
    id_categoria INT AUTO_INCREMENT PRIMARY KEY ,
    nombre_categoria VARCHAR(50) NOT NULL,
    descripcion_categoria VARCHAR(150) NOT NULL
);

CREATE TABLE videojuego(
    id_juego INT PRIMARY KEY AUTO_INCREMENT,
    nombre_videojuego VARCHAR(50) NOT NULL,
    descripcion_videojuego VARCHAR(150) NOT NULL,
    url_portada VARCHAR(255) NOT NULL,
    id_categoria INT,
    FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria)
);



INSERT INTO categoria (nombre_categoria,descripcion_categoria)VALUES (1,"Accion");
INSERT INTO categoria (nombre_categoria,descripcion_categoria)VALUES (2,"Aventura");


INSERT INTO videojuego (nombre_videojuego, descripcion_videojuego, url_portada, id_categoria) VALUES ("Spiderman", "Prueba de spiderman 1","https://image.api.playstation.com/vulcan/ap/rnd/202009/3021/B2aUYFC0qUAkNnjbTHRyhrg3.png",1);

INSERT INTO videojuego (nombre_videojuego, descripcion_videojuego, url_portada, id_categoria) VALUES ("Assassin's creed ", "Beta de Assassin's creed 1.0","https://img.redbull.com/images/c_crop,x_510,y_0,h_1234,w_926/c_fill,w_450,h_600/q_auto:low,f_auto/redbullcom/2020/9/16/qsavzzs1hulerklkkzzp/ac-imagen-promocional",1);

INSERT INTO videojuego (nombre_videojuego, descripcion_videojuego, url_portada, id_categoria) VALUES ("Call of Duty: Modern Warfare", "Juego completo","https://www.activision.com/content/dam/atvi/activision/atvi-touchui/activision/home/assets/cod-mw.jpg",1);

INSERT INTO videojuego (nombre_videojuego, descripcion_videojuego, url_portada, id_categoria) VALUES ("Halo infinite", "Juego completo","https://static.wikia.nocookie.net/halo/images/3/3e/Halo_infinite_vertical.png/revision/latest?cb=20200722153039&path-prefix=es",2);