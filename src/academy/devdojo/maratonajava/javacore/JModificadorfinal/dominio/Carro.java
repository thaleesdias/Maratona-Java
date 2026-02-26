package academy.devdojo.maratonajava.javacore.JModificadorfinal.dominio;

public class Carro {

    private String nome;
    public final static double VELOCIDADE_LIMITE = 250;



    public void getNome() {
        System.out.println(nome);
    }
    public void getVelocidade(){
        System.out.println(Carro.VELOCIDADE_LIMITE);
    };



    public void setNome(String nome) {
        this.nome = nome;
    }
}
