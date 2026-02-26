package academy.devdojo.maratonajava.introducao;

public class Aula07ArrayMulti {
    public static void main(String[] args) {
        int[][] numeros = new int[2][3];

        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;

        numeros[1][0] = 4;
        numeros[1][1] = 5;
        numeros[1][2] = 6;

        for (int i = 0;i<numeros.length;i++){
            for (int j = 0; j < numeros[i].length ; j++) {
                System.out.println(numeros[i][j]);

            }
        }

    }
}
