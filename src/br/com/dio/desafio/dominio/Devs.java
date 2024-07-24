package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Devs {
    private String nome;
    private Set<Conteudos> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudos> conteudosCompletados = new LinkedHashSet<>();

    public Devs(String nome) {
        this.nome = nome;
    }

    public void inscriverNoBootcamp(){};
    public void progredir(){};
    public void calcularTotalXp(){};
    public void exibirCursos(){};

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudos> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudos> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudos> getConteudosCompletados() {
        return conteudosCompletados;
    }

    public void setConteudosCompletados(Set<Conteudos> conteudosCompletados) {
        this.conteudosCompletados = conteudosCompletados;
    }

    @Override
    public String toString() {
        return "Devs{" +
                "nome='" + nome + '\'' +
                ", conteudosInscritos=" + conteudosInscritos +
                ", conteudosCompletados=" + conteudosCompletados +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Devs devs = (Devs) o;
        return Objects.equals(nome, devs.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
