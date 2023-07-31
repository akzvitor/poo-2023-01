package com.github.akzvitor.poo.t08;

import java.util.TreeSet;

public class Grupo {
    private TreeSet usuarios = new TreeSet();
    private Permissao p;

    public void novoUsuario(Usuario u) {
        usuarios.add(u);
    }

    public Grupo(Usuario u) {
        usuarios.add(u);
    }
}