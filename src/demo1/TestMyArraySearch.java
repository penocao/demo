package demo1;

import demo1.util.MyArray;

public class TestMyArraySearch {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.addElementToEnd(4);
        myArray.addElementToEnd(5);
        myArray.addElementToEnd(8);
        //调用线性查找
        System.out.println(myArray.search(11));
        //调用二分法查找
        System.out.println(myArray.binarySearch(5));
    }
}
