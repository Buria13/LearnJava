package shildt;

public class Bubble {

    public static void main(String[] args) {
        double shit[] = { 99, -10.3, 100123, 18, -9.78,
                5623, 463, -9, 287, 49, 0.01, 42.42};

        bubbleSort(shit);

    }

    static void bubbleSort(double nums[]) {

        int i, j;
        double t;
        int size = nums.length;

        for (i = 1; i < size; i++) {
            for(j = size-1; j >= i; j--) {
                if(nums[j-1] > nums[j]) {
                    t = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = t;
                }
            }
        }

        for(double k : nums) {
            System.out.print(k + "  ");
        }
    }

}
