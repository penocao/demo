package demo1.util;

import java.util.Arrays;

public class MyArray {

    //用于存储数据的数组
    private int[] elements;

    public MyArray() {
        elements = new int[0];
    }

    //获取数组长度的方法
    public int size() {
        return elements.length;
    }

    /**
     * 添加一个元素
     *
     * @param element 元素
     */
    public void addElementToEnd(int element) {
        //创建一个新的数组
        int[] array = new int[elements.length + 1];
        //把原数组中的元素复制到新数组中
        for (int i = 0; i < elements.length; i++) {
            array[i] = elements[i];
        }
        //把添加的元素放入新数组中
        array[elements.length] = element;
        elements = array;
    }

    /**
     * 打印数组元素
     */
    public void show() {
        System.out.println(Arrays.toString(elements));
    }

    /**
     * 删除数组中的元素
     *
     * @param index 下标
     */
    public void delete(int index) {
        if (index < 0 || index >= elements.length) {
            throw new RuntimeException("下标越界");
        }
        //创建一个数组，长度为原数组的长度-1
        int[] array = new int[elements.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (i < index) {
                array[i] = elements[i];
            } else {
                array[i] = elements[i + 1];
            }
        }
        elements = array;
    }

    public int getElement(int index) {
        return elements[index];
    }

    public void addElement(int index, int element) {
        if (index < 0 || index > elements.length) {
            throw new RuntimeException("下标越界");
        } else {
            int[] array = new int[elements.length + 1];
            for (int i = 0; i < array.length; i++) {
                if (i < index) {
                    array[i] = elements[i];
                } else if (i == index) {
                    array[i] = element;
                } else {
                    array[i] = elements[i - 1];
                }
            }
            elements = array;
        }

    }

    public void addElement2(int index, int element) {
        int[] array = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            if (i < index) {
                array[i] = elements[i];
            } else {
                array[i + 1] = elements[i];
            }
        }
        array[index] = element;
        elements = array;
    }

    //线性查找
    public int search(int target) {
        for (int i = 0; i < elements.length; i++) {
            if (target == elements[i]) {
                return i;
            }
        }
        return -1;
    }

    //二分查找
    public int binarySearch(int target) {
        int min = 0;
        int max = elements.length - 1;
        int mid = (min + max) / 2;
        int index = -1;
        while (min <= max) {
            if (elements[mid] == target) {
                index = mid;
                break;
            } else {
                if (elements[mid] > target) {
                    max = mid - 1;
                } else {
                    min = mid + 1;
                }
                mid = (max + min) / 2;
            }
        }
        return index;
    }
}
