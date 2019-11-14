//实现 int sqrt(int x) 函数。 
//
// 计算并返回 x 的平方根，其中 x 是非负整数。 
//
// 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。 
//
// 示例 1: 
//
// 输入: 4
//输出: 2
// 
//
// 示例 2: 
//
// 输入: 8
//输出: 2
//说明: 8 的平方根是 2.82842..., 
//     由于返回类型是整数，小数部分将被舍去。
// 
// Related Topics 数学 二分查找

package leetcode.editor.cn.easy;
//Java：x 的平方根
public class P69Sqrtx{
    public static void main(String[] args) {
        Solution solution = new P69Sqrtx().new Solution();
        // TO TEST
//        System.out.println(solution.mySqrt(4));
//        System.out.println(solution.mySqrt(8));
        System.out.println(solution.mySqrt(2147395599));//46339
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        while(low<=high){
            long mid = (long)(low + high)/2;
            if(mid*mid < x)
                low = (int)mid + 1;
            else if(mid*mid > x)
                high = (int)mid - 1;
            else
                return (int)mid;
        }
        return high;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    public int mySqrt(int x) {
        if(x<=0){
            return 0;
        }
        long b=x/2;
        long result=1;
        if(b*b>=x || b*b<0){
            for (long i = 1; i <= b; i++) {
                if(i*i<=x){
                    result=i;
                }else{
                    result=i-1;
                    break;
                }
            }
        }else{
            for (long i = b; i <= x; i++) {
                if(i*i<=x){
                    result=i;
                }else{
                    result=i-1;
                    break;
                }
            }
        }
        return (int)result;
    }
}