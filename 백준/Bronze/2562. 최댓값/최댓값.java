import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[9];
        int count = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 9; i++) {
            numbers[i] = sc.nextInt();

           if(numbers[i] > max) {
               max = numbers[i];
               count = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(count);

        sc.close();
    }
}