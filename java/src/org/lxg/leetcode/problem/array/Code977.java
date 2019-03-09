package org.lxg.leetcode.problem.array;

import java.util.Arrays;

/**
 * @author: xuegangliu
 * @date: 3/9/2019 8:53 PM
 * @DES: 有序数组的平方
 * @version: v1.0
 */
public class Code977 {
//    输入：[-4,-1,0,3,10]
//    输出：[0,1,9,16,100]
    // 时间复杂度 O(n)
    public static int[] sortedSquares(int[] A) {
        int len = A.length;
        int[] t=new int[len];
        int[] result=new int[len];
        for(int i=0;i<len;i++){
            t[i]=A[i]>0?A[i]:-A[i];
        }
        Arrays.sort( t );
        for(int i=0;i<len;i++){
            result[i]=t[i]*t[i];
        }
        return result;
    }

    public static void main(String[] args) {
        sortedSquares(new int[]{-4,-1,0,3,10});
    }
}
