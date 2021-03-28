package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8};
        int sum = 0;
        System.out.println(recursionSum(numbers, sum));
    }

    public static int recursionSum(int[] numbers, int sum) {
        if (sum == numbers.length) {
            return 0;
        } else {
            return numbers[sum] + recursionSum(numbers, ++sum);
        }
    }
}