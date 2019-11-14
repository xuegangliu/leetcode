//设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。 
//
// 
// push(x) -- 将元素 x 推入栈中。 
// pop() -- 删除栈顶的元素。 
// top() -- 获取栈顶元素。 
// getMin() -- 检索栈中的最小元素。 
// 
//
// 示例: 
//
// MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.getMin();   --> 返回 -3.
//minStack.pop();
//minStack.top();      --> 返回 0.
//minStack.getMin();   --> 返回 -2.
// 
// Related Topics 栈 设计

package leetcode.editor.cn.easy;

//Java：最小栈
public class P155MinStack{
    public static void main(String[] args) {
        MinStack minStack = new P155MinStack().new MinStack();
        // TO TEST
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class MinStack {
    private int value[];
    private int size;
    private int cur;

    /** initialize your data structure here. */
    public MinStack() {
        this.size=0;
        this.cur=0;
        this.value=new int[65536];
    }

    public void push(int x) {
        this.value[cur]=x;
        this.cur++;
        this.size++;
    }

    public void pop() {
        if(this.size>0) {
            this.size--;
            this.cur--;
        }
    }

    public int top() {
        return this.value[cur-1];
    }

    public int getMin() {
        int t=value[0];
        for (int i = 0; i < size; i++) {
            if(t>value[i]){
                t=value[i];
            }
        }
        return t;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
//leetcode submit region end(Prohibit modification and deletion)
}