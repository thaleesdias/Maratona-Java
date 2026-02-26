package academy.devdojo.maratonajava.javacore.Gassosciacao.test;

import academy.devdojo.maratonajava.javacore.Gassosciacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassosciacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("messi");
        Time barca = new Time("Barça");
        jogador1.setTime(barca);

        jogador1.imprime();

    }
}
