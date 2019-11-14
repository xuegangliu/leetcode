//给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。 
//
// 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。 
//
// 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。 
//
// 示例 1: 
//
// 
//输入: [[1,1,0],[1,0,1],[0,0,0]]
//输出: [[1,0,0],[0,1,0],[1,1,1]]
//解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
//     然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
// 
//
// 示例 2: 
//
// 
//输入: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
//输出: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
//解释: 首先翻转每一行: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]；
//     然后反转图片: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
// 
//
// 说明: 
//
// 
// 1 <= A.length = A[0].length <= 20 
// 0 <= A[i][j] <= 1 
// 
// Related Topics 数组

package leetcode.editor.cn.easy;
//Java：翻转图像
public class P832FlippingAnImage{
    public static void main(String[] args) {
        Solution solution = new P832FlippingAnImage().new Solution();
        // TO TEST
        int[][] in = new int[3][];
        in[0]=new int[]{1,1,0};
        in[1]=new int[]{1,0,1};
        in[2]=new int[]{0,0,0};
        solution.flipAndInvertImage(in);
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int len = A.length;
        int[][] result=new int[len][];
        for(int i=0;i<len;i++){
            int k=0;
            int[] t =new int[A[i].length];
            for(int j=A[i].length-1;j>=0;j--){
                t[k]=A[i][j]==0?1:0;
                k++;
            }
            result[i]=t;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}