import java.util.Scanner;
public class 직사각형 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int a = w - x;
        int b = h - y;

        int min = a > b ? b : a;
        if(min < x && min < y) {
            System.out.println(min);
        }
        else {
            System.out.println(x > y ? y : x);
        }

        sc.close();
    }
}