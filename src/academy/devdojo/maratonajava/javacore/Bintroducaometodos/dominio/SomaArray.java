package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class SomaArray {
    public static void main(String[] args) {
        SomaArray dale = new SomaArray();

        int[] ar = {1, 2, 3, 4, 45};
        dale.somaArr(ar);
        dale.somaArrVargs(1,23,4,521,52);
    }
    public void somaArrVargs(int... z){
        int soma = 0;
        for(int numeros: z){
            soma += numeros;
        }
        System.out.println(soma);
    }

    public void somaArr(int[] num){
       int soma = 0;
        for(int numero: num){
            soma += numero;
        }
        System.out.println(soma);
    }
}
