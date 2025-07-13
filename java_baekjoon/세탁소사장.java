import java.util.Scanner;
public class 세탁소사장 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int c = sc.nextInt();

            int q = c / 25;
            c %= 25;
            int d = c / 10;
            c %= 10;
            int n = c / 5;
            c %= 5;
            int p = c / 1;

            System.out.printf("%d %d %d %d\n", q, d, n, p);
        }

        sc.close();
    }
}