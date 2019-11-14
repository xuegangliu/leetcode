//使用栈实现队列的下列操作： 
//
// 
// push(x) -- 将一个元素放入队列的尾部。 
// pop() -- 从队列首部移除元素。 
// peek() -- 返回队列首部的元素。 
// empty() -- 返回队列是否为空。 
// 
//
// 示例: 
//
// MyQueue queue = new MyQueue();
//
//queue.push(1);
//queue.push(2);  
//queue.peek();  // 返回 1
//queue.pop();   // 返回 1
//queue.empty(); // 返回 false 
//
// 说明: 
//
// 
// 你只能使用标准的栈操作 -- 也就是只有 push to top, peek/pop from top, size, 和 is empty 操作是合法的。 
// 你所使用的语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。 
// 假设所有操作都是有效的 （例如，一个空的队列不会调用 pop 或者 peek 操作）。 
// 
// Related Topics 栈 设计

package leetcode.editor.cn.easy;

import java.util.Stack;

//Java：用栈实现队列
public class P232ImplementQueueUsingStacks{
    public static void main(String[] args) {
        MyQueue solution = new P232ImplementQueueUsingStacks().new MyQueue();
        // TO TEST
        solution.push(1);
        solution.push(2);
        solution.pop();
        solution.push(3);
        solution.push(4);
        solution.pop();
        solution.peek();
//        解答失败: 测试用例:["MyQueue","push","push","pop","push","push","pop","peek"] [[],[1],[2],[],[3],[4],[],[]] 测试结果:[null,null,null,1,null,null,3,4] 期望结果:[null,null,null,1,null,null,2,3]
    }

    private static void printStack(Stack stack){
        StringBuilder sb=new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop()).append(" ");
        }
        System.out.println(sb.toString());
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class MyQueue {

    private Stack<Integer> stack;
    private Stack<Integer> stackQueue;

    /** Initialize your data structure here. */
    public MyQueue() {
        stack=new Stack<Integer>();
        stackQueue=new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(stack.isEmpty()&&stackQueue.isEmpty()){
            stackQueue.push(x);
        }else {
            stack.push(x);
        }
        System.out.println("null");
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(stackQueue.isEmpty()) {
            while (!stack.empty()) {
                stackQueue.push(stack.pop());
            }
        }
        int pop=stackQueue.pop();
        System.out.println(pop);
        return pop;
    }
    
    /** Get the front element. */
    public int peek() {
        if(stackQueue.isEmpty()) {
            while (!stack.empty()) {
                stackQueue.push(stack.pop());
            }
        }
        System.out.println(stackQueue.peek());
        return stackQueue.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        System.out.println(stack.isEmpty()&&stackQueue.isEmpty());
        return stack.isEmpty()&&stackQueue.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
//leetcode submit region end(Prohibit modification and deletion)

}