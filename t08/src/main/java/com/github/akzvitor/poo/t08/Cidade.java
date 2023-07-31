package com.github.akzvitor.poo.t08;

public class Cidade {
    public String pais;
    public String relacaoPais;

    public Cidade(Pais p) {
        p.novaCidade(this);
    }
}