package Resoluções;

public class Q4 {
    public static int soma(int[] num) {
        int soma = 0;
        for (int i = num.length - 1; i >= 0; i--) {
            soma += num[i];
        }
        return soma;
    }

    public static void main(String[] args) {
        int[] num = { 4, 2, 7 };
        System.out.println(soma(num));
    }
}
