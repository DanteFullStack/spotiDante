package com.aluracursos.spotidante.modelos;

public class Audio {
    private String titulo;
    private int totalDeReproducciones;
    private int totalDemeGusta;
    private int clasificacion;

    public void MeGusta(){
        this.totalDemeGusta++;
    }

    public void reproduce (){
        this.totalDeReproducciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getTotalDemeGusta() {
        return totalDemeGusta;
    }

    public void setTotalDemeGusta(int totalDemeGusta) {
        this.totalDemeGusta = totalDemeGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
