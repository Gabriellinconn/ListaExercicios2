import java.util.Scanner;

public class Exercicio15 {
    public static void executar(){
        Scanner num = new Scanner(System.in);

        int[]vetor = new int[5];

        vetor[0] = Prompt.lerInteiro("Digite número (1): ");

        for(int i = 1 ; i<5;i++){
            do{
                vetor[i] = Prompt.lerInteiro("Digite número ("+(i+1)+"): ");
                if(vetor[i]<=vetor[i-1]){
                    Prompt.imprimir("Digite um número maior que o ultimo ");
                    Prompt.linhaEmBranco();
                }

            }while(vetor[i]<=vetor[(i-1)]);
        }

        Prompt.linhaEmBranco();

        for(int i = 0 ; i<5;i++){
            Prompt.imprimir(" "+vetor[i]+" ");

        }

        num.close();
    }
    
}
