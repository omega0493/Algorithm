import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String readLine1 = br.readLine();
        String readLine2 = br.readLine();

        int x = Integer.parseInt(readLine1);
        int y = Integer.parseInt(readLine2);

        if(x < 0 && y < 0) {
            System.out.println("3");
        } else if (x < 0 && y > 0) {
            System.out.println("2");
        } else if (x > 0 && y > 0) {
            System.out.println("1");
        } else if (x > 0 && y < 0) {
            System.out.println("4");
        }

    }
}