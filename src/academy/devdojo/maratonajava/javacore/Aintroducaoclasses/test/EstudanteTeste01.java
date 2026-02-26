package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();

        aluno.idade = 19;
        aluno.nome  = "vasco";
        aluno.sexo = 'm';
        System.out.println(aluno.idade);
        System.out.println(aluno.nome);
        System.out.println(aluno.sexo);
    }
}
