package demo2;

public class LoopNode {

    //节点内容
    private int data;
    /**
     * 下一个节点
     */
    private LoopNode next = this;

    public LoopNode(int data) {
        this.data = data;
    }

    //获取下一个节点
    public LoopNode next() {
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
    public void after(LoopNode node) {
        //取出下一个节点，作为下下一个节点
        LoopNode nextNode = next;
        //把新节点作为当前节点的下一个节点
        next = node;
        //把下下个节点设置为新节点的下一个节点
        node.next = nextNode;
    }
}
