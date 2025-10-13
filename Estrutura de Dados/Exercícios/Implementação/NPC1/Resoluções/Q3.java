package Resoluções;

public class Q3 {
    public static void imprimir(int[] num) {

        for (int i = num.length - 1; i >= 0; i--) {
            int topo = num[i];
            System.out.println("Elemento do topo: " + topo);
            System.out.println("Removendo o topo...");

            if (i - 1 >= 0) {
                System.out.println("Novo elemento do topo: " + num[i - 1]);
            }
        }
    }

    public static void main(String[] args) {
        int[] num = { 5, 8, 12 };
        imprimir(num);
    }
}
