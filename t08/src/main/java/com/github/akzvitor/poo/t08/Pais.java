package com.github.akzvitor.poo.t08;

import java.util.TreeSet;

public class Pais {
    private TreeSet cidades = new TreeSet();
    private Cidade[] capital;
    
    public void novaCidade(Cidade c) {
        cidades.add(c);
    }

    public Pais(Cidade c) {
        cidades.add(c);
    }

    public void definirCapital(Cidade[] cap) {
        capital = cap;
    }
}