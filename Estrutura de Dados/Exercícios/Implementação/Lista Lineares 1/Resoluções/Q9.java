package Resoluções;

import java.util.Arrays;

public class Q9 {

    public static int[] jogarBaralho(int[] baralho) {
        int n = baralho.length;

        Arrays.sort(baralho);

        int[] resultado = new int[n];
        int tamanho = n;
        int topo = 0;
        int reveladas = 0;

        int[] deck = Arrays.copyOf(baralho, n);

        while (reveladas < n) {
            resultado[reveladas] = deck[topo];
            reveladas++;

            if (reveladas < n) {
                int primeira = deck[topo + 1];

                for (int i = topo + 1; i < tamanho - 1; i++) {
                    deck[i] = deck[i + 1];
                }

                deck[tamanho - 1] = primeira;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] baralho = { 17, 13, 11, 2, 3, 5, 7 };
        int[] ordemInicial = jogarBaralho(baralho);
        System.out.println(Arrays.toString(ordemInicial));
    }
}
