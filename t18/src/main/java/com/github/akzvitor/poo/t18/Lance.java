public class Lance {
    private List<Lance> lances = new ArrayList<>();

    public Partida(String nome) {

    }

    public addLance(Lance lance) {
        if (lance = null) {
            throw new IllegalArgumentException("exige lance");
        }

        lances.add(lance);
    }

    public Lance(Peca peca, Jogador jogador, Posicao origem, Posicao destino) {
        this.peca = peca;
        this.jogador = jogador;
        this.origem = origem;
        this.destino = destino;
    }

    @Override
    public String toString(){
        return "Lance{" +
                "peca=" + peca +
                "jogador=" + jogador +
                "origem=" + origem +
                "destino=" + destino +
                "}";
    }
}
