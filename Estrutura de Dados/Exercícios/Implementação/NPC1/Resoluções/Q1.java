package Resoluções;

public class Q1 {
    public static String inverter(String s) {
        char[] pilha = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            pilha[s.length() - 1 - i] = c;
        }

        return new String(pilha);
    }

    public static void main(String[] args) {
        String s = "papo";
        System.out.println(inverter(s));
    }
}