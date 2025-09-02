package Exer1;

public class Q2Java {
    public static void main(String[] args) {
        int alvo = 6;
        int[] nums = {3,2,4};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int soma = nums[i] + nums[j];
                if (soma == alvo) {
                    System.out.println("Os índices são " + i + " e " + j);
                    System.out.println("Os elementos são " + nums[i] + " e " + nums[j]);
                }
            }
        }
    }
}
