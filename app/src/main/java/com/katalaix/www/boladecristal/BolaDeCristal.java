package com.katalaix.www.boladecristal;

import java.util.Random;

/**
 * Created by Home on 09/03/2015.
 */
public class BolaDeCristal {
    public String obtenerRespuesta(){
        String[] respuestas = {
                "Respuesta 1",
                "Respuesta 2",
                "Respuesta 3",
                "Respuesta 4",
                "Respuesta 5",
                "Respuesta 6",
                "Respuesta 7"
        };

        Random generadorAleatorio = new Random();
        int numeroAleatorio = generadorAleatorio.nextInt(respuestas.length);

        return respuestas[numeroAleatorio];
    }
}
