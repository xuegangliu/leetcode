//有一堆石头，每块石头的重量都是正整数。 
//
// 每一回合，从中选出两块最重的石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下： 
//
// 
// 如果 x == y，那么两块石头都会被完全粉碎； 
// 如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。 
// 
//
// 最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。 
//
// 
//
// 提示： 
//
// 
// 1 <= stones.length <= 30 
// 1 <= stones[i] <= 1000 
// 
// Related Topics 堆 贪心算法

package leetcode.editor.cn.easy.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

//Java：最后一块石头的重量
public class P1046LastStoneWeight{
    public static void main(String[] args) {
        Solution solution = new P1046LastStoneWeight().new Solution();
        // TO TEST
//        System.out.println(solution.lastStoneWeight(new int[]{1,4,3,4,2,1}));
        System.out.println(solution.lastStoneWeight(new int[]{2,2,3}));
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0,len=stones.length; i < len; i++) {
            pq.add(stones[i]);
        }

        while (pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            if(a!=b){
                pq.add(Math.abs(b-a));
            }
        }
        return pq.size()==1?pq.peek():0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}