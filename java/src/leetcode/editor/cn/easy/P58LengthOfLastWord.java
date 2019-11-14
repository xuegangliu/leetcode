//给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。 
//
// 如果不存在最后一个单词，请返回 0 。 
//
// 说明：一个单词是指由字母组成，但不包含任何空格的字符串。 
//
// 示例: 
//
// 输入: "Hello World"
//输出: 5
// 
// Related Topics 字符串

package leetcode.editor.cn.easy;
//Java：最后一个单词的长度
public class P58LengthOfLastWord{
    public static void main(String[] args) {
        Solution solution = new P58LengthOfLastWord().new Solution();
//        System.out.println(" "==" ");
//        System.out.println(" ".charAt(0)==" ".charAt(0));

        // TO TEST
//        System.out.println(solution.lengthOfLastWord("Hello World"));
        System.out.println(solution.lengthOfLastWord("Hello111    "));
        System.out.println(solution.lengthOfLastWord("  Hello111    "));
        System.out.println(solution.lengthOfLastWord("  Hello111    A"));
        System.out.println(solution.lengthOfLastWord("  Hello111  AA  A"));
        System.out.println(solution.lengthOfLastWord("  Hello111  AA  AA "));
        System.out.println(solution.lengthOfLastWord("   "));
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLastWord(String s) {
        int len=s.length();
        int t=0,n=0;
        for (int i = 0; i < len; i++) {
            if(s.charAt(i)!=" ".charAt(0)){
                t++;
            }else{
//                System.out.println(t);
                if(t>0) {
                    n = t;
                }
                if(i!=len) {
                    t = 0;
                }
            }
        }
        return t==0?n:t;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}