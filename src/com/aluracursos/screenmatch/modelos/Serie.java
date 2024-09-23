package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporada;
    private int episiodiosTemporada;
    private int minutosEpisodio;

    public Serie(String nombre, int fechaLanzamiento) {
        super(nombre, fechaLanzamiento);
    }


    @Override
    public int getDuracion(){
        return temporada * episiodiosTemporada * minutosEpisodio;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpisiodiosTemporada() {
        return episiodiosTemporada;
    }

    public void setEpisiodiosTemporada(int episiodiosTemporada) {
        this.episiodiosTemporada = episiodiosTemporada;
    }

    public int getMinutosEpisodio() {
        return minutosEpisodio;
    }

    public void setMinutosEpisodio(int minutosEpisodio) {
        this.minutosEpisodio = minutosEpisodio;
    }
}
