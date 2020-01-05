package demo2;

public class MyQueue {

    private int[] elements;

    public MyQueue() {
        this.elements = new int[0];
    }

    //入队
    public void add(int element) {
        //创建一个新的数组
        int[] newArr = new int[elements.length + 1];
        //把原数组中的元素复制到新数组
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        newArr[newArr.length - 1] = element;
        //使用新数组替换旧数组
        elements = newArr;
    }

    //出队
    public int poll() {
        if (elements.length == 0) {
            throw new RuntimeException("array is empty");
        }
        //把数组中的第0个元素取出来
        int element = elements[0];
        int[] newArr = new int[elements.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = elements[i + 1];
        }
        elements = newArr;
        return element;
    }
}
