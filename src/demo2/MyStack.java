package demo2;

public class MyStack {

    //栈的底层我们使用数组来存储
    int[] elements;

    public MyStack() {
        elements = new int[0];
    }

    //压入元素
    public void push(int element) {
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

    public int pop() {
        if (elements.length == 0) {
            throw new RuntimeException("array is empty");
        }
        int[] newArr = new int[elements.length - 1];
        int element = elements[elements.length - 1];
        for (int i = 0; i < elements.length - 1; i++) {
            newArr[i] = elements[i];
        }
        elements = newArr;
        return element;
    }

    public int peek() {
        if (elements.length == 0) {
            throw new RuntimeException("array is empty");
        }
        return elements[elements.length - 1];
    }

    public boolean isEmpty() {
        return elements.length == 0;
    }
}
