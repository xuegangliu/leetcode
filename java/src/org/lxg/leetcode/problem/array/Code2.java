package org.lxg.leetcode.problem.array;

/**************************
 * @description: Code2 两数相加
 * @author: xuegangliu
 * @date: 2019/3/7 16:45
 ***************************/
public class Code2 {
//    输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//    输出：7 -> 0 -> 8
//    原因：342 + 465 = 807


    // TODO 未完成
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);//
        ListNode temp = result;

        int len=0;
        ListNode t=l1;
        if(null!=t.next)
            len++;
        System.out.println(len);
        return null;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
    }
}
