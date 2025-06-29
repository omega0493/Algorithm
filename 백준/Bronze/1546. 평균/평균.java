import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int max = 0;
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            
            max = Math.max(max, numbers[i]);
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (double) numbers[i] / max * 100;
        }

        System.out.println(sum / n);

        sc.close();
    }
}