package Resoluções;

public class Q3 {
    public static int[] descontar(int[] precos) {
        int[] resposta = new int[precos.length];
        int indice = 0;

        for (int i = 0; i < precos.length; i++) {
            int desconto = 0;
            for (int j = i + 1; j < precos.length; j++) {
                if (precos[j] <= precos[i]) {
                    desconto = precos[j];
                    break;
                }
            }

            resposta[i] = precos[i] - desconto;
        }

        for (int i = 0; i < resposta.length; i++) {
            System.out.print(resposta[i] + ", ");
        }

        return resposta;

    }

    public static void main(String[] args) {
        int[] precos = { 8, 4, 6, 2, 3 };

        System.out.println("Respostas:");
        int[] resultado = descontar(precos);
    }
}
