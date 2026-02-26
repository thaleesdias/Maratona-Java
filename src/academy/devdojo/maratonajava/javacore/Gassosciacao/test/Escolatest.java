package academy.devdojo.maratonajava.javacore.Gassosciacao.test;

import academy.devdojo.maratonajava.javacore.Gassosciacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassosciacao.dominio.Professor;

public class Escolatest {

    public static void main(String[] args) {

        Professor professor1 = new Professor("marco");
        Professor professor2 = new Professor("madara");

        Professor[] professores = {professor1, professor2};

        Escola escola = new Escola("SJ", professores);





        escola.imprime();


    }

}
