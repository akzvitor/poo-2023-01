package main.java.com.github.akzvitor.poo.t17.aeroporto;

import java.util.List;

public class Aviao {
    private String modelo;
    private String ID;
    private List <Lugar> lugares;
    private List<Voo> voos;

    public void addLugar(Lugar l) {
        lugares.add(l);
    }

    public void addVoo(Voo v) {
        voos.add(v);
    }
}