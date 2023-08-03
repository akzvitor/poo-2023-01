package main.java.com.github.akzvitor.poo.t18;

import java.util.Objects;

public class Jogador {
    
    private String nome;

    public Jogador(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Jogador deve possuir nome");
        }

        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                '}';
    }
}