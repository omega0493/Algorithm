import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String readLine1 = br.readLine();
        String readLine2 = br.readLine();
        int A = Integer.parseInt(readLine1);
        int B = Integer.parseInt(readLine2);

        int total = 0;

        for (int i = 1; i < B + 1; i++) {
            String[] readLine3 = br.readLine().split(" ");

            int C = Integer.parseInt(readLine3[0]);
            int D = Integer.parseInt(readLine3[1]);

                total += C * D;
        }

        if (A == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}