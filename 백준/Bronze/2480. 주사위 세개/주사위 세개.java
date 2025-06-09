import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] readLine = br.readLine().split(" ");

        int A = Integer.parseInt(readLine[0]);
        int B = Integer.parseInt(readLine[1]);
        int C = Integer.parseInt(readLine[2]);

        if (A == B && A == C) {
            System.out.println(10000 + A * 1000);
        } else if ((A == B && A != C) || (A == C && A != B) || (B == C && A != B)) {
            if (A == B) {
                System.out.println(1000 + A * 100);
            } else if (A == C) {
                System.out.println(1000 + A * 100);
            } else {
                System.out.println(1000 + B * 100);
            }
        } else if (A != B && A != C && B != C) {
            int max = Math.max(A, Math.max(B, C));

            System.out.println(100 * max);
        }
    }
}