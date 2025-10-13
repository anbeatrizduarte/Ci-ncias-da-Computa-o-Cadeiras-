package Teste;

public class Q2 {
    public static int jogoBeisebol(String[] ops) {
        int[] registro = new int[ops.length];
        int indice = 0;

        for (int i = 0; i < ops.length; i++) {
            if (ops[i] == "C") {
                if (indice > 0) {
                    indice--;
                }
            } else if (ops[i] == "D") {
                if (indice > 0) {
                    registro[indice] = 2 * registro[indice - 1];
                    indice++;
                }
            } else if (ops[i] == "+") {
                if (indice > 0) {
                    registro[indice] = registro[indice - 1] + registro[indice - 2];
                    indice++;
                }
            }

            else {
                registro[indice] = Integer.parseInt(ops[i]);
                indice++;
            }
        }

        int somaTotal = 0;
        for (int i = 0; i < indice; i++) {
            somaTotal += registro[i];
        }
        return somaTotal;
    }
}
