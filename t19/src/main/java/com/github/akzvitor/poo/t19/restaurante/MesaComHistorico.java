package main.java.com.github.akzvitor.poo.t19.restaurante;

import java.util.List;

public class MesaComHistorico {
    private String ID;
    private List<PessoaComHistorico> pessoas;

    public void addPessoa(List<PessoaComHistorico> p) {
        pessoas.add(p);
    }
}
