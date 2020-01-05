package demo2.test;

import demo2.MyStack;

public class TestMyStack {

    public static void main(String[] args) {
        //创建一个栈
        MyStack myStack = new MyStack();
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        //去除栈顶元素
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        //查看栈顶元素
//        System.out.println(myStack.peek());
        System.out.println(myStack.isEmpty());
    }
}
