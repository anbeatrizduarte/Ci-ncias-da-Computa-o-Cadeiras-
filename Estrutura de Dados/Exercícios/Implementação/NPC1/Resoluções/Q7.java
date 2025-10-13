package Resoluções;

public class Q7 {
    public static void verProximo(String[] nomes) {

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Proximo a ser atendido? " + nomes[i]);
            System.out.println("Atendendo " + nomes[i] + "...");

            if (i < nomes.length - 1) {
                System.out.println("Agora, o próximo da fila é: " + nomes[i + 1]);
            } else {
                System.out.println("Fila vazia!");
            }
        }
    }

    public static void main(String[] args) {
        String[] nomes = { "Ana", "Carlos", "Beatriz" };
        verProximo(nomes);
    }
}
