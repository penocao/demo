package demo2;

public class Node {

    //节点内容
    int data;
    //下一个节点
    Node next;

    public Node(int data) {
        this.data = data;
    }

    //为节点追加节点
    public Node append(Node node) {
        //当前节点
        Node currentNode = this;
        //循环向后找
        while (true) {
            //取出下一个节点
            Node nextNode = currentNode.next;
            //如果下一个节点为null,当前节点已经是最后一个节点
            if (nextNode == null) {
                break;
            }
            //赋给当前节点
            currentNode = nextNode;
        }
        //把需要追加的节点追加啊为找到的当前节点的下一个节点
        currentNode.next = node;
        return this;
    }

    //获取下一个节点
    public Node next() {
        return this.next;
    }

    public int getData() {
        return this.data;
    }

    //判断节点是否为最后一个节点
    public boolean isLast() {
        return this.next == null;
    }

    //删除一个节点
    public void removeNext() {
        this.next = next.next;
    }

    //显示所有节点信息
    public void show() {
        Node currentNode = this;
        while (true) {
            System.out.println("currentNode=" + currentNode.data);
            Node nextNode = currentNode.next;
            if (nextNode == null) {
                break;
            }
            currentNode = nextNode;
        }
    }
}
