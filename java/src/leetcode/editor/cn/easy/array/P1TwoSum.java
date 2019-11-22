//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表

package leetcode.editor.cn.easy.array;

import leetcode.editor.cn.common.CommonTools;

import java.util.HashMap;
import java.util.Map;

/**************************
 * 两数之和
 * @author xuegangliu 2019/3/7 14:19
 ***************************/
public class P1TwoSum{
    public static void main(String[] args) {
        Solution solution = new P1TwoSum().new Solution();
        // TO TEST
        CommonTools.printArray(solution.twoSum(new int[]{2, 5, 5, 11},10));
        System.out.println();
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
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
//leetcode submit region end(Prohibit modification and deletion)
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
}