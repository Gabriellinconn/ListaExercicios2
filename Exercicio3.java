import java.util.Scanner;

public class Exercicio3 {
    public static void executar() {

        Scanner num = new Scanner(System.in);

        Prompt.imprimir("Digite quantos números vão ser digitados: ");
        int qtd = num.nextInt();

        int[]numeros = new int[qtd];

        for(int i = 0; i<qtd ; i++){
            Prompt.imprimir("Digite o número "+(i+1)+": ");
            numeros[i] = num.nextInt();
        }num.close();

        for(int i = 0; i<qtd ; i++){
            System.out.println("2x: "+ numeros[i]*2 );
        }

       
        }

    }

