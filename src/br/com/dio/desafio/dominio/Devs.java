package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Devs {
    private String nome;
    private Set<Conteudos> conteudosInscritos = new LinkedHashSet<>();

    public void inscriverNoBootcamp(){};
    public void progredir(){};
    public void calcularTotalXp(){};
    public void exibirCursos(){};

}
