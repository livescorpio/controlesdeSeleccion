package com.example.controlesdeseleccion;

public class Noticia {
    private String titulo;
    private String subtitulo;
    public Noticia(String tit, String
            sub){
        titulo = tit;
        subtitulo = sub;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getSubtitulo(){
        return subtitulo;
    }

}
