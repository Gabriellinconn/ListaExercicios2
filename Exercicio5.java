import java.lang.reflect.Array;
import java.util.Scanner;

public class Exercicio5 {
    public static void executar() {

        Scanner num = new Scanner(System.in);

        int numDado = 7;
        int[]vetor = new int[5];

        for(int i=0;i<Array.getLength(vetor);i++){
            System.out.print("Digite número "+(i+1)+":");
            vetor[i] = num.nextInt();
        }
        num.close();

        Prompt.imprimir("O número é "+numDado);

        int qtd =0;

        for(int i=0;i<Array.getLength(vetor);i++){
            if(vetor[i]==numDado){
                qtd++;
            }

        }
 Prompt.imprimir("O valor "+numDado+" Apareceu "+qtd+" Vezes no seu vetor");
    }
}
