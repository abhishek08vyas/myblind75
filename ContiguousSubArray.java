class Solution53 {
    public int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            currentSum = Math.max(currentSum, 0) + nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
public class ContiguousSubArray {

    public static void main(String[] args) {
        Solution53 solution = new Solution53();
        System.out.println(solution.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
