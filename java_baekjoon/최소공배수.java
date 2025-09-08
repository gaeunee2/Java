import java.util.Scanner;
public class 최소공배수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int num = a * b / greatest_common_divisor(a, b);
            System.out.println(num);
        }

        sc.close();
    }

    public static int greatest_common_divisor(int n1, int n2) {
        if(n1 > n2) {
            for(int i = n2; i > 1; i--) {
                if(n1 % i == 0 && n2 % i == 0) {
                    return i;
                }
            }
        }
        else {
            for(int i = n1; i > 1; i--) {
                if(n1 % i == 0 && n2 % i == 0) {
                    return i;
                }
            }
        }
        return 1;
    }
}