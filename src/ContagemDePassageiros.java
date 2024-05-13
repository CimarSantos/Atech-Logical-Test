public class ContagemDePassageiros {

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
