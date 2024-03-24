import java.lang.reflect.Array;

public class Exercicio11 {
    public static void executar(){

        int[]vetor1 = new int[5];
        int[]vetor2 = new int[5];

        
        for(int i=0, j=-1;i<Array.getLength(vetor1);i++,j++){
             j++;
            vetor1[i]=j;
        }
        for(int i=0, j=0;i<Array.getLength(vetor2);i++,j++){
            j++;
           vetor2[i]=j;
       }

        for(int i=0;i<5;i++){
            Prompt.imprimir(vetor1[i]);
        }

        Prompt.linhaEmBranco();

        for(int i=0;i<5;i++){
            Prompt.imprimir(vetor2[i]);
        }

        int soma=0;

        for(int i=0;i<5;i++){
            soma+=(vetor1[i]*vetor2[i]);
        }

        Prompt.linhaEmBranco();

        Prompt.imprimir("Produto de soma dos vetores: "+soma);
        
    }
}
