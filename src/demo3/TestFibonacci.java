package demo3;

public class TestFibonacci {

    public static void main(String[] args) {
        System.out.println(print(5));
    }

    public static int print(int i) {
        if (i == 1 || i == 2) {
            return 1;
        } else {
            return print(i - 1) + print(i - 2);
        }
    }
}
