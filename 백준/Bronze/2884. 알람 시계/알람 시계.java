import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] readLine = br.readLine().split(" ");

        int H = Integer.parseInt(readLine[0]);
        int M = Integer.parseInt(readLine[1]);

        if ((0 <= H && H < 24) && (0 <= M && M < 60)) {
            if (M < 45) {
                if (H == 0) {
                    System.out.println(23 + " " + (60 + (M - 45)));
                } else {
                    System.out.println((H - 1) + " " + (60 + (M - 45)));
                }
            } else {
                System.out.println(H + " " + (M-45));
            }
        }
    }
}