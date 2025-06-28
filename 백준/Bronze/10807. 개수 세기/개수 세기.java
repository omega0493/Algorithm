import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        int count = 0;

        int v = sc.nextInt();

        for (int n : numbers) {
            if (n == v) {
              count++;
            }
        }

        System.out.println(count);

        sc.close(); 


    }
}