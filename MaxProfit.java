class Solution121 {
    public int maxProfit(int[] prices) {

        int min = prices[0];
        int profit = 0;

        for (int price : prices) {
            if (price < min) {
                min = price;
            }
            profit = Math.max(profit, price - min);
        }
        return profit;
    }

}

public class MaxProfit{
    public static void main(String[] args) {
        Solution121 solution = new Solution121();
        System.out.println(solution.maxProfit(new int[]{7,6,4,3,1}));
    }
}
