package leetcode.editor.cn;

/**
 * CommonTools
 * <p>
 * This is description
 * </p>
 *
 * @author xuegangliu 2019/10/25
 * @since 1.8
 **/
public class CommonTools {

    private final static StringBuilder out=new StringBuilder();

    public static void printArray(int[] nums,int len){
        for (int i = 0; i < len; i++) {
            out.append(nums[i]).append(" ");
        }
        System.out.println(out.toString());
    }

    public static void printListNode(ListNode listNode){
        ListNode a=listNode;
        while (a.next!=null){
            out.append(a.val).append(" ");
            a=a.next;
            if(a.next==null){
                out.append(a.val);
            }
        }
        System.out.println(out.toString());
    }


}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}