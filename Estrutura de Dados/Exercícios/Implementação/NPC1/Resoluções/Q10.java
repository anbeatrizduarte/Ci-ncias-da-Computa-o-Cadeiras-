package Resoluções;

public class Q10 {
    public static int[] inverterK(int[] entrada, int k) {
        int[] fila = new int[entrada.length];
        int indice = 0;

        for (int i = k - 1; i >= 0; i--) {
            fila[indice++] = entrada[i];
        }

        for (int i = k; i < entrada.length; i++) {
            fila[indice++] = entrada[i];
        }

        return fila;
    }

    public static void main(String[] args) {
        int[] entrada = { 10, 20, 30, 40, 50 };
        int k = 3;
        int[] resultado = inverterK(entrada, k);

        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
        System.out.println();
    }
}
