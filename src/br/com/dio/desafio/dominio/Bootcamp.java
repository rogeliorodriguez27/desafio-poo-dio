package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataFin = dataInicio.plusDays(45);
    private Set<Devs> devsInscritos = new HashSet<>();
    private Set<Conteudos> conteudo = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFin() {
        return dataFin;
    }

    public Set<Devs> getDevsInscritos() {
        return devsInscritos;
    }

    public void inscrivirDevs(Devs dev) {
        this.devsInscritos.add(dev);

    }

    public int getNumeroDevsInscritos() {
        return this.devsInscritos.size();
    }

    public Set<Conteudos> getConteudo() {
        return conteudo;
    }

    public void setConteudo(Set<Conteudos> conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicio, bootcamp.dataInicio) && Objects.equals(dataFin, bootcamp.dataFin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicio, dataFin);
    }

    @Override
    public String toString() {
        return "Cursos{" +
                "Nome= "+ getNome() +"/" +
                "Data inicio=" + getDataInicio() +"/" +
                "Data fin =" + getDataFin() +
                "Conteudos =" + getConteudo() +

                '}';
    }
}
