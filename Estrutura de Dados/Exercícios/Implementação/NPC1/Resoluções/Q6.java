package Resoluções;

public class Q6 {
    public static void atendimentoFila(String[] nomes) {

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Atendendo: " + nomes[i]);

            if (i == nomes.length - 1) {
                System.out.println("Fila vazia.");
            }
        }
    }

    public static void main(String[] args) {
        String[] nomes = { "Ana", "Carlos", "Beatriz" };
        atendimentoFila(nomes);
    }
}
