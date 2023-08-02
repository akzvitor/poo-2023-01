package main.java.com.github.akzvitor.poo.t17.computador;

public class Computador {
    private Teclado teclado;
    private Mouse mouse;
    private PlacaMae placaMae;

    public void addTeclado(Teclado t) {
        teclado.add(t);
    }

    public void addMouse(Mouse m) {
        mouse.add(m);
    }

    public void addPlacaMae(PlacaMae pm) {
        placaMae.add(pm);
    }
}