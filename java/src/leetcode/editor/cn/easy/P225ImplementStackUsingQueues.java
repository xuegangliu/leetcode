//使用队列实现栈的下列操作： 
//
// 
// push(x) -- 元素 x 入栈 
// pop() -- 移除栈顶元素 
// top() -- 获取栈顶元素 
// empty() -- 返回栈是否为空 
// 
//
// 注意: 
//
// 
// 你只能使用队列的基本操作-- 也就是 push to back, peek/pop from front, size, 和 is empty 这些操作是合法的。 
// 你所使用的语言也许不支持队列。 你可以使用 list 或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。 
// 你可以假设所有操作都是有效的（例如, 对一个空的栈不会调用 pop 或者 top 操作）。 
// 
// Related Topics 栈 设计

package leetcode.editor.cn.easy;

import java.util.ArrayDeque;

//Java：用队列实现栈
public class P225ImplementStackUsingQueues{
    public static void main(String[] args) {
        MyStack solution = new P225ImplementStackUsingQueues().new MyStack();
        // TO TEST
        solution.push(1);
        solution.push(3);
        solution.push(4);
        int param_2 = solution.pop();
        int param_3 = solution.top();
        boolean param_4 = solution.empty();
        System.out.println(param_2+" "+param_3+" "+param_4);
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class MyStack {

    private ArrayDeque<Integer> arrayDeque;

    /** Initialize your data structure here. */
    public MyStack() {
        this.arrayDeque=new ArrayDeque<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        arrayDeque.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return arrayDeque.removeLast();
    }
    
    /** Get the top element. */
    public int top() {
        return arrayDeque.getLast();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return arrayDeque.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
//leetcode submit region end(Prohibit modification and deletion)

}