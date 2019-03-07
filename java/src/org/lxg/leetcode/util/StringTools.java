package org.lxg.leetcode.util;

/**************************
 * @description: StringTools
 * @author: xuegangliu
 * @date: 2019/3/7 14:33
 ***************************/
public class StringTools {

    public static String getString(int[] nums){
        StringBuffer sb = new StringBuffer("[");
        for(int i=0;i<nums.length;i++)
            if(i==nums.length-1)
                sb.append(+nums[i]);
            else
                sb.append(+nums[i]+",");
        sb.append("]");
        return sb.toString();
    }
}
