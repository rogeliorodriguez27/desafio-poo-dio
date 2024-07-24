package br.com.dio.desafio.dominio;

import java.util.*;

public class Devs {
    private String nome;
    private Set<Conteudos> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudos> conteudosCompletados = new LinkedHashSet<>();

    public Devs(String nome) {
        this.nome = nome;
    }

    public void inscriverNoBootcamp(Bootcamp bootcamp){
        bootcamp.getDevsInscritos().add(this);
        getConteudosInscritos().addAll(bootcamp.getConteudo());
    };
    public void progredir(){
        Optional<Conteudos> conteudo = conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()){
            conteudosCompletados.add(conteudo.get());
            conteudosInscritos.remove(conteudo.get());
        }
    };
    public double calcularTotalXp(){
        return conteudosCompletados.stream().mapToDouble(Conteudos::CalcularXp).sum();
    };
    public void exibirCursos(){
        System.out.println(conteudosInscritos.toString());
    };

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
