package com.github.akzvitor.poo.t08;

import java.util.TreeSet;

public class Projeto {
    private TreeSet linguagensDeProgramacao = new TreeSet();

    public void novaLinguagem(LinguagemDeProgramacao p) {
        linguagensDeProgramacao.add(p);
    }

    public Projeto(LinguagemDeProgramacao p) {
        linguagensDeProgramacao.add(p);
    }
}