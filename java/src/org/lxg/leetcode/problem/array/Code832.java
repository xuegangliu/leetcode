package org.lxg.leetcode.problem.array;

/**
 * @author: xuegangliu
 * @date: 3/10/2019 8:51 AM
 * @DES: 翻转图像
 * @version: v1.0
 */
public class Code832 {
//    输入: [[1,1,0],[1,0,1],[0,0,0]]
//    输出: [[1,0,0],[0,1,0],[1,1,1]]
//    解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
//    然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
    // 时间复杂度 O(n*n)
    public static int[][] flipAndInvertImage(int[][] A) {
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

    public static void main(String[] args) {
        int[][] in = new int[3][];
        in[0]=new int[]{1,1,0};
        in[1]=new int[]{1,0,1};
        in[2]=new int[]{0,0,0};
        Code832.flipAndInvertImage(in);
    }
}
