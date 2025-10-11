package Resoluções;

import java.util.*;

public class Q1 {

    public static boolean valido(String s) {
        char[] pilha = new char[s.length()];
        int topo = -1; // comeca vazio

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                pilha[++topo] = x;
            } else if (x == ')' || x == ']' || x == '}') {
                if (topo == -1) {
                    return false;
                }

                char topoPilha = pilha[topo--];

                if ((x == ')' && topoPilha != '(' ||
                        x == ']' && topoPilha != '[' ||
                        x == '}' && topoPilha != '}')) {
                    return false;
                }

            }
        }
        return topo == -1;
    }

    public static void main(String[] args) {
        String[] exemplos = { "()", "()[]", "(]", "([])", "([)]" };

        for (int i = 0; i < exemplos.length; i++) {
            System.out
                    .println("Entrada: " + exemplos[i] + " → Saída: " + (valido(exemplos[i]) ? "verdadeiro" : "falso"));
        }
    }

}
