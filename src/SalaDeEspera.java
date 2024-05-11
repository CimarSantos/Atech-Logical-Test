import java.util.Arrays;

public class SalaDeEspera {

    public static void main(String[] args) {

        int N = 3;
        int[] arrayE = { 1, 3, 5 };
        int[] arrayS = { 6, 8, 10 };

        contagemDePassageiros(N, arrayE, arrayS);
    }
    
     public static void contagemDePassageiros(int N, int[] E, int[] S) {
    
        System.out.println(N);
        System.out.println(Arrays.toString(E));
        System.out.println(Arrays.toString(S));
    }
}