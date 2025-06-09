import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String readLine1 = br.readLine();
        int A = Integer.parseInt(readLine1);

        for (int i = 1; i <= A; i++) {
            for (int j = 0; j < A - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}