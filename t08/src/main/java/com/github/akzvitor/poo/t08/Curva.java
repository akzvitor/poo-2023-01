package com.github.akzvitor.poo.t08;

import java.util.ArrayList;

public class Curva {
    private ArrayList<Pontos> pontos;
    private int qtdPontos;
    private boolean curva;{
        if (qtdPontos >= 2) {
            curva = true;
        }
        else {
            curva = false;
        }
    }
}