package main.java.com.github.akzvitor.poo.t22;

import java.util.Set;

public class Posto {
    private Set<Trabalhador> trabalhadores;
    private Set<Ocorrencia> ocorrencias;

    public void adicionarTrabalhador(Trabalhador t) {
        trabalhadores.add(t);
    }

    public void adicionarOcorrencia(Ocorrencia o) {
        ocorrencias.add(o);
    }
}