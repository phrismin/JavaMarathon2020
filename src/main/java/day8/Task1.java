package day8;

public class Task1 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        String str1 = new String();
        for (int i = 0; i <= 20000; i++) {
            str1 += " " + i;
        }
//        System.out.println(str1);
        long end = System.nanoTime();
        System.out.println(end - start);

        start = System.nanoTime();
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            str2.append(i).append(" ");
        }
//        System.out.println(str2);
        end = System.nanoTime();
        System.out.println(end - start);
    }
}
