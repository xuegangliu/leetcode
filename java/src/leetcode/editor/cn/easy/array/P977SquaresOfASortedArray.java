//给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。 
//
// 
//
// 示例 1： 
//
// 输入：[-4,-1,0,3,10]
//输出：[0,1,9,16,100]
// 
//
// 示例 2： 
//
// 输入：[-7,-3,2,3,11]
//输出：[4,9,9,49,121]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= A.length <= 10000 
// -10000 <= A[i] <= 10000 
// A 已按非递减顺序排序。 
// 
// Related Topics 数组 双指针

package leetcode.editor.cn.easy.array;

import leetcode.editor.cn.common.CommonTools;

import java.util.Arrays;

//Java：有序数组的平方
public class P977SquaresOfASortedArray{
    public static void main(String[] args) {
        Solution solution = new P977SquaresOfASortedArray().new Solution();
        // TO TEST
        CommonTools.printArray(solution.sortedSquares(new int[]{-4,-1,0,3,10}));
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortedSquares(int[] A) {
        int len = A.length;
        int[] t=new int[len];
        int[] result=new int[len];
        for(int i=0;i<len;i++){
            t[i]=A[i]>0?A[i]:-A[i];
        }
        Arrays.sort( t );
        for(int i=0;i<len;i++){
            result[i]=t[i]*t[i];
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}