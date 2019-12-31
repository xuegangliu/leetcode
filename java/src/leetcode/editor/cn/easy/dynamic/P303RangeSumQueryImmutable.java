//给定一个整数数组 nums，求出数组从索引 i 到 j (i ≤ j) 范围内元素的总和，包含 i, j 两点。 
//
// 示例： 
//
// 给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()
//
//sumRange(0, 2) -> 1
//sumRange(2, 5) -> -1
//sumRange(0, 5) -> -3 
//
// 说明: 
//
// 
// 你可以假设数组不可变。 
// 会多次调用 sumRange 方法。 
// 
// Related Topics 动态规划[dynamic]

package leetcode.editor.cn.easy.dynamic;
//Java：区域和检索 - 数组不可变
public class P303RangeSumQueryImmutable{
    public static void main(String[] args) {
        int[] nums=new int[]{-2, 0, 3, -5, 2, -1};
        NumArray solution = new P303RangeSumQueryImmutable().new NumArray(nums);
        // TO TEST
        System.out.println(solution.sumRange(0,2));
        System.out.println(solution.sumRange(2,5));
        System.out.println(solution.sumRange(0,5));
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class NumArray {
    private int[] sum;

    public NumArray(int[] nums) {
        if (nums.length > 0) {
            sum = new int[nums.length];
            sum[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                sum[i] = sum[i - 1] + nums[i];
            }
        }
    }

    public int sumRange(int i, int j) {
        // 注意处理i=0的情况
        if (i == 0)
            return sum[j];
        else
            return sum[j] - sum[i - 1];
    }

//    private int cur=0;
//    private int[] nums;
//    private int count;
//
//    public NumArray(int[] nums) {
//        this.nums=nums;
//        this.count=nums.length;
//    }
//
//    public int sumRange(int i, int j) {
//        int sum=0;
//        if(i>j || i<0){
//            return 0;
//        }else{
//            cur=i;
//            while (cur<=j && j<count){
//                sum=sum+nums[cur];
//                cur++;
//            }
//        }
//        return sum;
//    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
//leetcode submit region end(Prohibit modification and deletion)

}