import java.util.Scanner;

public class 수행시간6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        if(n == 1 || n == 2) {
            System.out.println(0);
            System.out.println(3);
        }
        else {
            int count = 0;
            int i = 2;
            int num = 1;
            while(n - i != 0) {
                count += (n - i) * num;
                i += 1;
                num += 1;
            }
            System.out.println(count);
            System.out.println(3);
        }

        sc.close();
    }
}