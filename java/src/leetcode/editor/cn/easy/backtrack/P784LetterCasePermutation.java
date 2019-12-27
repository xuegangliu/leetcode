//给定一个字符串S，通过将字符串S中的每个字母转变大小写，我们可以获得一个新的字符串。返回所有可能得到的字符串集合。 
//
// 
//示例:
//输入: S = "a1b2"
//输出: ["a1b2", "a1B2", "A1b2", "A1B2"]
//
//输入: S = "3z4"
//输出: ["3z4", "3Z4"]
//
//输入: S = "12345"
//输出: ["12345"]
// 
//
// 注意： 
//
// 
// S 的长度不超过12。 
// S 仅由数字和字母组成。 
// 
// Related Topics 位运算[bit] 回溯算法[backtrack]

package leetcode.editor.cn.easy.backtrack;

import leetcode.editor.cn.common.CommonTools;

import java.util.ArrayList;
import java.util.List;

//Java：字母大小写全排列
public class P784LetterCasePermutation{
    public static void main(String[] args) {
        Solution solution = new P784LetterCasePermutation().new Solution();
//        System.out.println((int)'z');
//        System.out.println((int)'a');
//        System.out.println((int)'A' == 65);
//        System.out.println('A'==65);
//        System.out.println(String.valueOf('a').toUpperCase());
        // TO TEST
        CommonTools.printListObject(solution.letterCasePermutation("a1b2"));
        CommonTools.printListObject(solution.letterCasePermutation("3z4"));
        CommonTools.printListObject(solution.letterCasePermutation("12345"));
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public List<String> letterCasePermutation(String S) {
        List<String> res = new ArrayList<>();
        caseDfs(S, 0, new StringBuilder(), res);
        return res;
    }

    private void caseDfs(String s, int cur, StringBuilder sb, List<String> res){
        if(cur == s.length()){
            res.add(sb.toString());
            return;
        }

        char c = s.charAt(cur);
        if(Character.isDigit(c)){
            sb.append(c);
            caseDfs(s, cur+1, sb, res);
            sb.deleteCharAt(sb.length()-1);
        }else{
            sb.append(Character.toLowerCase(c));
            caseDfs(s, cur+1, sb, res);
            sb.deleteCharAt(sb.length()-1);

            sb.append(Character.toUpperCase(c));
            caseDfs(s, cur+1, sb, res);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}