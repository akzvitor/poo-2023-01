package main.java.com.github.akzvitor.poo.t17.lanchonete;

public class Item {
    private String tipo;
    private Detalhe detalhe;
    private Pedido pedido;

    public void addDetalhe(Detalhe d) {
        detalhe.add(d);
    }
}
