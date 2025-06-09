import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String readLine1 = br.readLine();
        int A = Integer.parseInt(readLine1);

        for (int i = 0; i < A; i++) {
            String[] readLine2 = br.readLine().split(" ");

            int B = Integer.parseInt(readLine2[0]);
            int C = Integer.parseInt(readLine2[1]);

            System.out.println(B + C);
        }
    }
}