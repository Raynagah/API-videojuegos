package com.example.API_videojuegos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//1 - Esta clase va a ser de tipo rest - texto - json
@RestController

//2 - Define una ruta para mi API
@RequestMapping("/api/videojuegos")

//Metodo publico
public class VideojuegoController {
    //3 - Responde mediante una solicitud GET (/api/videojuegos/hola)
    @GetMapping("/hola")
    public String saludar(){
        //4 - Retornar un simple saludo de la API VJ
        return "Bienvenidos a mi primera API de videojuegos";
    }
    //5 - Crear un metodo para agregar juegos
    @GetMapping("/top")
    public Videojuego obtenerVideojuegotop(){
        //Crear un nuevo videojuego y lo retorno como JSON
        return new Videojuego("The Legend of Zelda: Breath of The Wild","Nintendo Switch",10);
    }

    //6 - Clase interna simple para representar un videojuego
    static class Videojuego{
        //Atributos
        private String titulo;
        private String plataforma;
        private int puntuacion;

        //Constructor
        public Videojuego(String titulo,String plataforma,int puntuacion){
            this.titulo = titulo;
            this.plataforma = plataforma;
            this.puntuacion = puntuacion;
        }

        //Accesadores GETTERS (GET)
        public String getTitulo() {
            return titulo;
        }
        public String getPlataforma(){
            return plataforma;
        }
        public int getPuntuacion(){
            return puntuacion;
        }

    }

}
