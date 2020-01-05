package demo1;

import java.util.Arrays;

public class TestOpArray {
    public static void main(String[] args) {
//        //解决数组扩容的问题
//        //定义一个数组
//        int[] arr1 = new int[]{1, 2, 3};
//        System.out.println(Arrays.toString(arr1));
//        int[] arr2 = new int[arr1.length + 1];
//        for (int i = 0; i < arr1.length; i++) {
//            arr2[i] = arr1[i];
//        }
//        arr2[arr1.length] = 4;
//        arr1 = arr2;
//        System.out.println(Arrays.toString(arr1));

//        int[] arr1 = new int[]{2, 3, 4};
//        int[] arr2 = new int[arr1.length - 1];
//        int j = 0;
//        for (int i = 0; i < arr1.length; i++) {
//            if (i != 2 && j < arr2.length) {
//                arr2[j] = arr1[i];
//                j++;
//            }
//        }
//        arr1 = arr2;
//        System.out.println(Arrays.toString(arr1));

        int[] array = new int[]{3, 2, 1, 664, 21, 5};
        array = deleteOneElement(array, 2);
        System.out.println(Arrays.toString(array));
        System.out.println(array.toString());
    }

    public static int[] deleteOneElement(int[] array, int index) {
        int[] array2 = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if (i == index) {
                j--;
                continue;
            }
            array2[j] = array[i];
        }

        return array2;
    }

}
