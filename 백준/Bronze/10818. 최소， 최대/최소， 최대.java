import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();

            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }

        System.out.print(min + " " + max);

        sc.close();
    }
}