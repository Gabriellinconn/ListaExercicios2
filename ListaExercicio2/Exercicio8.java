
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        
        String[]vetor1 = new String[5];
        String[]vetor2 = new String[5];
        String[]vetor3 = new String[5];

        Prompt.imprimir("Vetor 1");

        for(int i = 0; i<5; i++){
        System.out.print("Digite Algo para o vetor "+(i+1)+": ");
        vetor1[i] = num.nextLine();
        }

        Prompt.imprimir("Vetor 2");

        for(int i = 0; i<5; i++){
            System.out.print("Digite Algo para o vetor "+(i+1)+": ");
            vetor2[i] = num.nextLine();
        }
        
        for(int i = 0; i<5; i++){
            vetor3[i] = (vetor1[i]+vetor2[i]);
        }
        

            num.close();

            Prompt.imprimir("Vetor 3 : Concatenação");


        for(int i = 0; i<5; i++){
            System.out.println("A e B: "+vetor3[i]);
        }
            


        
    }
}
