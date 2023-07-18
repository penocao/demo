package demo1;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 7, 9, 10};
        int min = 0;
        int max = arr.length - 1;
        int mid = (min + max) / 2;
        int element = 4;
        int index = -1;
        while (min <= max) {
            if (arr[mid] == element) {
                index = mid;
                break;
            } else {
                if (arr[mid] > element) {
                    max = mid - 1;
                } else {
                    min = mid + 1;
                }
                mid = (max + min) / 2;
            }
        }
        System.out.println("index= " + index);
    }
}
