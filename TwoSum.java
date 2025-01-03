import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hashmap = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int diff = target - nums[i];

            if(hashmap.containsKey(diff)){
                return new int[]{hashmap.get(diff), i};
            }
            hashmap.put(nums[i], i);
        }
        return null;
    }
}

public class TwoSum{
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 2, 4}, 6)));
    }
}