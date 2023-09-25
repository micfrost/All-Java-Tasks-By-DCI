package D43_LeetCode.Top150_L1_AS_88_MergeSortedArray;


public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int indexInput1 = m - 1;
        int indexInput2 = n - 1;
        int indexMerged=m + n - 1;

//        For Loop from End to 0 of Input1
        for (; indexInput1 >= 0 && indexInput2 >= 0; indexMerged--) {
            if (nums1[indexInput1] >= nums2[indexInput2]) {
                nums1[indexMerged] = nums1[indexInput1];
                indexInput1--;
            } else {
                nums1[indexMerged] = nums2[indexInput2];
                indexInput2--;
            }
        }
//         Input1 is empty
//         and in Input2 has only smaller numbers than in input1
//         then loop from the end of Input2 to 0
//         and  put input2 to merged Array.
            for(; indexInput2 >=0; indexInput2-- ){
                nums1[indexMerged] = nums2[indexInput2];
                indexMerged--;
            }

    }

    public static void main(String[] args) {

        int[] nums1 = {7, 7,7, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        Solution main1 = new Solution();
        main1.merge(nums1, m, nums2 , n);

        // Print the merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}


