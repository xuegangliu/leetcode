package org.lxg.leetcode.problem.array;

import org.lxg.leetcode.util.StringTools;

/**************************
 * @description: org.lxg.leetcode.problem.array.Code1 1. 两数之和
 * @author: xuegangliu
 * @date: 2019/3/7 14:19
 ***************************/
public class Code1 {

//    给定 nums = [2, 7, 11, 15], target = 9
//    因为 nums[0] + nums[1] = 2 + 7 = 9
//    所以返回 [0, 1]
    // 时间复杂度 O(n*n)
    public static int[] twoSum(int[] nums, int target) {
        int[] resutl={};

        int length=nums.length;
        // 从第一个元素开始 与之后的所有元素匹配,不匹配从第二个开始
        for(int i=0;i<length-1;i++){
            for(int j=i+1;j<length;j++){
                if(i!=j && nums[i]+nums[j]==target){
                    if(i<j)
                        resutl= new int[]{i, j};
                    else
                        resutl= new int[]{j,i};
                }
            }
        }
        return resutl;
    }

    public static void main(String[] args) {
        System.out.println( StringTools.getString(Code1.twoSum(new int[]{2, 5, 5, 11},10)));
    }
}
