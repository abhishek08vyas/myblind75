class Solution152 {
    public int maxSubArray(int[] nums) {

        int maxProduct = nums[0];
        int finalProduct = nums[0];
        int minProduct = nums[0];

        for (int i = 1; i < nums.length; ++i) {

            int arrayValue = nums[i];
            int tempMin = minProduct * arrayValue;
            int tempMax = maxProduct * arrayValue;
            maxProduct = Math.max(arrayValue, Math.max(tempMin, tempMax));
            minProduct = Math.min(arrayValue, Math.min( tempMin,tempMax));
            finalProduct = Math.max(finalProduct, maxProduct);
        }
        return finalProduct;
    }
}
public class MaxProductSubArray {

    public static void main(String[] args) {
        Solution152 solution = new Solution152();
        System.out.println(solution.maxSubArray(new int[]{-3,-1,-1}));
    }
}
