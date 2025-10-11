package Resoluções;

public class Q7 {
    public static int comprarIngresso(int[] tickets, int k) {
        int segundos = 0;

        while (tickets[k] > 0) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] > 0) {
                    tickets[i]--;
                    segundos++;

                    if (i == k && tickets[k] == 0) {
                        return segundos;
                    }
                }
            }
        }

        return segundos;

    }

    public static void main(String[] args) {
        int[] tickets1 = { 2, 3, 2 };
        int k1 = 2;
        System.out.println(comprarIngresso(tickets1, k1));

        int[] tickets2 = { 5, 1, 1, 1 };
        int k2 = 0;
        System.out.println(comprarIngresso(tickets2, k2));
    }
}
