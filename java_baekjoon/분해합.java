import java.util.Scanner;
public class 분해합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int rslt = 0;

        for(int i = Math.max(1, n - 9 * String.valueOf(n).length()); i < n; i++) {
            int sum = i;
            int temp = i;
            while(temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if(sum == n) {
                rslt = i;
                break;
            }
        }
        System.out.println(rslt);

        sc.close();
    }
}