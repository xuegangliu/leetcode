package org.lxg.leetcode.problem;

/**************************
 * @description: org.lxg.leetcode.problem.Code1 1. 两数之和
 * @author: xuegangliu
 * @date: 2019/3/7 14:19
 ***************************/
public class Code1 {

//    给定 nums = [2, 7, 11, 15], target = 9
//    因为 nums[0] + nums[1] = 2 + 7 = 9
//    所以返回 [0, 1]
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
}
