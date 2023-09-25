package D43_LeetCode.L5_HM_1_TwoSum;

import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i < nums.length; i++) {
            for (int j=i+1;j< nums.length; j++) {
                if ((nums[i] + nums[j])==target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
}

    public static void main(String[] args) {
        int[] nums={1,2};
        int target=3;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));


    }
}
