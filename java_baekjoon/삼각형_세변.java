import java.util.Scanner;
public class 삼각형_세변 {
    public static int max(int a, int b, int c) {
        int max = a;
        if(b > max) {
            max = b;
        }
        if(c > max) {
            max = c;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        while(a != 0 && b != 0 && c != 0) {
            if(max(a, b, c) == a && a >= b + c ||
               max(a, b, c) == b && b >= a + c ||
               max(a, b, c) == c && c >= a + b) {
                System.out.println("Invalid");
            }
            else if(a == b && b == c) {
                System.out.println("Equilateral");
            }
            else if(a == b || b == c || a == c) {
                System.out.println("Isosceles");
            }
            else {
                System.out.println("Scalene");
            }

            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        }

        sc.close();
    }
}