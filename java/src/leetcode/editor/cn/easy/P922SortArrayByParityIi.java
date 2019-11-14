//给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。 
//
// 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。 
//
// 你可以返回任何满足上述条件的数组作为答案。 
//
// 
//
// 示例： 
//
// 输入：[4,2,5,7]
//输出：[4,5,2,7]
//解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
// 
//
// 
//
// 提示： 
//
// 
// 2 <= A.length <= 20000 
// A.length % 2 == 0 
// 0 <= A[i] <= 1000 
// 
//
// 
// Related Topics 排序 数组

package leetcode.editor.cn.easy;

import leetcode.editor.cn.common.CommonTools;

import java.util.Arrays;

//Java：按奇偶排序数组 II
public class P922SortArrayByParityIi{
    public static void main(String[] args) {
        Solution solution = new P922SortArrayByParityIi().new Solution();
        // TO TEST
        CommonTools.printArray(solution.sortArrayByParityII(new int[]{4,2,5,7}));
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortArrayByParityII(int[] A) {
        Arrays.sort(A);
        int len = A.length;
        int t = len/2;
        int[] m=new int[t];
        int[] n=new int[t];
        int[] result=new int[len];
        int a=0,b=0;
        for(int i=0;i<len;i++){
            if(A[i]%2!=0){
                m[a]=A[i];
                a++;
            }else{
                n[b]=A[i];
                b++;
            }
        }
        for(int i=0;i<len;i++) {
            if(i%2==0){
                result[i]=n[i/2];
            }else{
                result[i]=m[i/2];
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}