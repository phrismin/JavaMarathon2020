package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(170767));
    }

    public static int count7(int n) {
        if (n % 10 == 7) {
            return  1 + count7(n / 10);
        } else if (n > 10) {
            return count7(n / 10);
        } else {
            return 0;
        }
    }
}
