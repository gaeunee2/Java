import java.util.Scanner;
public class 최소공배수2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        long num = a * b / greatest_common_divisor(a, b);
        System.out.println(num);

        sc.close();
    }

    public static long greatest_common_divisor(long n1, long n2) {
        if(n1 > n2) {
            for(long i = n2; i > 1; i--) {
                if(n1 % i == 0 && n2 % i == 0) {
                    return i;
                }
            }
        }
        else {
            for(long i = n1; i > 1; i--) {
                if(n1 % i == 0 && n2 % i == 0) {
                    return i;
                }
            }
        }
        return 1;
    }
}