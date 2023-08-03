package main.java.com.github.akzvitor.poo.t19.presidente;

import java.util.List;

public class Presidente {
    private List<Ministro> ministros;

    public void nomearMinistro(Ministro m) {
        ministros.add(m);
    }
}
