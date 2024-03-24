import java.util.Scanner;

public class Exercicio12 {
    public static void executar(){
        Scanner num = new Scanner(System.in);
        
        int[]vetor = new int[12];

        for(int i=0;i<12;i++){
            Prompt.imprimir("Digite número ["+(i+1)+"]: ");
            vetor[i] = num.nextInt();
        }
        int produto=1;

        for(int i=0;i<12;i++){
            if(vetor[i]<=0){
            
            }
            else if(vetor[i]%2==0){
                produto*=vetor[i];
            }
        }

        Prompt.imprimir("O produto dos números positivos e pares é: "+produto);
        num.close();
        
    }
}
