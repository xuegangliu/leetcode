package org.lxg.leetcode.problem.array.group500;

/**************************
 * @description: Code509 斐波那契数
 * @author: xuegangliu
 * @date: 2019/3/11 17:25
 ***************************/
public class Code509 {

//    F(0) = 0,   F(1) = 1
//    F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
    public static int fib(int N) {
        if(N==0)
            return 0;
        else if(N==1)
            return 1;
        else if(N==2)
            return 1;
        else
            return fib(N-1)+fib(N-2);
    }

    public static void main(String[] args) {
        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
    }
}
