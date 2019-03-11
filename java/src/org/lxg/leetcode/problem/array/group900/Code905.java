package org.lxg.leetcode.problem.array.group900;

/**
 * @author: xuegangliu
 * @date: 3/10/2019 9:14 AM
 * @DES: 按奇偶排序数组
 * @version: v1.0
 */
public class Code905 {

//    输入：[3,1,2,4]
//    输出：[2,4,3,1]
//    输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
    // 时间复杂度 O(n)
    public static int[] sortArrayByParity(int[] A) {
//        Arrays.sort( A );
        int len = A.length;
        int[] a=new int[len],b=new int[len],result=new int[len];
        int m=0,n=0;
        for(int i=0;i<len;i++){
            if(A[i]%2==0){
                a[m]=A[i];
                result[m]=A[i];
                m++;
            }else{
                b[n]=A[i];
                n++;
            }
        }
        for(int i=0;i<n;i++){
            if(m!=0) {
                result[m] = b[i];
                m++;
            }else{
                result[i]=b[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        Code905.sortArrayByParity( new int[]{3,1,2,4} );
//        Code905.sortArrayByParity( new int[]{1} );
        Code905.sortArrayByParity( new int[]{0,2} );
    }
}
