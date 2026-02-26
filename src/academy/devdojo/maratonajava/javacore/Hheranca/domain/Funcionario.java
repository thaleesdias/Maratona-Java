package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, double salario) {
        super(nome); 
        this.salario = salario;
    }

    @Override
    public void imprime() {
        super.imprime();


        System.out.println(salario);
        System.out.println("this.nome");
        System.out.println(this.nome);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
