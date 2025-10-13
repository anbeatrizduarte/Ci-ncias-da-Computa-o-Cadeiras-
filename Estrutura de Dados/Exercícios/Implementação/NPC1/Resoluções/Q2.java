package Resoluções;

public class Q2 {
    public static void funcionamentoPilha(int[] num) {
        int[] pilha = new int[num.length];

        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println("Removeu " + num[i]);
            if (i == 0)
                System.out.println("A pilha está vazia? true");
            else
                System.out.println("A pilha está vazia? false");

        }
    }

    public static void main(String[] args) {
        int[] num = { 10, 20, 30 };
        funcionamentoPilha(num);
    }
}
