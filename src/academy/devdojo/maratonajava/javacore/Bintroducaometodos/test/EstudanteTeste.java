package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();

        ImpressoraEstudante dale = new ImpressoraEstudante();

        estudante01.idade = 12;
        estudante01.nome = "carlo";
        estudante01.sexo = 'm';

        dale.imprime(estudante01);
        dale.imprime(estudante01);

    }






}
