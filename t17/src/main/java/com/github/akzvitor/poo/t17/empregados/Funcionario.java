package main.java.com.github.akzvitor.poo.t17.empregados;

import java.util.List;

public class Funcionario {
    private String ID;
    private Funcionario gerente;
    private List<Funcionario> funcionarios;
    private boolean possuiGerente;

    public void addGerente(Funcionario g) {
        if (possuiGerente == true)
        {
            gerente.add(g);
        }
        else
        {
            return;
        }
    }

    public void addFuncionario(List<Funcionario> f) {
        if (possuiGerente == false)
        {
            funcionarios.add(f);
        }
        else
        {
            return;
        }
    }
}