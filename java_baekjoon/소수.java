import java.util.Scanner;
public class 소수 {
    public static int is_Prime(int num) {
        if(num == 1) {
            return 0;
        }
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return 0;
            }
        }
        return 1;    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int sum = 0;
        int min = 0;
        int found = 1;
        for(int i = m; i <= n; i++) {
            if(is_Prime(i) == 1) {
                sum += i;
                if(found == 1) {
                    min = i;
                    found = 0;
                }
            }
        }
        if(sum == 0) {
            System.out.println("-1");
        }
        else {
            System.out.println(sum);
            System.out.println(min);
        }

        sc.close();
    }
}