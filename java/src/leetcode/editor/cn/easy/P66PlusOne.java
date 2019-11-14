//给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。 
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。 
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。 
//
// 示例 1: 
//
// 输入: [1,2,3]
//输出: [1,2,4]
//解释: 输入数组表示数字 123。
// 
//
// 示例 2: 
//
// 输入: [4,3,2,1]
//输出: [4,3,2,2]
//解释: 输入数组表示数字 4321。
// 
// Related Topics 数组

package leetcode.editor.cn.easy;

import leetcode.editor.cn.common.CommonTools;

//Java：加一
public class P66PlusOne{
    public static void main(String[] args) {
//        System.out.println(11%10);
//        System.out.println(11/10);
        Solution solution = new P66PlusOne().new Solution();
        // TO TEST
//        int[] digits=new int[]{1,2,3};
//        int[] digits=new int[]{4,3,2,1};
//        int[] digits=new int[]{4,3,2,9};
//        int[] digits=new int[]{0};
        int[] digits=new int[]{9};
//        int[] digits=new int[]{4,9,9,9};
        CommonTools.printArray(solution.plusOne(digits));
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        for (int i = len-1; i >= 0; i--) {
            int p=digits[i];
            int t=p+1;
            if((t/10)==1){
                digits[i]=t%10;
                if(i==0){
                    int[] nums=new int[len+1];
                    nums[0]=1;
                    for (int j = 0; j < len; j++) {
                        nums[j+1]=digits[j];
                    }
                    return nums;
                }
            }else{
                digits[i]=t;
                break;
            }
        }
        return digits;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}