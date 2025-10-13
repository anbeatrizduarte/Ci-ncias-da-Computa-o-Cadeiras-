package Resoluções;

public class Q5 {
    public static int removerDuplicado(int[] num) {
        int naoRepetido = 1;
        for (int i = 1; i < num.length; i++) {
            if (num[i] != num[i - 1]) {
                naoRepetido++;
            }
        }
        return naoRepetido;
    }

    public static void main(String[] args) {
        int[] num = { 4, 2, 7 };
        System.out.println(removerDuplicado(num));
    }
}
