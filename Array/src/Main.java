import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int removeDuplicates(int[] nums){
        Arrays.sort(nums);
        int index = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] != nums[i-1]){
                nums[index] = nums[i];
                index++ ;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] nums;
        nums = new int[n];

        for (int i = 0; i < n; i++){
            nums[i] = scn.nextInt();
        }

        int k = removeDuplicates(nums);
        System.out.println("Length of non-duplicate Array: " + k);

        System.out.print("Unique elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}