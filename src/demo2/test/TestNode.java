package demo2.test;

import demo2.Node;

public class TestNode {

    public static void main(String[] args) {
        //创建节点
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        //追加节点
        node1.append(node2).append(node3);
        //取出下一个节点
        System.out.println(node1.next().next().getData());
        System.out.println(node1.isLast());

        //显示所有节点内容
        node1.show();
        node1.removeNext();
        node1.show();
    }
}
