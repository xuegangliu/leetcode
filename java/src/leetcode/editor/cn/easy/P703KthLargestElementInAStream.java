//设计一个找到数据流中第K大元素的类（class）。注意是排序后的第K大元素，不是第K个不同的元素。 
//
// 你的 KthLargest 类需要一个同时接收整数 k 和整数数组nums 的构造器，它包含数据流中的初始元素。每次调用 KthLargest.add，返回当前数据流中第K大的元素。 
//
// 示例: 
//
// 
//int k = 3;
//int[] arr = [4,5,8,2];
//KthLargest kthLargest = new KthLargest(3, arr);
//kthLargest.add(3);   // returns 4
//kthLargest.add(5);   // returns 5
//kthLargest.add(10);  // returns 5
//kthLargest.add(9);   // returns 8
//kthLargest.add(4);   // returns 8
// 
//
// 说明: 
//你可以假设 nums 的长度≥ k-1 且k ≥ 1。 
// Related Topics 堆

package leetcode.editor.cn.easy;

import java.util.PriorityQueue;

//Java：数据流中的第K大元素
public class P703KthLargestElementInAStream{
    public static void main(String[] args) {
        int k = 3;
        int[] arr = new int[]{4,5,8,2};
        KthLargest solution = new P703KthLargestElementInAStream().new KthLargest(k,arr);
        // TO TEST
        System.out.println(solution.add(3));
        System.out.println(solution.add(5));
        System.out.println(solution.add(10));
        System.out.println(solution.add(9));
        System.out.println(solution.add(4));
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class KthLargest {
    final PriorityQueue<Integer> pq;
    final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>(k);
        for(int i : nums){//对传进来的int数组遍历
            add(i);
        }
    }

    public int add(int val) {
        // 如果队列中的数量少于K，直接添加入优先队列，优先队列会自动维持小顶堆
        if(pq.size() < k)
            pq.offer(val);
        else{
            // 否则队列中的数量大于或者等于K，优先队列中的最小数字小于新的数据，优先队列中的顶堆要被移除，并且添加入新的数据进优先队列
            if(pq.peek() < val){
                pq.poll();
                pq.offer(val);
            }
        }
        return pq.peek();//返回当前第K大的数

    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
//leetcode submit region end(Prohibit modification and deletion)

}