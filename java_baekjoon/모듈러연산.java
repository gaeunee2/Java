import java.util.Scanner;
public class 모듈러연산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        String s = sc.next();
        sc.close();

        final long MOD = 1234567891L;
        long sum = 0;
        long p = 1;

        for (int i = 0; i < L; i++) {
            int val = s.charAt(i) - 'a' + 1;
            sum = (sum + (val * p) % MOD) % MOD;
            p = (p * 31) % MOD;
        }
        System.out.println(sum % MOD);
    }
}