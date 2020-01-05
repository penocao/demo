package demo1;

import demo1.util.MyArray;

public class TestMyArray {

    public static void main(String[] args) {
        //创建一个可变数组
        MyArray myArray = new MyArray();
        //创建长度
        int size = myArray.size();
        System.out.println(size);
        myArray.show();
        myArray.addElementToEnd(4);
        myArray.addElementToEnd(5);
        myArray.addElementToEnd(6);
        myArray.show();
        myArray.addElement2(4, 3);
//        myArray.delete(2);
        myArray.show();
//        int element = myArray.getElement(1);
//        System.out.println(element);

    }
}
