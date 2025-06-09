import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String readLine1 = br.readLine();
        int A = Integer.parseInt(readLine1);

        for (int i = 0; i < A; i++) {
            String[] readLine2 = br.readLine().split(" ");

            int B = Integer.parseInt(readLine2[0]);
            int C = Integer.parseInt(readLine2[1]);

            bw.write("Case #" + (i+1) + ": " + B + " + " + C + " = " + (B + C) + "\n");
        }
        bw.flush();
    }
}