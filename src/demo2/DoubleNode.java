package demo2;

public class DoubleNode {

    //节点内容
    private int data;
    /**
     * 下一个节点
     */
    private DoubleNode next = this;

    /**
     * 上一个节点
     */
    private DoubleNode pre = this;

    public DoubleNode(int data) {
        this.data = data;
    }

    //获取下一个节点
    public DoubleNode next() {
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

    //插入一个节点作为当前节点的下一个节点
    public void after(DoubleNode node) {
        //取出下一个节点，作为下下一个节点
        DoubleNode nextNode = next;
        //把新节点作为当前节点的下一个节点
        next = node;
        next.pre = this;
        //把下下个节点设置为新节点的下一个节点
        node.next = nextNode;
        nextNode.pre = node;
    }

    //获取上一个节点
    public DoubleNode pre() {
        return this.pre;
    }
}
