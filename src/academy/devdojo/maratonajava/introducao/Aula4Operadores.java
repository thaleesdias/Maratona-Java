package academy.devdojo.maratonajava.introducao;

public class Aula4Operadores {
    public static void main(String[] args) {
        // + - * /
        int salario= 10;

        int salario2= 20;

        double soma = (double) salario / salario2;
        System.out.println(soma);

        // %
        int resto = 21 % 2  ;
        System.out.println((resto == 0)   ? "par":"impar");


        // < > <= >= == != sempre retorna boolean

        boolean isDezMaiorQueVinte = 10 > 20;

        System.out.println(isDezMaiorQueVinte);

        // logicos
        // && (and)
        // || (or)
        // ! (not)

        int age = 20;
        boolean cnh = true;

        if(age >= 128 && cnh == true){
            System.out.println("maior de idade e habilitado");
        } else {
            System.out.println("algo errado");
        }


        float precoPs5 = 2000;
        double valorContaCredito = 2200;
        double valorContapPoupanca = 200;

        boolean possoComprar = valorContaCredito >= precoPs5 || valorContapPoupanca >= precoPs5;
        System.out.println(possoComprar);
    }
}
