import java.io.*;
import java.util.*;

public class Main {
        static int[] a;
    public static void main(String[] args) throws IOException {
                Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        a = new int[n + 1];

        DFS(n);

        System.out.println(a[n]);

    }

    public static int DFS(int n) {

        if (a[0] > 0) return a[n];
        if(n == 0) return a[n] = 0;
        if(n == 1) return a[n] = 1;
        return a[n] = DFS(n-2) + DFS(n-1);
    }
 }