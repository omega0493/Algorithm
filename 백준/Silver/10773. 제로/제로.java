import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();


            if (numbers[i] != 0) {
                list.add(numbers[i]);
            } else {
                list.remove(list.size()-1);
            }
        }

        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        System.out.println(sum);

        sc.close();
    }
}