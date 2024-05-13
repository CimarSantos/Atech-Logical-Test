import java.util.Arrays;
import java.util.Scanner;

public class SalaDeEspera {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int N;
        
        do {
            System.out.print("Qual é a quantidade de passageiros que passaram pela sala de espera? - ");
            N = entrada.nextInt();
        } while (N <= 0);

        int[] arrayE = new int[N];
        int[] arrayS = new int[N];

        for (int i = 0; i < N; i++) {
            
            System.out.printf("Qual é o momento de entrada do %sº passageiro? - ", i + 1);
            arrayE[i] = entrada.nextInt();

            System.out.print("E qual foi seu momento de saida? - ");
            arrayS[i] = entrada.nextInt();

            while (arrayE[i] >= arrayS[i]) {
                
                System.out.println("O momento de entrada do passairo, deve ser menor que o momento de saida do mesmo.");

                System.out.printf("Qual é o momento de entrada do %sº passageiro? - ", i + 1);
                arrayE[i] = entrada.nextInt();

                System.out.print("E qual foi seu momento de saida? - ");
                arrayS[i] = entrada.nextInt();

            }
        }

        int passageirosSimultaneos = ContagemDePassageiros.contagemDePassageiros(N, arrayE, arrayS);

        System.out.println("A quantidade de passageiros simultâneos na sala de espera foi de: " + passageirosSimultaneos);
    }
    
    
}