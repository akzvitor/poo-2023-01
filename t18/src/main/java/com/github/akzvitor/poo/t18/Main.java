public class Main {
    public static void main(String[] args) {

        Partida partida = new Partida(nome "Imortal");
        Jogador a = new Jogador(nome "Fulano");
        Jogador b = new Jogador(nome "Ciclano");

        partida.addLance(new Lance(Peca.PEAo.a, new Posicao(x:1, y:1), newPosicao(x:1, y:2)))
        partida.addLance(new Lance(Peca.PEAO.b, new Posicao(x:1, y:1), newPosicao(x:1, y:2)))

        System.out.println(partida);
    }
}
