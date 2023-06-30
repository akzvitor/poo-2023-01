package com.github.akzvitor.poo.t08;

import java.util.TreeSet;

public class Projeto {
    private TreeSet linguagensDeProgramacao = new TreeSet();
    private TreeSet pessoas = new TreeSet();

    public void novaLinguagem(LinguagemDeProgramacao ldp) {
        linguagensDeProgramacao.add(ldp);
    }

    public Projeto(LinguagemDeProgramacao ldp) {
        linguagensDeProgramacao.add(ldp);
    }

    public void novaPessoa(Pessoa p) {
        pessoas.add(p);
    }

    public Projeto(Pessoa p) {
        pessoas.add(p);
    }
}