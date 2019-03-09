package org.lxg.leetcode.problem.array;

/**
 * @author: xuegangliu
 * @date: 3/9/2019 8:31 PM
 * @DES: 盛最多水的容器
 * @version: v1.0
 */
public class Code11 {
//    输入: [1,8,6,2,5,4,8,3,7]
//    输出: 49
    public static int maxArea(int[] height) {
        int area=0;
        // 从第一个开始组成的所有容器的值 取最大容器的值
        // 时间复杂度 O(n*n)
        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                int big = height[i]>height[j]? height[j]*(j-i):height[i]*(j-i);
                if(big>area)
                    area=big;
            }
        }
        return area;
    }
}
