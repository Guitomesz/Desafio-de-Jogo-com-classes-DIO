import java.util.Objects;

public class Heroi {
    public String nome;
    public int idade;
    public String tipo;

    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public void atacar() {
        String ataque;
        if (Objects.equals(this.tipo, "guerreiro")) {
            ataque = "espada";
            System.out.println("O " + this.tipo + " atacou usando " + ataque + "!");
        } else if (Objects.equals(this.tipo, "mago")) {
            ataque = "magia";
            System.out.println("O " + this.tipo + " atacou usando " + ataque + "!");
        } else if (Objects.equals(this.tipo, "monge")) {
            ataque = "artes marciais";
            System.out.println("O " + this.tipo + " atacou usando " + ataque + "!");
        } else if (Objects.equals(this.tipo, "ninja")) {
            ataque = "shuriken";
            System.out.println("O " + this.tipo + " atacou usando " + ataque + "!");
        }
    }
}