import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String readLine1 = br.readLine();
        int A = Integer.parseInt(readLine1);

        int B = A / 4;

        StringBuilder AString = new StringBuilder();

        for (int i = 0; i < B; i++) {
            AString.append("long").append(" ");
        }

        AString.append("int");

        System.out.println(AString);
    }
}