package academy.devdojo.maratonajava.javacore.exer.test;

import academy.devdojo.maratonajava.javacore.exer.domain.Aluno;
import academy.devdojo.maratonajava.javacore.exer.domain.Local;
import academy.devdojo.maratonajava.javacore.exer.domain.Professor;
import academy.devdojo.maratonajava.javacore.exer.domain.Seminario;

public class TesteExer {

    public static void main(String[] args) {

        Aluno aluno = new Aluno(27, "thales");

        Seminario seminario = new Seminario("techTech");
        Seminario seminario2 = new Seminario("fight");
        Seminario[] seminarios = {seminario, seminario2};

        Professor professor = new Professor("maradona", "manodeDios");

        Local endereco = new Local();
        Local endereco2 = new Local();

        endereco.setEndereco("garopabas");
        endereco2.setEndereco("no rosa");

        seminario.setLocal(endereco);
        seminario2.setLocal(endereco2);

        Aluno[] alunos = {aluno, new Aluno(13, "caio")};
        aluno.setSeminario(seminario);

        professor.setSeminarios(seminarios);

        seminario.setAlunos(alunos);
        System.out.println("==aluno");
        aluno.imprime();
        System.out.println("==seminario");
        seminario.imprime();
        System.out.println("==endereco");
        endereco.imprime();
        System.out.println("==professor");
        professor.imprime();

    }
}
