
import java.util.Scanner;

public class Exercicio14 {
    public static void executar(){

        Scanner num = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetor[i] = num.nextInt();
        }

        int indiceMaior = 0;
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > vetor[indiceMaior]) {
                indiceMaior = i;
            }
        }

        int ultimoIndice = vetor.length - 1;
        int maiorElemento = vetor[indiceMaior];
        vetor[indiceMaior] = vetor[ultimoIndice];
        vetor[ultimoIndice] = maiorElemento;

        System.out.println("Vetor atualizado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vetor[i]);
        }

        num.close();
    }
}


