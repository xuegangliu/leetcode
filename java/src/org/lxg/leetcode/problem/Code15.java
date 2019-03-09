package org.lxg.leetcode.problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: xuegangliu
 * @date: 3/9/2019 2:07 PM
 * @DES: 三数之和
 * @version: v1.0
 */
public class Code15 {
//    例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//    满足要求的三元组集合为：
//            [
//            [-1, 0, 1],
//            [-1, -1, 2]
//            ]
    // TODO 未完成
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(  );
        Map<String,String> map = new HashMap<>(  );
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=i+2;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        String key="."+nums[i]+"."+nums[j]+"."+nums[k];
                        map.put( key,nums[i]==0&&nums[j]==0&&nums[k]==0 ?"1":key);
                        if(map.get( key).contains( "."+nums[i] ) &&
                                map.get(key ).contains( "."+nums[j] ) &&
                                map.get( key).contains( "."+nums[k] ) ||
                                (nums[i]==0&&nums[j]==0&&nums[k]==0&&map.get( key ).equals( "1" )  )) {
                            if(nums[i]==0&&nums[j]==0&&nums[k]==0)
                                map.put( key,nums[i]==0&&nums[j]==0&&nums[k]==0 ?"2":key);
                            List<Integer> t = new ArrayList<>(  );
                            t.add( nums[i] );
                            t.add( nums[j] );
                            t.add( nums[k] );
                            result.add( t );
                        }
                    }
                }
            }
        }
        return result;
    }
}
