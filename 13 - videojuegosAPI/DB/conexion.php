<?php
    header("Content-Type: application/json");
    header("Access-Control-Allow-Origin: * ");
    header("Access-Control-Allow-Methods: GET, POST");
    header("Access-Control-Allow-Headers: Content-Type");


    $host = "localhost";
    $user = "root";
    $password = "";
    $database = "videojuegos_api";

    try {
        $base_datos = new PDO("mysql:host=$host; dbname=$database",$user,$password);
        
    } catch (Exception $e) {
        echo "ERROR!!!!!".$e;
    }
?>