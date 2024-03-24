
import java.util.Scanner;

public class Exercicio7 {
    public static void executar() {

        Scanner num = new Scanner(System.in);
        boolean igual = false;
        
        int[]vetor1 = new int[5];
        int[]vetor2 = new int[5];

        Prompt.imprimir("Vetor 1");

        for(int i = 0; i<5; i++){
        System.out.print("Digite número "+(i+1)+": ");
        vetor1[i] = num.nextInt();
        }

        Prompt.imprimir("Vetor 2");

        for(int i = 0; i<5; i++){
            System.out.print("Digite número "+(i+1)+": ");
            vetor2[i] = num.nextInt();
            }
            num.close();

        for(int i = 0; i<5; i++){
            igual = true;
            if(vetor1[i]==vetor2[i]){
                igual = false;
            }
            if(igual==true){
                Prompt.imprimir("Os vetores não são iguais :/ ");
                return;
            }
        }
        Prompt.imprimir("Os vetores são iguais ;)");


        
    }
}
