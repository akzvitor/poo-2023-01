package main.java.com.github.akzvitor.poo.t17.aeroporto;

public class Tripulacao {
    private Piloto piloto;
    private Copiloto copiloto;
    private Aeromoca aeromoca;

    public void addPiloto(Piloto p) {
        piloto.add(p);
    }

    public void addCopiloto(Copiloto cp) {
        copiloto.add(cp);
    }

    public void addAeromoca(Aeromoca a) {
        aeromoca.add(a);
    }
}
