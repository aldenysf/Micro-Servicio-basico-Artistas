package com.example.demo.model;

import javax.lang.model.element.NestingKind;

public class Artista {
    public String nombre;
    public int año;
    public String pais;
    public String genero;
    public String instagram;
    public String youtube;
    public String twitter;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public Artista(String nombre, int año, String pais, String genero, String instagram, String youtube, String twitter) {
        this.nombre = nombre;
        this.año = año;
        this.pais = pais;
        this.genero = genero;
        this.instagram = instagram;
        this.youtube = youtube;
        this.twitter = twitter;
    }

    public Artista() {
    }
}
