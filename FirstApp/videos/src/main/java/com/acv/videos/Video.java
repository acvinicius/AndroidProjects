package com.acv.videos;

/**
 * Created by vinicius.castro on 10/17/2016.
 */

public class Video {
    private int codigo;
    private String titulo;
    private int duracao;

    public Video(int codigo, String titulo, int duracao) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Video{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", duracao=" + duracao +
                '}';
    }

    public Video() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}

