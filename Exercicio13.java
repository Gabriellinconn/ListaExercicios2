

public class Exercicio13 {
    public static void executar(){
        

        int n = Prompt.lerInteiro("Digite quantas vezes você quer repetir o Fibonacci: ");
        

        int atual = 1;
        int anterior = 1;
        int proximo;

        System.out.print("1 1 ");

        for(int i = 0; i< n-2;i++){

            proximo=anterior+atual;
            System.out.print(""+proximo+" " );
            anterior=atual;
            atual=proximo;

            
    
        }
        
        
    }
    
}
