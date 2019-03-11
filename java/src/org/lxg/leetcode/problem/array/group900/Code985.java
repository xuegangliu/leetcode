package org.lxg.leetcode.problem.array.group900;

/**************************
 * @description: Code985 查询后的偶数和
 * @author: xuegangliu
 * @date: 2019/3/11 17:07
 ***************************/
public class Code985 {
//    输入：A = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
//    输出：[8,6,2,4]
//    解释：
//    开始时，数组为 [1,2,3,4]。
//    将 1 加到 A[0] 上之后，数组为 [2,2,3,4]，偶数值之和为 2 + 2 + 4 = 8。
//    将 -3 加到 A[1] 上之后，数组为 [2,-1,3,4]，偶数值之和为 2 + 4 = 6。
//    将 -4 加到 A[0] 上之后，数组为 [-2,-1,3,4]，偶数值之和为 -2 + 4 = 2。
//    将 2 加到 A[3] 上之后，数组为 [-2,-1,3,6]，偶数值之和为 -2 + 6 = 4。
    // 时间复杂度 O(m*n)
    public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int len1=queries.length;
        int len=A.length;
        int[] result = new int[len1];
        for(int i=0;i<len1;i++){
            int sum=0;
            int add = queries[i][0];
            int index = queries[i][1];
            A[index]=A[index]+add;
            for(int j=0;j<len;j++){
                if(A[j]%2==0)
                    sum=sum+A[j];
            }
            result[i]=sum;
        }
        return result;
    }

    public static void main(String[] args) {
        sumEvenAfterQueries(new int[]{1,2,3,4},new int[][]{{1,0},{-3,1},{-4,0},{2,3}});
    }
}
