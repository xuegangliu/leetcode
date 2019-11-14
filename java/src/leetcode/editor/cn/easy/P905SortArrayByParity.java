//给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。 
//
// 你可以返回满足此条件的任何数组作为答案。 
//
// 
//
// 示例： 
//
// 输入：[3,1,2,4]
//输出：[2,4,3,1]
//输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= A.length <= 5000 
// 0 <= A[i] <= 5000 
// 
// Related Topics 数组

package leetcode.editor.cn.easy;

import leetcode.editor.cn.common.CommonTools;

//Java：按奇偶排序数组
public class P905SortArrayByParity{
    public static void main(String[] args) {
        Solution solution = new P905SortArrayByParity().new Solution();
        // TO TEST
        int[] nums=new int[]{3,1,2,4};
        CommonTools.printArray(solution.sortArrayByParity(nums));
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortArrayByParity(int[] A) {
        //        Arrays.sort( A );
        int len = A.length;
        int[] a=new int[len],b=new int[len],result=new int[len];
        int m=0,n=0;
        for(int i=0;i<len;i++){
            if(A[i]%2==0){
                a[m]=A[i];
                result[m]=A[i];
                m++;
            }else{
                b[n]=A[i];
                n++;
            }
        }
        for(int i=0;i<n;i++){
            if(m!=0) {
                result[m] = b[i];
                m++;
            }else{
                result[i]=b[i];
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}