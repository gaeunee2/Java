import java.util.Scanner;
public class 설탕배달 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fiveCount = n / 5;
        int threeCount = 0;
        while(fiveCount >= 0) {
            if((n - fiveCount * 5) % 3 == 0) {
                threeCount = (n - fiveCount * 5) / 3;
                break;
            }
            fiveCount -= 1;
        }
        if(fiveCount == 0 && threeCount == 0) {
            System.out.println("-1");
        }
        else {
            System.out.println(fiveCount + threeCount);
        }

        sc.close();
    }
}