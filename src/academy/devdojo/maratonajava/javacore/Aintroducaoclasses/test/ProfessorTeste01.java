package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "jojo";
        professor.idade = 44;
        professor.sexo = 'm';
        System.out.println(professor.nome +' '+ professor.idade);
    }

}
