import java.lang.reflect.Array;
import java.util.Scanner;

public class Exercicio4 {
    public static void executar() {

        Scanner num = new Scanner(System.in);

        int numDado = 10;
        int[]vetor = new int[5];

        for(int i=0;i<Array.getLength(vetor);i++){
            System.out.print("Digite número "+(i+1)+":");
            vetor[i] = num.nextInt();
        }
        num.close();

        Prompt.imprimir("O número é "+numDado);

        for(int i=0;i<Array.getLength(vetor);i++){
            if(vetor[i]>=numDado){
                Prompt.imprimir(vetor[i] );
            }

        }

    }
}
