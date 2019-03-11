package org.lxg.leetcode.problem.array;

import java.util.Arrays;

/**************************
 * @description: Code922 按奇偶排序数组 II
 * @author: xuegangliu
 * @date: 2019/3/11 16:29
 ***************************/
public class Code922 {
//    输入：[4,2,5,7]
//    输出：[4,5,2,7]
//    解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
    // 时间复杂度 O(n)
    public static int[] sortArrayByParityII(int[] A) {
        Arrays.sort(A);
        int len = A.length;
        int t = len/2;
        int[] m=new int[t];
        int[] n=new int[t];
        int[] result=new int[len];
        int a=0,b=0;
        for(int i=0;i<len;i++){
            if(A[i]%2!=0){
                m[a]=A[i];
                a++;
            }else{
                n[b]=A[i];
                b++;
            }
        }
        for(int i=0;i<len;i++) {
            if(i%2==0){
                result[i]=n[i/2];
            }else{
                result[i]=m[i/2];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        sortArrayByParityII(new int[]{4,2,5,7});
    }
}
