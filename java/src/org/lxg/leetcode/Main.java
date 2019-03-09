package org.lxg.leetcode;

import org.lxg.leetcode.problem.array.Code1;
import org.lxg.leetcode.problem.array.Code11;
import org.lxg.leetcode.problem.array.Code15;
import org.lxg.leetcode.problem.array.Code4;
import org.lxg.leetcode.util.StringTools;

/**************************
 * @description: org.lxg.leetcode.Main
 * @author: xuegangliu
 * @date: 2019/3/7 14:22
 ***************************/
public class Main {
    public static void main(String[] args) {
        testCode11();
    }

    public static void testCode11(){
        Code11.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
    }

    public static void testCode15(){
        Code15.threeSum(new int[] {-1, 0, 1, 2, -1, -4} );
//        Code15.threeSum(new int[] {0,0,0} );
    }

    public static void testCode4(){
        Code4.findMedianSortedArrays( new int[]{1,3},new int[]{2} );
//        new Code4().findMedianSortedArrays( new int[]{1,2},new int[]{3,4} );
    }

    public static void testCode1(){
        System.out.println(StringTools.getString(Code1.twoSum(new int[]{2, 5, 5, 11},10)));
    }

}
