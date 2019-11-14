//给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。 
//
// 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。 
//
// 注意你不能在买入股票前卖出股票。 
//
// 示例 1: 
//
// 输入: [7,1,5,3,6,4]
//输出: 5
//解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
//     注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
// 
//
// 示例 2: 
//
// 输入: [7,6,4,3,1]
//输出: 0
//解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
// 
// Related Topics 数组 动态规划

package leetcode.editor.cn;
//Java：买卖股票的最佳时机
public class P121BestTimeToBuyAndSellStock{
    public static void main(String[] args) {
        Solution solution = new P121BestTimeToBuyAndSellStock().new Solution();
        // TO TEST
//        int[] nums=new int[]{7,1,5,3,6,4};
        int[] nums=new int[]{7,6,4,3,1};
        System.out.println(solution.maxProfit(nums));
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 1) {
            return 0;
        }
        int min = prices[0];
        int profit = 0;
        // 第i天的价格可以看作是买入价也可以看作是卖出价
        for (int i = 1; i < prices.length; i++) {
            // 找到更低的买入价
            if (min > prices[i]) {
                // 更新买入价
                min = prices[i];
            }
            // 当天的价格不低于买入价
            else {
                // 如果当天买出的价格比之前卖出的价格高
                if (profit < prices[i] - min) {
                    // 更新卖出价
                    profit = prices[i] - min;
                }
            }
        }
        return profit;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
public int maxProfit1(int[] prices) {
    int max = 0;
    int len = prices.length;
    // O(N^2)
    for (int i = 0; i < len - 1; i++) {
        for (int j = i + 1; j < len; j++) {
            int k = prices[j] - prices[i];
            if (k > 0 && max < k) {
                max = k;
            }
        }
    }
    return max;
}
}