package academy.devdojo.maratonajava.javacore.Gassosciacao.test;

import academy.devdojo.maratonajava.javacore.Gassosciacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassosciacao.dominio.Time;

public class JogadorTeste3 {

    public static void main(String[] args) {

        Time time = new Time("barça");
        Jogador jogador = new Jogador("messi");
        Jogador jogador2 = new Jogador("neymá");
        Jogador[     ] jogadores = {jogador, jogador2};

        time.setJogadores(jogadores);

        jogador.setTime(time);


        System.out.println("---- time ---");
        time.imprime();
        System.out.println("---jogador--");
        jogador.imprime();

    }
}
