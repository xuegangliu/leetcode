//报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下： 
//
// 1.     1
//2.     11
//3.     21
//4.     1211
//5.     111221
// 
//
// 1 被读作 "one 1" ("一个一") , 即 11。 
//11 被读作 "two 1s" ("两个一"）, 即 21。 
//21 被读作 "one 2", "one 1" （"一个二" , "一个一") , 即 1211。 
//
// 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。 
//
// 注意：整数顺序将表示为一个字符串。 
//
// 
//
// 示例 1: 
//
// 输入: 1
//输出: "1"
// 
//
// 示例 2: 
//
// 输入: 4
//输出: "1211"
// 
// Related Topics 字符串

package leetcode.editor.cn.easy;

//Java：报数
public class P38CountAndSay{
    public static void main(String[] args) {
        Solution solution = new P38CountAndSay().new Solution();
        // TO TEST
//        System.out.println(solution.countAndSay(1));
//        System.out.println(solution.countAndSay(2));
//        System.out.println(solution.countAndSay(3));
//        System.out.println(solution.countAndSay(4));
//        System.out.println(solution.countAndSay(5));
//        System.out.println(solution.countAndSay(6));
//        System.out.println(solution.countAndSay(7));
//        System.out.println(solution.countAndSay(15));
        System.out.println(solution.countAndSay(30));
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String countAndSay(int n) {
        if(n<1 || n>30){
            return "";
        }else if(n==1){
            return "1";
        }
        String s="1";

        StringBuilder sb=new StringBuilder();
        for (int p = 0; p < n-1; p++) {
            int k=1;
            char y=s.charAt(0);
            int x=1;
            int len=s.length();
            for (int i = 1; i < len; i++) {
                if(y==s.charAt(i)){
                    x=x+1;
                }else{
                    sb.append(x).append(y);
                    k++;
                    y=s.charAt(i);
                    x=1;
                }
                if(i+1==len){
                    sb.append(x).append(y);
                }
            }
            s=len==1?sb.append(x).append(y).toString():sb.toString();
//            System.out.println(s);
            sb=new StringBuilder();
        }
        return s;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}