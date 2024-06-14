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



INSERT INTO categoria (nombre_categoria,descripcion_categoria)VALUES ("Accion","Mucha Accion");
INSERT INTO categoria (nombre_categoria,descripcion_categoria)VALUES ("Aventura","Eres un aventurero");
INSERT INTO categoria (nombre_categoria, descripcion_categoria)VALUES ("Deportes", "Juegos de fútbol, baloncesto y otros deportes.");
INSERT INTO categoria (nombre_categoria, descripcion_categoria)VALUES ("Estrategia", "Juegos que requieren planificación y habilidades tácticas.");
INSERT INTO categoria (nombre_categoria, descripcion_categoria) VALUES ("Simulación", "Juegos que simulan actividades de la vida real.");
INSERT INTO categoria (nombre_categoria, descripcion_categoria) VALUES ("RPG", "Juegos de rol donde desarrollas personajes y sigues una historia.");
INSERT INTO categoria (nombre_categoria, descripcion_categoria) VALUES ("Puzzle", "Juegos que desafían tu mente con rompecabezas y problemas.");
INSERT INTO categoria (nombre_categoria, descripcion_categoria) VALUES ("Terror", "Juegos diseñados para asustar y emocionar.");
INSERT INTO categoria (nombre_categoria, descripcion_categoria) VALUES ("Carreras", "Juegos de alta velocidad y competición en pistas de carreras.");
INSERT INTO categoria (nombre_categoria, descripcion_categoria) VALUES ("Arcade", "Juegos rápidos y fáciles de jugar, típicos de las máquinas recreativas.");


INSERT INTO videojuego (nombre_videojuego, descripcion_videojuego, url_portada, id_categoria) VALUES ("Spiderman", "Prueba de spiderman 1","https://image.api.playstation.com/vulcan/ap/rnd/202009/3021/B2aUYFC0qUAkNnjbTHRyhrg3.png",1);
INSERT INTO videojuego (nombre_videojuego, descripcion_videojuego, url_portada, id_categoria) VALUES ("Assassin's creed ", "Beta de Assassin's creed 1.0","https://img.redbull.com/images/c_crop,x_510,y_0,h_1234,w_926/c_fill,w_450,h_600/q_auto:low,f_auto/redbullcom/2020/9/16/qsavzzs1hulerklkkzzp/ac-imagen-promocional",1);
INSERT INTO videojuego (nombre_videojuego, descripcion_videojuego, url_portada, id_categoria) VALUES ("Call of Duty: Modern Warfare", "Juego completo","https://www.activision.com/content/dam/atvi/activision/atvi-touchui/activision/home/assets/cod-mw.jpg",1);
INSERT INTO videojuego (nombre_videojuego, descripcion_videojuego, url_portada, id_categoria) VALUES ("Halo infinite", "Juego completo","https://m.media-amazon.com/images/I/81r6IF9GNNL._AC_UF1000,1000_QL80_.jpg",2);
INSERT INTO videojuego (nombre_videojuego, descripcion_videojuego, url_portada, id_categoria) VALUES ("Gears of war", "Juego completo","https://cdn.gearsofwar.com/gearsofwar/sites/9/2020/02/gears-of-war-2000x2000-5e4712f2a008b-1024x1024.jpg",1);
INSERT INTO videojuego (nombre_videojuego, descripcion_videojuego, url_portada, id_categoria) VALUES ("Halo reach", "Juego completo","https://media.vandal.net/m/79436/halo-reach-201912316245316_2.jpg
",1);
INSERT INTO videojuego (nombre_videojuego, descripcion_videojuego, url_portada, id_categoria) VALUES ("Assassin's creed syndicate", "Juego en beta completo","https://image.api.playstation.com/cdn/EP0001/CUSA02376_00/IK3koKU9jw2vs3b8CF41x9lEcvAIiVpa6z7oGxWvMPHrHnoEbMD53jsGmdiLMP65.png
",2);
INSERT INTO videojuego (nombre_videojuego, descripcion_videojuego, url_portada, id_categoria) VALUES ("Assassin's creed Rogue", "Juego completo de assassin's creed","https://cdn1.epicgames.com/offer/34f7e1e275924bb6a90074920f9c1696/ACRogueStandardPortrait_1200x1600-cf40340a038cf23a293629dce0e9a62c
",2);
INSERT INTO videojuego (nombre_videojuego, descripcion_videojuego, url_portada, id_categoria) VALUES ("Call of duty modern warfare 3", "Juego completo de call of duty","https://upload.wikimedia.org/wikipedia/en/b/bf/Call_of_Duty_Modern_Warfare_3_box_art.png
",1);
