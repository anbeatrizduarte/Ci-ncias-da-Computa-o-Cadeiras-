package Exer1;

public class Q5Java {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3};

        int ultimoIndice = nums.length - 1;

        for (int i = ultimoIndice; i >= 0; i--) {
            if (nums[i] != 9) {
                nums[i]++;
                break;
            } else {
                nums[i] = 0;
            }
        }

        if (nums[0] == 0) {
            int[] novoVetor = new int[ultimoIndice + 2];
            novoVetor[0] = 1;
            nums = novoVetor;
        }

        System.out.println("Número de elementos: " + nums.length);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
