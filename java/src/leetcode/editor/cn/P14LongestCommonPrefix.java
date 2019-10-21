//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 示例 1: 
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
// 
//
// 示例 2: 
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
// 
//
// 说明: 
//
// 所有输入只包含小写字母 a-z 。 
// Related Topics 字符串

package leetcode.editor.cn;

//Java：最长公共前缀
public class P14LongestCommonPrefix{
    public static void main(String[] args) {
        Solution solution = new P14LongestCommonPrefix().new Solution();
        // TO TEST
//        System.out.println(solution.longestCommonPrefix(new String[]{"flower","flow","flight"}));
//        System.out.println(solution.longestCommonPrefix(new String[]{"dog","racecar","car"}));
//        System.out.println(solution.longestCommonPrefix(new String[]{"c","c"}));
        System.out.println(solution.longestCommonPrefix(new String[]{"aa","a"}));
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length<=1){
            return strs.length==1?strs[0]:"";
        }
        String a=strs[0];
        int len=a.length();
        int slen=strs.length;
        String result="";
        boolean flag=false;
        for(int i=0;i<len;i++){
            result=a.substring(0,i+1);
            for(int j=1;j<slen;j++){
                if(strs[j].length()<(i+1)){
                    flag = true;
                    break;
                }
                if(!result.equals(strs[j].substring(0,i+1))) {
                    flag = true;
                    break;
                }
            }
            if(flag){
                return i==0?"":result.substring(0,result.length()-1);
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}