package Resoluções;

public class Q4 {
    public static int voltarPastaPrincipal(String[] logs) {
        int profundidadePasta = 0;

        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals("./")) {
                continue;
            } else if (logs[i].equals("../")) {
                if (profundidadePasta > 0) {
                    profundidadePasta--;
                }
            } else {
                profundidadePasta++;
            }
        }

        return profundidadePasta;
    }

    public static void main(String[] args) {
        String[] logs1 = { "d1/", "d2/", "../", "d21/", "./" };
        System.out.println("Saída 1: " + voltarPastaPrincipal(logs1));

        String[] logs2 = { "d1/", "d2/", "./", "d3/", "../", "d31/" };
        System.out.println("Saída 2: " + voltarPastaPrincipal(logs2));

        String[] logs3 = { "d1/", "../", "../", "../" };
        System.out.println("Saída 3: " + voltarPastaPrincipal(logs3));
    }
}