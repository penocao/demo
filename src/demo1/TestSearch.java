package demo1;

public class TestSearch {

    public static void main(String[] args) {
        //目标数组
        int[] arr = new int[]{3, 2, 5, 6, 8};
        //目标元素
        int element = 1;
        int index = -1;
        //目标元素所在的下标
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }

        System.out.println("index=" + index);
    }
}
