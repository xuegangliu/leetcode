package org.lxg.leetcode.problem.array.group100;

import org.lxg.leetcode.util.StringTools;

import java.util.HashMap;
import java.util.Map;

/**************************
 * @description: org.lxg.leetcode.problem.array.group100.Code1 1. 两数之和
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

    // 时间复杂度 O(n) @to: https://crossoverjie.top/JCSprout/
    public static int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2] ;
        Map<Integer,Integer> map = new HashMap<>(2) ;
        for (int i=0 ;i<nums.length;i++){
            // 是否存在匹配元素
            if (map.containsKey(nums[i])){
                result = new int[]{map.get(nums[i]),i} ;
            }
            // 将每个元素所匹配的元素存到map里,看之后是否能找到匹配的元素
            map.put(target - nums[i],i) ;
        }
        return result ;
    }

    public static void main(String[] args) {
        System.out.println( StringTools.getString(Code1.twoSum(new int[]{2, 5, 5, 11},10)));
    }
}