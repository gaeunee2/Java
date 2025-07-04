import java.util.Scanner;
public class 달팽이는 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();

        int day = (v - b - 1) / (a - b) + 1;

        System.out.println(day);

        sc.close();
    }
}