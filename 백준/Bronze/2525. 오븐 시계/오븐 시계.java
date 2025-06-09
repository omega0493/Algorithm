import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] readLine = br.readLine().split(" ");
        String readLine2 = br.readLine();

        int A = Integer.parseInt(readLine[0]);
        int B = Integer.parseInt(readLine[1]);
        int C = Integer.parseInt(readLine2);

        int totalMinutes = B + C;

        int finalMinutes = totalMinutes % 60;
        int finalHours = (A + totalMinutes / 60) % 24;

        System.out.println(finalHours + " " + finalMinutes);
    }
}