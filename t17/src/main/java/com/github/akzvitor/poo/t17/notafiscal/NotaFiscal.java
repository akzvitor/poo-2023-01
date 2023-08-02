package main.java.com.github.akzvitor.poo.t17.notafiscal;

import java.util.List;

public class NotaFiscal {
    private List<Item> itens;

    public void gerarNotafiscal(List<Item> i) {
        itens.add(i);
    }
}
