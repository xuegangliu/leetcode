package org.lxg.leetcode;

import org.lxg.leetcode.problem.Code1;
import org.lxg.leetcode.problem.Code4;
import org.lxg.leetcode.util.StringTools;

/**************************
 * @description: org.lxg.leetcode.Main
 * @author: xuegangliu
 * @date: 2019/3/7 14:22
 ***************************/
public class Main {
    public static void main(String[] args) {
        testCode4();
    }

    public static void testCode4(){
        new Code4().findMedianSortedArrays( new int[]{1,3},new int[]{2} );
//        new Code4().findMedianSortedArrays( new int[]{1,2},new int[]{3,4} );
    }

    public static void testCode1(){
        System.out.println(StringTools.getString(Code1.twoSum(new int[]{2, 5, 5, 11},10)));
    }

}
