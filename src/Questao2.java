import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) throws Exception {
        int matriz[][] = new int[4][4];
        System.out.println("Valor da multiplicação = " + result(matriz));
    }

    public static int result(int matriz[][]) {
        Scanner in = new Scanner(System.in);
        int somaDP = 0, somaDS = 0, contPos, multi = 0;
        contPos = (matriz.length - 1);
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz.length; j++) {
                System.out.println("Informe a posição: i: " + i + ", j:" + j);
                matriz[i][j] = in.nextInt();
                if (i == j) {
                    somaDP = somaDP + matriz[i][j];
                }
            }
        }
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz.length; j++) {
                if (j == contPos && i == 1) {
                    somaDS = somaDS + matriz[i][j];
                    contPos--;
                }
                if (j == contPos && i != 1) {
                    somaDS = somaDS + matriz[i][j];
                    contPos--;
                }
            }
        }
        multi = somaDP * somaDS;
        return multi;
    }

}
