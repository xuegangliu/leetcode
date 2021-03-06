//罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。 
//
// 字符          数值
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000 
//
// 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做 XXVII, 即为 XX + V + II 。 
//
// 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况： 
//
// 
// I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。 
// X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
// C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。 
// 
//
// 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。 
//
// 示例 1: 
//
// 输入: "III"
//输出: 3 
//
// 示例 2: 
//
// 输入: "IV"
//输出: 4 
//
// 示例 3: 
//
// 输入: "IX"
//输出: 9 
//
// 示例 4: 
//
// 输入: "LVIII"
//输出: 58
//解释: L = 50, V= 5, III = 3.
// 
//
// 示例 5: 
//
// 输入: "MCMXCIV"
//输出: 1994
//解释: M = 1000, CM = 900, XC = 90, IV = 4. 
// Related Topics 数学 字符串

package leetcode.editor.cn.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Java：罗马数字转整数
public class P13RomanToInteger{
    public static void main(String[] args) {
        Solution solution = new P13RomanToInteger().new Solution();
        // TO TEST
        System.out.println(solution.romanToInt("III"));
        System.out.println(solution.romanToInt("IV"));
        System.out.println(solution.romanToInt("IX"));
        System.out.println(solution.romanToInt("LVIII"));
        System.out.println(solution.romanToInt("MCMXCIV"));
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int romanToInt(String s) {
        Map<String,Integer> map=new HashMap<String,Integer>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        int len=s.length();
        int sum=0;
        for (int i = 0; i < len-1; i++) {
            String a=String.valueOf(s.charAt(i));
            String b=String.valueOf(s.charAt(i+1));
            if(map.get(a).compareTo(map.get(b))<0){
                sum=sum-map.get(a);
            }else{
                sum=sum+map.get(a);
            }
        }
        sum=sum+map.get(String.valueOf(s.charAt(len-1)));
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    public int romanToIntA(String s) {
        Map<String,Integer> map=new HashMap<String,Integer>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        int len=s.length();
        int sum=0;
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < len; i++) {
            String a=String.valueOf(s.charAt(i));
            String b=(i+1)>=len?"A":String.valueOf(s.charAt(i+1));
            if(map.containsKey(b)){
                if(map.get(a).compareTo(map.get(b))<0){
                    list.add(a+b);
                    i++;
                }else{
                    list.add(a);
                }
            }else{
                list.add(a);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String t=list.get(i);
            int k=t.length();
            if(k>1){
                sum=sum+map.get(String.valueOf(t.charAt(1)))-map.get(String.valueOf(t.charAt(0)));
            }else{
                sum=sum+map.get(String.valueOf(t));
            }
        }
        return sum;
    }
}