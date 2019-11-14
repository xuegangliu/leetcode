//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。 
//
// 示例: 
//
// 输入: [-2,1,-3,4,-1,2,1,-5,4],
//输出: 6
//解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
// 
//
// 进阶: 
//
// 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。 
// Related Topics 数组 分治算法 动态规划

package leetcode.editor.cn.easy;
//Java：最大子序和
public class P53MaximumSubarray{
    public static void main(String[] args) {
        Solution solution = new P53MaximumSubarray().new Solution();
        // TO TEST
        int[] nums=new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution.maxSubArray(nums));
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSubArray(int[] nums) {
        int len=nums.length;
        if(len==0){
            return 0;
        }
        int cur=nums[0];
        int sum=nums[0];
        for (int i = 1; i < len; i++) {
            if(cur<=0){
                cur=nums[i];
            }else{
                cur=cur+nums[i];
            }
            sum=Math.max(cur,sum);
        }
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    /**
     * 动态规划 O(n)
     * @param x
     * @return
     */
    public int reverse1(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    /**
     * 分治 O(nlogn)
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        return find(nums, 0, nums.length - 1);
    }

    private int find(int[] nums, int start, int end) {
        if(start == end) {
            return nums[start];
        }

        if(start > end) {
            return Integer.MIN_VALUE;
        }

        int mid = start + (end - start) / 2;
        int leftMax = find(nums, start, mid - 1);
        int rightMax = find(nums, mid + 1, end);

        int ml = 0;
        for(int i = mid - 1, sum = 0; i >= start; i --) {
            sum += nums[i];
            ml = Math.max(ml, sum);
        }

        int mr = 0;
        for(int i = mid + 1, sum = 0; i <= end; i ++) {
            sum += nums[i];
            mr = Math.max(mr, sum);
        }

        return Math.max(Math.max(leftMax, rightMax), ml + mr + nums[mid]);
    }
}