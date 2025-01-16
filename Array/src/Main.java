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

//    88. Merge Sorted Array
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int i = m-1;
        int j = n-1;
        int k = (m + n) - 1 ;

        while(j>=0){
            if(i>=0 && nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }
            else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

//        int x = scn.nextInt();
//        int[] nums;
//        nums = new int[x];
//
//        for (int i = 0; i < x; i++){
//            nums[i] = scn.nextInt();
//        }
//
//        int k = removeDuplicates(nums);
//        System.out.println("Length of non-duplicate Array: " + k);
//
//        System.out.print("Unique elements: ");
//        for (int i = 0; i < k; i++) {
//            System.out.print(nums[i] + " ");
//        }

//        88. Merge Sorted Array
//        user has to enter the data in non-decreasing order
        System.out.println("Enter the length of 1st array: ");
        int m = scn.nextInt();

        System.out.println("Enter the length of 2nd array: ");
        int n = scn.nextInt();

        int[] nums1;
        nums1 = new int[m+n];

        int[] nums2;
        nums2 = new int[n];

        System.out.println("Enter the elements of 1st array: ");
        for(int i = 0; i<m; i++){
            nums1[i] = scn.nextInt();
        }

        System.out.println("Enter the elements of 2nd array: ");
        for(int i = 0; i<n; i++){
            nums2[i] = scn.nextInt();
        }

        merge(nums1, m, nums2, n);
        for (int i = 0; i < m+n; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}