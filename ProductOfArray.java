import java.util.Arrays;

class Solution238 {
    public int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];
        int temp=1;
        for(int i =0; i < nums.length; i++){
            answer[i] = temp;
            temp = nums[i] * temp;
        }

        temp=1;
        for(int i =nums.length-1; i >= 0; i--){
            answer[i] = answer[i] * temp;
            temp = nums[i] * temp;
        }

        return answer;
    }
}

public class ProductOfArray {
    public static void main(String[] args) {
        Solution238 solution = new Solution238();
        System.out.println(Arrays.toString(solution.productExceptSelf(new int[]{-1,1,0,-3,3})));
    }
}
