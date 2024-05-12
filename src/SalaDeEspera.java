
public class SalaDeEspera {

    public static void main(String[] args) {

        int N = 3;
        int[] arrayE = { 1, 5, 7 };
        int[] arrayS = { 9, 13, 12 };

        int passageirosSimultaneos = contagemDePassageiros(N, arrayE, arrayS);

        System.out.println(passageirosSimultaneos);
    }
    
    public static int contagemDePassageiros(int N, int[] E, int[] S) {
        
        int passageirosSimultaneos = 0;
        int passageirosPresentes = 0;
        int i = 0;
        int j=0;

        while (i < N && j < N) {

            if (E[i] < S[j]) {
                
                passageirosPresentes++;
                passageirosSimultaneos = Math.max(passageirosSimultaneos, passageirosPresentes);
                i++;

            } else {

                passageirosPresentes--;
                j++;

            }
        }

    
         return passageirosSimultaneos;

    }
}