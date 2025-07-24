import java.util.Scanner;
public class 이항계수_팩토리얼 {
    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(factorial(n) / (factorial(r) * factorial(n - r)));

        sc.close();
    }
}