import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 5;
        int b = 3;
        int count = 0;

        while (n >= 0) {
            if(n % a == 0) {
                count += n / a;
                System.out.println(count);
                return;
            }
            n -= b;
            count++;
        }

        System.out.println(-1);

        sc.close();
    }
}