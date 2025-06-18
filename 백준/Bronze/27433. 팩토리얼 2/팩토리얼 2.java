import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int s = Integer.parseInt(sc.nextLine());

        long result = 1;

            for (int i = 1; i <= s; i++) {
                result *= i;
            }
        System.out.println(result);
    }
}