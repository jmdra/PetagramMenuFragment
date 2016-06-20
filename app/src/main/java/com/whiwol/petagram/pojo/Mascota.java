package com.whiwol.petagram.pojo;

/**
 * Created by Jmdra on 16/06/2016.
 */
public class Mascota {

    private String nombre;
    private String likes;
    private int foto;

    public Mascota(String nombre, String likes, int foto) {
        this.nombre = nombre;
        this.likes = likes;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
