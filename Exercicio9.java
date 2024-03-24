import java.util.Scanner;

public class Exercicio9 {
    public static void executar(){
        Scanner num = new Scanner(System.in);
        
        int[]vetor1 = new int[5];
        int[]vetor2 = new int[5];
        int[]vetor3 = new int[5];

        Prompt.imprimir("Vetor 1");

        for(int i = 0; i<5; i++){
        System.out.print("Digite Algo para o vetor "+(i)+": ");
        vetor1[i] = num.nextInt();
        }

        Prompt.imprimir("Vetor 2");

        for(int i = 0; i<5; i++){
            System.out.print("Digite Algo para o vetor "+(i)+": ");
            vetor2[i] = num.nextInt();
        }
        vetor3[0]=vetor1[0];
        vetor3[1]=vetor2[1];
        vetor3[2]=vetor1[2];
        vetor3[3]=vetor2[3];
        vetor3[4]=vetor1[4];

        System.out.println("Vetor 3: ");
        for(int i = 0; i<5; i++){
            System.out.println(vetor3[i]);
        }

            num.close();
    }
}
