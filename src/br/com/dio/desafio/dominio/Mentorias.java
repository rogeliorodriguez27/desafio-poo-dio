package br.com.dio.desafio.dominio;

import java.time.LocalDateTime;

public class Mentorias extends Conteudos {

    private LocalDateTime cdataMentoria;

    public Mentorias(LocalDateTime cdataMentoria) {
        this.cdataMentoria = cdataMentoria;
    }

    @Override
    public double CalcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDateTime getCdataMentoria() {
        return cdataMentoria;
    }

    public void setCdataMentoria(LocalDateTime cdataMentoria) {
        this.cdataMentoria = cdataMentoria;
    }


    @Override
    public String toString() {
        return "Cursos{" +
                "Titulo= "+ getTitulo() +"/" +
                "Descrição=" + getDescricao() +"/" +
                "Data=" + getCdataMentoria() +
                '}';
    }

}
