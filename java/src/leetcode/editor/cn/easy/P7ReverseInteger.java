//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。 
//
// 示例 1: 
//
// 输入: 123
//输出: 321
// 
//
// 示例 2: 
//
// 输入: -123
//输出: -321
// 
//
// 示例 3: 
//
// 输入: 120
//输出: 21
// 
//
// 注意: 
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31, 2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
// Related Topics 数学

package leetcode.editor.cn.easy;
//Java：整数反转
public class P7ReverseInteger{
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE/10*10+8);
        System.out.println(Integer.MIN_VALUE/10*10-9);
//        Solution solution = new P7ReverseInteger().new Solution();
//        System.out.println(solution.reverse(123));
//        System.out.println(solution.reverse(-123));
//        System.out.println(solution.reverse(Integer.MAX_VALUE));
//        System.out.println(solution.reverse(Integer.MIN_VALUE));
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverse(int x) {
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
}
//leetcode submit region end(Prohibit modification and deletion)

}