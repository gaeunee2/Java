import java.util.Scanner;
public class 벌집 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int rslt = 1;
        int num = 1;
        int a = 1;
        while(num <= n) {
            num += 6 * a;
            a += 1;
            rslt += 1;
        }
        System.out.println(rslt);

        sc.close();
    }
}