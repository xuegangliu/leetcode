//给定两个没有重复元素的数组 nums1 和 nums2 ，其中nums1 是 nums2 的子集。找到 nums1 中每个元素在 nums2 中的下一个比其大的值。 
//
// nums1 中数字 x 的下一个更大元素是指 x 在 nums2 中对应位置的右边的第一个比 x 大的元素。如果不存在，对应位置输出-1。 
//
// 示例 1: 
//
// 
//输入: nums1 = [4,1,2], nums2 = [1,3,4,2].
//输出: [-1,3,-1]
//解释:
//    对于num1中的数字4，你无法在第二个数组中找到下一个更大的数字，因此输出 -1。
//    对于num1中的数字1，第二个数组中数字1右边的下一个较大数字是 3。
//    对于num1中的数字2，第二个数组中没有下一个更大的数字，因此输出 -1。 
//
// 示例 2: 
//
// 
//输入: nums1 = [2,4], nums2 = [1,2,3,4].
//输出: [3,-1]
//解释:
//    对于num1中的数字2，第二个数组中的下一个较大数字是3。
//    对于num1中的数字4，第二个数组中没有下一个更大的数字，因此输出 -1。
// 
//
// 注意: 
//
// 
// nums1和nums2中所有元素是唯一的。 
// nums1和nums2 的数组大小都不超过1000。 
// 
// Related Topics 栈

package leetcode.editor.cn.easy.stack;

import leetcode.editor.cn.common.CommonTools;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//Java：下一个更大元素 I
public class P496NextGreaterElementI{
    public static void main(String[] args) {
        Solution solution = new P496NextGreaterElementI().new Solution();
        // TO TEST
//        int[] nums1=new int[]{4,1,2};
//        int[] nums2=new int[]{1,3,4,2};
//        int[] nums1=new int[]{2,4};
//        int[] nums2=new int[]{1,2,3,4};
//        解答失败: 测试用例:[1,3,5,2,4] [6,5,4,3,2,1,7] 测试结果:[7,-1,-1,-1,-1] 期望结果:[7,7,7,7,7]
        int[] nums1=new int[]{1,3,5,2,4};
        int[] nums2=new int[]{6,5,4,3,2,1,7};
        CommonTools.printArray(solution.nextGreaterElement(nums1,nums2));
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack=new Stack<Integer>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i : nums2) {
            while(!stack.isEmpty() && stack.peek()<i){
                map.put(stack.pop(),i);
            }
            stack.push(i);
        }
        int[] result=new int[1000];
        int count=0;
        for (int i : nums1) {
            if(map.containsKey(i)){
                result[count]=map.get(i);
                count++;
            }else{
                result[count]=-1;
                count++;
            }
        }
        return Arrays.copyOf(result,count);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}