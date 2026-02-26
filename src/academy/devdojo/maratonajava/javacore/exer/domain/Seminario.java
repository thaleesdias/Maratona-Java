package academy.devdojo.maratonajava.javacore.exer.domain;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] alunos;



    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void imprime(){
        System.out.println(titulo);
        System.out.println(local.getEndereco());

        if (alunos == null) return;
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }


    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
