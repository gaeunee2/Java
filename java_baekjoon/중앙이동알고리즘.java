import java.util.Scanner;

public class 중앙이동알고리즘 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int point = (int) Math.pow(2, n) + 1;
        System.out.println(point * point);

        sc.close();
    }
}