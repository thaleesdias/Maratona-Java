package academy.devdojo.maratonajava.javacore.Gassosciacao.dominio;

public class Jogador {
    private String nome;
    private Time time;


    public Jogador(String jogador) {
        this.nome = jogador;
    }

    public void imprime() {
        System.out.println(this.nome);
        if(time != null){
            System.out.println(time.getNome());
        }
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
