package Resoluções;

public class Q5 {
    public static String reverso(String word, char ch) {
        char[] letras = word.toCharArray();

        int indiceCh = -1;
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == ch) {
                indiceCh = i;
                break;
            }
        }

        if (indiceCh == -1) {
            return word;
        }

        int inicio = 0;
        int fim = indiceCh;
        while (inicio < fim) {
            char temp = letras[inicio];
            letras[inicio] = letras[fim];
            letras[fim] = temp;
            inicio++;
            fim--;
        }

        return new String(letras);
    }

    public static void main(String[] args) {
        String word1 = "abcdefd";
        char ch1 = 'd';
        System.out.println(reverso(word1, ch1));

        String word2 = "xyxzxe";
        char ch2 = 'z';
        System.out.println(reverso(word2, ch2));

        String word3 = "abcd";
        char ch3 = 'z';
        System.out.println(reverso(word3, ch3));
    }
}
