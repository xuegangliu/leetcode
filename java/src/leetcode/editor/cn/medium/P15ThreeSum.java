//给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//满足要求的三元组集合为：
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]
// 
// Related Topics 数组 双指针

package leetcode.editor.cn.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Java：三数之和
public class P15ThreeSum{
    public static void main(String[] args) {
        Solution solution = new P15ThreeSum().new Solution();
        // TO TEST
        int[] nums=new int[] {-1, 0, 1, 2, -1, -4};
        solution.threeSum(nums);
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // 时间复杂度 O(n*n/2)
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length-2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1])
                continue; // 去掉前n-2位重复的起点
            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                if (sum == 0) {
                    result.add(Arrays.asList(new Integer[]{nums[i], nums[left], nums[right]}));
                    while (left < right && nums[left] == nums[left + 1])
                        left++; // 去掉重复的左点
                    while (left < right && nums[right] == nums[right - 1])
                        right--; // 去掉重复的右点
                    right--; // 进入下一组左右点判断
                    left++;
                } else if (sum > 0) {
                    right--; // sum>0 ,说明和过大了，需要变小，所以移动右边指针
                } else {
                    left++; // 同理，需要变大，移动左指针
                }
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
// 循环获取三个数 进行匹配  超时
// 时间复杂度 O(n*n*n)
public static List<List<Integer>> threeSum1(int[] nums) {
    List<List<Integer>> result = new ArrayList<List<Integer>>(  );
    Map<String,String> map = new HashMap<String,String>(  );
    for(int i=0;i<nums.length-2;i++){
        for(int j=i+1;j<nums.length-1;j++){
            for(int k=j+1;k<nums.length;k++){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    int[] ok ={nums[i],nums[j],nums[k]};
                    Arrays.sort(ok);
                    String key="."+ok[0]+"."+ok[1]+"."+ok[2];
                    if(map.containsKey( key ))
                        map.put( key,"2" );
                    else
                        map.put( key,"1");
                    if(map.get( key ).equals( "1" )) {
                        int[] re = new int[]{nums[i],nums[j],nums[k]};
                        Arrays.sort( re );
                        List<Integer> t = new ArrayList<Integer>(  );
                        t.add( re[0] );
                        t.add( re[1] );
                        t.add( re[2] );
                        result.add( t );
                    }
                }
            }
        }
    }
    return result;
}
}