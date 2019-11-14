//给定两个二进制字符串，返回他们的和（用二进制表示）。 
//
// 输入为非空字符串且只包含数字 1 和 0。 
//
// 示例 1: 
//
// 输入: a = "11", b = "1"
//输出: "100" 
//
// 示例 2: 
//
// 输入: a = "1010", b = "1011"
//输出: "10101" 
// Related Topics 数学 字符串

package leetcode.editor.cn.easy;
//Java：二进制求和
public class P67AddBinary{
    public static void main(String[] args) {
        Solution solution = new P67AddBinary().new Solution();
        // TO TEST
        System.out.println(solution.addBinary("11","1"));
        System.out.println(solution.addBinary("1010","1011"));
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int pointerA = a.length()-1;
        int pointerB = b.length()-1;
        int carry = 0;
        while(pointerA>=0 || pointerB>=0){
            int sum = carry;
            if(pointerA>=0){
                sum += (a.charAt(pointerA)-'0');
                pointerA--;
            }
            if(pointerB>=0){
                sum += (b.charAt(pointerB)-'0');
                pointerB--;
            }
            result.append(sum%2);
            carry = sum/2;
        }
        if(carry!=0){
            result.append('1');
        }
        return result.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}