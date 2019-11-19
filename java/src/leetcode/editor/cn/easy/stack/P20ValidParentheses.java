//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 注意空字符串可被认为是有效字符串。 
//
// 示例 1: 
//
// 输入: "()"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "()[]{}"
//输出: true
// 
//
// 示例 3: 
//
// 输入: "(]"
//输出: false
// 
//
// 示例 4: 
//
// 输入: "([)]"
//输出: false
// 
//
// 示例 5: 
//
// 输入: "{[]}"
//输出: true 
// Related Topics 栈 字符串

package leetcode.editor.cn.easy.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//Java：有效的括号
public class P20ValidParentheses{
    public static void main(String[] args) {
        Solution solution = new P20ValidParentheses().new Solution();
        // TO TEST
//        System.out.println(solution.isValid("()"));
//        System.out.println(solution.isValid("()[]{}"));
//        System.out.println(solution.isValid("(]"));
//        System.out.println(solution.isValid("([)]"));
//        System.out.println(solution.isValid("{[]}"));
        System.out.println(solution.isValid("(])"));
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
        Map left=new HashMap();
        Map right=new HashMap();
        left.put('(',1);
        left.put('[',2);
        left.put('{',3);
        right.put(')',1);
        right.put(']',2);
        right.put('}',3);
        Stack stack=new Stack();
        char[] arrs=s.toCharArray();
        for (char arr : arrs) {
            if(left.containsKey(arr)){
                stack.push(arr);
            }else if(right.containsKey(arr)){
                if(!stack.empty() && left.get(stack.peek()).equals(right.get(arr))){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
public boolean isValid1(String s) {
    String t=s;
    while (t.contains("()") || t.contains("[]") || t.contains("{}")){
        t=t.replace("()","");
        t=t.replace("[]","");
        t=t.replace("{}","");
    }
    return t.length()>0?false:true;
}
}