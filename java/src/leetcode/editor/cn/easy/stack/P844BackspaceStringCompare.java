//给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。 
//
// 
//
// 示例 1： 
//
// 输入：S = "ab#c", T = "ad#c"
//输出：true
//解释：S 和 T 都会变成 “ac”。
// 
//
// 示例 2： 
//
// 输入：S = "ab##", T = "c#d#"
//输出：true
//解释：S 和 T 都会变成 “”。
// 
//
// 示例 3： 
//
// 输入：S = "a##c", T = "#a#c"
//输出：true
//解释：S 和 T 都会变成 “c”。
// 
//
// 示例 4： 
//
// 输入：S = "a#c", T = "b"
//输出：false
//解释：S 会变成 “c”，但 T 仍然是 “b”。 
//
// 
//
// 提示： 
//
// 
// 1 <= S.length <= 200 
// 1 <= T.length <= 200 
// S 和 T 只含有小写字母以及字符 '#'。 
// 
//
// 
// Related Topics 栈 双指针

package leetcode.editor.cn.easy.stack;

import java.util.Stack;

//Java：比较含退格的字符串
public class P844BackspaceStringCompare{
    public static void main(String[] args) {
        Solution solution = new P844BackspaceStringCompare().new Solution();
        // TO TEST
//        System.out.println(solution.backspaceCompare("ab#c","ad#c"));
//        System.out.println(solution.backspaceCompare("ab##","c#d#"));
//        System.out.println(solution.backspaceCompare("a##c","#a#c"));
        System.out.println(solution.backspaceCompare("a#c","b"));
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean backspaceCompare(String S, String T) {
        int lenS=S.length(),lenT=T.length();
        int max=lenS>lenT?lenS:lenT;
        Stack<Character> s1=new Stack<Character>();
        Stack<Character> t1=new Stack<Character>();
        for (int i = 0; i < max; i++) {
            if(i<lenS){
                if(S.charAt(i)=='#'){
                    if(s1.size()>0){
                        s1.pop();
                    }
                }else {
                    s1.push(S.charAt(i));
                }
            }
            if(i<lenT){
                if(T.charAt(i)=='#'){
                    if(t1.size()>0){
                        t1.pop();
                    }
                }else {
                    t1.push(T.charAt(i));
                }
            }
        }
        if(s1.size()==t1.size()){
            while (s1.size()>0){
                if(s1.pop()!=t1.pop()){
                    return false;
                }
            }
        }else{
            return false;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}