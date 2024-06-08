<?php
    include "../DB/conexion.php";

    if(!empty($_POST["nombre_videojuego"]) && !empty($_POST["descripcion_videojuego"]) && !empty($_POST["durl_portada"]) && !empty($_POST["id_categoria"])){
        $nombre_videojuego = $_POST["nombre_videojuego"];
        $descripcion_videojuego = $_POST["descripcion_videojuego"];
        $url_portada = $_POST["url_portada"];
        $id_categoria = $_POST["id_categoria"];

        try {
            $query_actualizar_videojuego = $base_datos->prepare("UPDATE videojuegos SET nombre_videojuego = :nombre,descripcion_videojuego = :descripcion,url_portada=:portada,id_categoria = :categoria ");
            $query_actualizar_videojuego->bindParam(":nombre",$nombre_videojuego);
            $query_actualizar_videojuego->bindParam(":descripcion",$descripcion_videojuego);
            $query_actualizar_videojuego->bindParam(":portada",$url_portada);
            $query_actualizar_videojuego->bindParam(":categoria",$id_categoria);

            $ejecucion = $query_actualizar_videojuego->execute();

            if($ejecucion && $query_actualizar_videojuego->rowCount() != 0){
                $respuesta = [
                    "Estado operacion" => TRUE,
                    "Mensaje"=>"Dato actualizado con exito"
                ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                    "Estado operacion" => FALSE,
                    "Mensaje"=>"El dato no se ha podido actualizar"
                ];
                echo json_encode($respuesta);
            }
        } catch (Exception $e) {
            echo "Error: " . $e->getMessage();
        }

    }else{
        $respuesta = [
            "Estado operacion"=> FALSE,
            'Razon' => "ERROR EN DATOS AL ACTUALIZAR"
        ];
        echo json_encode($respuesta);
    }
?>