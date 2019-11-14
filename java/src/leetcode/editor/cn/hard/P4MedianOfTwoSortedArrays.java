//给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。 
//
// 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。 
//
// 你可以假设 nums1 和 nums2 不会同时为空。 
//
// 示例 1: 
//
// nums1 = [1, 3]
//nums2 = [2]
//
//则中位数是 2.0
// 
//
// 示例 2: 
//
// nums1 = [1, 2]
//nums2 = [3, 4]
//
//则中位数是 (2 + 3)/2 = 2.5
// 
// Related Topics 数组 二分查找 分治算法

package leetcode.editor.cn.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Java：寻找两个有序数组的中位数
public class P4MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Solution solution = new P4MedianOfTwoSortedArrays().new Solution();
        // TO TEST
        System.out.println(solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            // 时间复杂度 O(n)
            List<Integer> all = new ArrayList<Integer>();
            int allLen = nums1.length + nums2.length;
            int[] m = new int[allLen];
            // 将俩个数组合并到一个数组上
            for (int i = 0; i < allLen; i++) {
                if (i < nums1.length) {
                    m[i] = nums1[i];
                    all.add(nums1[i]);
                } else {
                    m[i] = nums2[i - nums1.length];
                    all.add(nums2[i - nums1.length]);
                }
            }
            // 将总数组进行排序
            Arrays.sort(m);

            // 获取中位数
            if (allLen % 2 == 0) {
                int sum = m[allLen / 2 - 1] + m[allLen / 2];
//                System.out.println(new Double(sum) / 2);
                return new Double(sum) / 2;
            } else {
//                System.out.println(new Double(m[allLen / 2]));
                return new Double(m[allLen / 2]);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}