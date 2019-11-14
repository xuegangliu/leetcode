//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。 
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 示例： 
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
// 
// Related Topics 链表 数学

package leetcode.editor.cn.medium;


import leetcode.editor.cn.common.CommonTools;
import leetcode.editor.cn.common.ListNode;

//Java：两数相加
public class P2AddTwoNumbers{
    public static void main(String[] args) {
        System.out.println(10%10);
        System.out.println(5%10);

        Solution solution = new P2AddTwoNumbers().new Solution();
        // TO TEST
        ListNode a=new ListNode(2);
        a.next=new ListNode(4);
        a.next.next=new ListNode(3);

        ListNode b=new ListNode(5);
        b.next=new ListNode(6);
        b.next.next=new ListNode(4);
        CommonTools.printListNode(solution.addTwoNumbers(a,b));
    }


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode aHead = new ListNode(0);
        ListNode p = l1, q = l2, cur = aHead;
        int carry = 0;//进位
        while(p != null || q != null)
        {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y + carry;
            cur.next = new ListNode(sum % 10);
            cur =cur.next;
            carry = sum / 10;
            p = (p != null) ? p.next : null;
            q = (q != null) ? q.next : null;
        }
        if(carry != 0)
            cur.next = new ListNode(carry);
        return aHead.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}