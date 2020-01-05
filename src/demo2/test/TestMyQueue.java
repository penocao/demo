package demo2.test;

import demo2.MyQueue;

public class TestMyQueue {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.add(5);
        myQueue.add(6);
        myQueue.add(9);
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
    }
}
