package Resoluções;

public class Q6 {
    public static int primeiroUnico(String s) {
        int[] contagem = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            contagem[c]++;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (contagem[c] == 1) {
                return i + 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aabb";

        System.out.println("Entrada: " + s1 + " → Saída: " + primeiroUnico(s1));
        System.out.println("Entrada: " + s2 + " → Saída: " + primeiroUnico(s2));
        System.out.println("Entrada: " + s3 + " → Saída: " + primeiroUnico(s3));
    }
}
