//实现 strStr() 函数。 
//
// 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回 -1。 
//
// 示例 1: 
//
// 输入: haystack = "hello", needle = "ll"
//输出: 2
// 
//
// 示例 2: 
//
// 输入: haystack = "aaaaa", needle = "bba"
//输出: -1
// 
//
// 说明: 
//
// 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。 
//
// 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。 
// Related Topics 双指针 字符串

package leetcode.editor.cn;
//Java：实现 strStr()
public class P28ImplementStrstr{
    public static void main(String[] args) {
        Solution solution = new P28ImplementStrstr().new Solution();
        // TO TEST
        System.out.println(solution.strStr("a","a"));
        System.out.println(solution.strStr("",""));
        System.out.println(solution.strStr("a",""));
        System.out.println(solution.strStr("hello","ll"));
        System.out.println(solution.strStr("helloxxx","xx"));
        System.out.println(solution.strStr("aaaaa","bba"));
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int strStr(String haystack, String needle) {
        // haystack = "hello", needle = "ll"
        int a=haystack.length(),b=needle.length();
        if(b>a){
            return -1;
        }else if(b==0){
            return 0;
        }
        for (int i = 0; i < a-b+1; i++) {
            int k=i;
            for (int j = 0; j < b; j++) {
//                System.out.println(haystack.charAt(k)+"---"+needle.charAt(j));
                if(haystack.charAt(k)==needle.charAt(j)){
                    if(j==b-1){
                        return i;
                    }
                    k++;
                    continue;
                }else{
                    break;
                }
            }
        }
        return -1;
//        return haystack.indexOf(needle);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}