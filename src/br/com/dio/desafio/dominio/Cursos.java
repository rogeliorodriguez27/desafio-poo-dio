package br.com.dio.desafio.dominio;

public class Cursos extends Conteudos{
    private int cargaHoraria;

    public Cursos(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double CalcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Cursos{" +
                "Titulo= "+ getTitulo() +"/" +
                "Descrição=" + getDescricao() +"/" +
                "Carga Horaria=" + cargaHoraria +
                '}';
    }
}
