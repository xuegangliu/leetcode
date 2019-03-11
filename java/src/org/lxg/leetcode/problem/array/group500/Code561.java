package org.lxg.leetcode.problem.array.group500;

import java.util.Arrays;

/**************************
 * @description: Code561 数组拆分 I
 * @author: xuegangliu
 * @date: 2019/3/11 17:31
 ***************************/
public class Code561 {
//    输入: [1,4,3,2]
//    输出: 4
//    解释: n 等于 2, 最大总和为 4 = min(1, 2) + min(3, 4).
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        //int count=nums.length/2;
        int sum=0;
        for(int i=0;i<len;i++){
            if(i%2==0)
                sum=sum+nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
//        arrayPairSum(new int[]{1,4,3,2});
        arrayPairSum(new int[]{1,4,3,2,6,7});

    }
}
