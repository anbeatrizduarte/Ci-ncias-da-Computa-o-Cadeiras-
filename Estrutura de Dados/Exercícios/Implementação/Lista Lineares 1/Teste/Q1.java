package Teste;

public class Q1 {
    public static boolean verificar(String s) {
        char[] pilha = new char[s.length()];
        int topo = -1;

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                topo++;
                pilha[i] = x;
            } else if (x == ')' || x == ']' || x == '}') {
                if (topo == -1) {
                    return false;
                }

                char topoPilha = pilha[topo--];

                if (x == '(' && topoPilha != ')' ||
                        x == '[' && topoPilha != ']' ||
                        x == '{' && topoPilha != '}') {
                    return false;
                }

            }

        }
        return topo == -1;
    }
}
