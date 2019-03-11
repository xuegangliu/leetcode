package org.lxg.leetcode.problem.array.group100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: xuegangliu
 * @date: 3/9/2019 12:56 PM
 * @DES: 寻找两个有序数组的中位数
 * @version: v1.0
 */
public class Code4 {
//    示例 1:
//    nums1 = [1, 3]
//    nums2 = [2]
//    则中位数是 2.0
//    示例 2:
//    nums1 = [1, 2]
//    nums2 = [3, 4]
//    则中位数是 (2 + 3)/2 = 2.5
    // 时间复杂度 O(n)
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> all = new ArrayList<Integer>();
        int allLen = nums1.length+nums2.length;
        int[] m = new int[allLen];
        // 将俩个数组合并到一个数组上
        for(int i=0;i<allLen;i++){
            if(i<nums1.length){
                m[i]= nums1[i];
                all.add( nums1[i] );
            }else {
                m[i]=nums2[i-nums1.length];
                all.add( nums2[i-nums1.length] );
            }
        }
        // 将总数组进行排序
        Arrays.sort( m );

        // 获取中位数
        if(allLen%2==0){
            int sum = m[allLen/2-1]+m[allLen/2];
            System.out.println(new Double(  sum)/2 );
            return new Double(  sum)/2 ;
        }else{
            System.out.println(new Double( m[allLen/2] ));
            return new Double( m[allLen/2] );
        }
    }

    public static void main(String[] args) {
        Code4.findMedianSortedArrays( new int[]{1,3},new int[]{2} );
//        new Code4().findMedianSortedArrays( new int[]{1,2},new int[]{3,4} );
    }
}
