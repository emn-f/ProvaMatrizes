import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) throws Exception {
        int nota[] = new int[10];
        notas(nota);
    }

    public static void notas(int nota[]) {

        Scanner in = new Scanner(System.in);
        int sDo = 0, sRe = 0, sMi = 0;

        for (int i = 0; i < nota.length; i++) {
            System.out.println("Informe as notas: 1 – dó, 2 – ré e 3 – mi ");
            nota[i] = in.nextInt();

            while (nota[i] < 1 || nota[i] > 3) {
                System.out.println("Valor inválido! Informe as notas: 1 – dó, 2 – ré e 3 – mi ");
                nota[i] = in.nextInt();
            }

            if (nota[i] == 1) {
                sDo++;
            } else if (nota[i] == 2) {
                sRe++;
            } else if (nota[i] == 3) {
                sMi++;
            }

        }

        System.out.println("Dó: " + ((sDo * 100) / (nota.length)) + "%");
        System.out.println("Ré: " + ((sRe * 100) / (nota.length)) + "%");
        System.out.println("Mi: " + ((sMi * 100) / (nota.length)) + "%");

    }

}
