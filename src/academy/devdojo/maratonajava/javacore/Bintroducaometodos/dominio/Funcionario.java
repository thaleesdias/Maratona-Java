package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    String nome;
    int idade;
    int[] salarios;


    public void imprimirDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
      for(int salario: this.salarios){
          System.out.println("salario " + salario);
      }

    }

    public void mediaSalario() {
        int total = 0;
        for (int valor : salarios) {
            total += valor;

        }
        int media = total / salarios.length;
        System.out.println(media);
    }


    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        func.nome = "tata";
        func.idade = 12;
        func.salarios = new int[]{2000, 2000, 2000};



        func.imprimirDados();
        func.mediaSalario();

    }
}
