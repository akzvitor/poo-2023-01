package main.java.com.github.akzvitor.poo.t19.presidente;

import java.util.List;

public class Ministro {
    private List<Assessor> assessores;

    public void nomearAssessor(Assessor a) {
        assessores.add(a);
    }
}
