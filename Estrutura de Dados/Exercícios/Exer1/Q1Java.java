package Exer1;
import java.util.*;

public class Q1Java {
    public static void main(String[] args) {

        int n = 3;
        int[] nums = {3, 0, 1};
        int soma = 0;
        int maximo = (n * (n + 1)) / 2;

        for (int i = 0; i < nums.length; i++) {
            soma += nums[i];    
        }

        int numFaltante = maximo - soma;
        System.out.println("O número faltando é: " + numFaltante);
    }
}
