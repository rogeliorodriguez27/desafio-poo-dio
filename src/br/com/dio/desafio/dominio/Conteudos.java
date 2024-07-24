package br.com.dio.desafio.dominio;

public abstract class  Conteudos {

    protected static final double  XP_PADRAO = 20d;
    private String titulo;
    private String descricao;

    public Conteudos(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public abstract double CalcularXp();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
