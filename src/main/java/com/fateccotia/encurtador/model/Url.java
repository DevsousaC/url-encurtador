package com.fateccotia.encurtador.model;

import jakarta.persistence.*;

@Entity
@Table(name = "task")
public class Url {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String urlOriginal;
    private String urlEncurtada;

    public Url() {

    }

    public Url(String urlOriginal, String urlEncurtada) {
        this.urlOriginal = urlOriginal;
        this.urlEncurtada = urlEncurtada;
    }

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public String getUrlOriginal() {return urlOriginal;}
    public void setUrlOriginal(String urlOriginal) {this.urlOriginal = urlOriginal;}

    public String getUrlEncurtada() {
        return urlEncurtada;
    }
    public void setUrlEncurtada(String urlEncurtada) {
        this.urlEncurtada = urlEncurtada;
    }
}