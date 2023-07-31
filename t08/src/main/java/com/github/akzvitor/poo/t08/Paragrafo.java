package com.github.akzvitor.poo.t08;

import java.util.TreeSet();

public class Paragrafo {
    private TreeSet sentencas = new TreeSet();

    public void novaSentenca(Sentenca s) {
        sentencas.add(s);
    }

    public Paragrafo(Sentenca s) {
        sentencas.add(s);
    }
}