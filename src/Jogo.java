public class Jogo {
    public static void main(String[] args) {
        Heroi guerreiro = new Heroi("Guerreiro", 25, "guerreiro");
        Heroi mago = new Heroi("Mago", 30, "mago");
        Heroi monge = new Heroi("Monge", 35, "monge");
        Heroi ninja = new Heroi("Ninja", 40, "ninja");

        guerreiro.atacar();
        mago.atacar();
        monge.atacar();
        ninja.atacar();
    }
}