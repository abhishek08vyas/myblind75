import java.util.HashSet;
import java.util.Set;

class Solution217 {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> visited = new HashSet<>();
        for(int i =0; i< nums.length; i++){
            if(!visited.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}

public class DuplicateValue {
    public static void main(String[] args) {
        Solution217 solution = new Solution217();
        System.out.println(solution.containsDuplicate(new int[]{1,2,3,1}));
    }
}
