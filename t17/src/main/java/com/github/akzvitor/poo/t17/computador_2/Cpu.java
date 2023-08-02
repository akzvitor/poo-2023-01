package main.java.com.github.akzvitor.poo.t17.computador_2;

public class Cpu extends Dispositivo {
    private Memoria memoria;

    public void acessarMemoria(Memoria m) {
        memoria.add(m);
    }
}
