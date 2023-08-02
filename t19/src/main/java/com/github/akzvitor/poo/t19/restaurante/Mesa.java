package main.java.com.github.akzvitor.poo.t19.restaurante;

import java.util.List;

public class Mesa {
    private String ID;
    private List<Pessoa> pessoas = new List<>();

    public void addPessoa(List<Pessoa> p) {
        pessoas.add(p);
    }
}
