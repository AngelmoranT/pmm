package com.example.angval.spinnerpersona;

/*public class Titular {

    private String titulo;
    private String subtitulo;
    private int imagen;

    public Titular(String titulo, String subtitulo, int imagen){
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.imagen = imagen;
    }

    public int getImagen() { return imagen; }
    public String getTitulo() { return titulo; }
    public String getSubtitulo() { return  subtitulo; }



    public void setImagen(int imagen) { this.imagen = imagen; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setSubtitulo(String subtitulo) {this.subtitulo = subtitulo;}
    public String toString(){
        return (titulo + "," + subtitulo);
    }
}*/

public class Titular {
    private String titulo;
    private String subtitulo;
    private int imagen;
    public Titular(String tit, String sub, int imagen) {
        titulo = tit;
        subtitulo = sub;
        this.imagen = imagen;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getSubtitulo(){
        return subtitulo;
    }
    public int getImagen(){
        return imagen;
    }
}
