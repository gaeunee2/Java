import java.util.Scanner;
public class 거스름돈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fiveCount = n / 5;
        int twoCount = 0;

        while(fiveCount >= 0) {
            if((n - fiveCount * 5) % 2 == 0) {
                twoCount = (n - fiveCount * 5) / 2;
                break;
            }
            else {
                fiveCount -= 1;
            }
        }
        if(fiveCount == -1) {
            System.out.println("-1");
        }
        else {
            System.out.println(fiveCount + twoCount);
        }

        sc.close();
    }
}