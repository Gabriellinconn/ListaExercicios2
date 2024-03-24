import java.util.Scanner;

public class Exercicio10 {
    public static void executar(){
 Scanner num = new Scanner(System.in);
        
        int[]vetor1 = new int[5];
        int[]vetor2 = new int[5];

        Prompt.imprimir("Vetor 1");

        for(int i = 0; i<5; i++){
        System.out.print("Digite Algo para o vetor "+(i+1)+": ");
        vetor1[i] = num.nextInt();
        }
    
        for(int i=0;i<4;i++){
            vetor2[i]=vetor1[4-i];
        }
        for(int i=0;i<4;i++){
        Prompt.imprimir(vetor2[i]);
        }

            num.close();
    }
}
