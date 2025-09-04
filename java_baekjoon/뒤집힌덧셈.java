import java.util.Scanner;
public class 뒤집힌덧셈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();

        int rx = reverse(x);
        int ry = reverse(y);

        System.out.println(reverse(rx + ry));

        sc.close();
    }

    public static int reverse(int num) {
        int rev = 0;

        while(num != 0) {
            rev *= 10;
            rev += num % 10;
            num /= 10;
        }
        return rev;
    }
}