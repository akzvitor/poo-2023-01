package main.java.com.github.akzvitor.poo.t17.avaliacao;

import java.util.List;

public class Avaliacao {
    private List<Questao> questoes;
    private Prova prova;
    
    public void addQuestao(List<Questao> q) {
        questoes.add(q);
    }
}
