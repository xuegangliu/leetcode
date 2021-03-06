package leetcode.editor.cn.common;

import java.util.List;

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

    public synchronized static void printArrayByLength(int[] nums,int len){
        len=nums.length<len?nums.length:len;
        for (int i = 0; i < len; i++) {
            out.append(nums[i]).append(" ");
        }
        System.out.println(out.toString());
        out.delete(0,out.length());
    }

    public synchronized static void printArray(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            out.append(nums[i]).append(" ");
        }
        System.out.println(out.toString());
        out.delete(0,out.length());
    }

    public synchronized static void printListNode(ListNode listNode){
        ListNode a=listNode;
        while (a.next!=null){
            out.append(a.val).append(" ");
            a=a.next;
            if(a.next==null){
                out.append(a.val);
            }
        }
        System.out.println(out.toString());
        out.delete(0,out.length());
    }

    public synchronized static void printListObject(List list){
        for (int i = 0; i < list.size(); i++) {
            out.append(list.get(i)+"").append(" ");
        }
        System.out.println(out.toString());
        out.delete(0,out.length());
    }


}
//class ListNode {
//    public int val;
//    public ListNode next;
//    public ListNode(int x) { val = x; }
//}