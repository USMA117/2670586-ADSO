<?php
    include "../DB/conexion.php";

    // Verificar si se han enviado todos los datos necesarios
    if(!empty($_POST["id_juego"]) && !empty($_POST["nombre_videojuego"]) && !empty($_POST["descripcion_videojuego"]) && !empty($_POST["url_portada"])) {
        $nombre_videojuego = $_POST["nombre_videojuego"];
        $descripcion_videojuego = $_POST["descripcion_videojuego"];
        $url_portada = $_POST["url_portada"];
        $id_juego = $_POST["id_juego"];

        // Imprimir los valores recibidos para verificar
        echo "id_juego: " . $id_juego . "\n";
        echo "nombre_videojuego: " . $nombre_videojuego . "\n";
        echo "descripcion_videojuego: " . $descripcion_videojuego . "\n";
        echo "url_portada: " . $url_portada . "\n";

        try {
            // Preparar la consulta SQL para actualizar el videojuego
            $query_actualizar_videojuego = $base_datos->prepare("UPDATE videojuego SET nombre_videojuego=:nombre, descripcion_videojuego=:descripcion, url_portada=:portada WHERE id_juego=:id");
            $query_actualizar_videojuego->bindParam(":nombre", $nombre_videojuego);
            $query_actualizar_videojuego->bindParam(":descripcion", $descripcion_videojuego);
            $query_actualizar_videojuego->bindParam(":portada", $url_portada);
            $query_actualizar_videojuego->bindParam(":id", $id_juego);

            // Ejecutar la consulta
            $ejecucion = $query_actualizar_videojuego->execute();

            // Verificar si la actualización fue exitosa
            if($ejecucion) {
                // Verificar el número de filas afectadas
                $filas_afectadas = $query_actualizar_videojuego->rowCount();
                if ($filas_afectadas > 0) {
                    $respuesta = [
                        "estado_operacion" => true,
                        "mensaje" => "Dato actualizado con éxito"
                    ];
                } else {
                    $respuesta = [
                        "estado_operacion" => false,
                        "mensaje" => "No se encontró ningún registro para actualizar o no hubo cambios en los datos"
                    ];
                }
            } else {
                $respuesta = [
                    "estado_operacion" => false,
                    "mensaje" => "El dato no se ha podido actualizar"
                ];
            }
        } catch (Exception $e) {
            $respuesta = [
                "estado_operacion" => false,
                "mensaje" => "Error: " . $e->getMessage()
            ];
        }

        // Devolver la respuesta en formato JSON
        echo json_encode($respuesta);
    } else {
        $respuesta = [
            "estado_operacion" => false,
            "razon" => "ERROR EN DATOS AL ACTUALIZAR"
        ];
        echo json_encode($respuesta);
    }
?>
