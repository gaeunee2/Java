import java.util.Scanner;

public class 진법변환2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int rem = (int)(n % b);
            if (rem < 10) {
                sb.append((char)('0' + rem));
            }
            else {
                sb.append((char)('A' + (rem - 10)));
            }
            n /= b;
        }
        System.out.println(sb.reverse().toString());
        sc.close();
    }
}