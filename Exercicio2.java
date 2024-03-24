import java.util.Scanner;

public class Exercicio2 {
    public static void executar() {

        Scanner num = new Scanner(System.in);

        Double[] numeros = new Double[5];

        double soma = 0;

        for (int i = 0; i < 5; i++) {

            Prompt.imprimir("Digite o número " + (i + 1) + ": ");
            numeros[i] = num.nextDouble();
            soma += numeros[i];
        }

        num.close();

        double media = soma / 5;

        Prompt.imprimir("Média: "+media);

        for (int i = 0; i < 5; i++) {
            if (numeros[i] > media) {
                Prompt.imprimir("Número "+(i+1)+" a cima da média: " + numeros[i]);
            }

            if (numeros[i] < media) {
                Prompt.imprimir("Número "+(i+1)+" a baixo da média: " + numeros[i]);
            }
        }

    }

}