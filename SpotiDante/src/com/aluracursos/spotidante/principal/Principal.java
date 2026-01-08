package com.aluracursos.spotidante.principal;

import com.aluracursos.spotidante.modelos.Canciones;
import com.aluracursos.spotidante.modelos.MisFavoritos;
import com.aluracursos.spotidante.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Canciones micancion = new Canciones();
        micancion.setTitulo("Forever");
        micancion.setCantante("kiss");

         Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriel Aguilar");
        micancion.setTitulo("Cafe, Tech");

        for (int i = 0; i < 100; i++) {
            micancion.MeGusta();
        }
        for (int i = 0; i < 2000; i++) {
            micancion.reproduce();

        }

        //Podcast

        for (int i = 0; i < 100; i++) {
            miPodcast.MeGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();

        }
        System.out.println("Total de reproducciobnes: "+micancion.getTotalDeReproducciones());
        System.out.println("Total de me gusta: "+micancion.getTotalDemeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(micancion);
        favoritos.adicione(miPodcast);

    }
}
