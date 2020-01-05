package demo1;

public class TestArray {
    public static void main(String[] args) {
        //创建一个数组
        int[] arr1 = new int[3];
        //获取数组长度
        int length1 = arr1.length;
        System.out.println(length1);
        //访问数组中的元素：数组名[下标]  注意：下标从0开始，最大可以取到长度-1
        int element0 = arr1[0];
        System.out.println("element0:" + element0);

    }
}
