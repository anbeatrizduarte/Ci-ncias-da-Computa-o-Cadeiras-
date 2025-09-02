package Exer1;

public class Q3Java {
    public static void main(String[] agrs) {
        int[] nums = {1, 2, 3, 4};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println("true");
                    return;
                } 
            }
        }

        System.out.print("false");
    }
}
