package Exer1;

public class Q4Java {
    public static void main(String[] args) {
        int[] nums = {2,2, 1};

        for (int i = 0; i < nums.length; i++) {
            boolean numeroDuplicado = false;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    numeroDuplicado = true;
                    break;
                }
            }

            if (!numeroDuplicado) {
                System.out.print("O número não duplicado é: " + nums[i]);
            }
        }
    }
}
